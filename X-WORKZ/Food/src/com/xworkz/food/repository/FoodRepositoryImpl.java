package com.xworkz.food.repository;

import com.xworkz.food.constant.DBConstant;
import com.xworkz.food.dto.FoodDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FoodRepositoryImpl implements FoodRepository{
    @Override
    public String save(FoodDTO foodDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/airlinedb";
            String username="root";
            String password="Xworkzodc@123";

            Connection connection= DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());
            System.out.println("Connection established");

            String sql="insert into food_details values('0','"+foodDTO.getFoodId()+"','"+foodDTO.getName()+"','"+foodDTO.getDescription()+"','"+foodDTO.getCategory()+"','"+foodDTO.getPrice()+"','"+foodDTO.isAvailability()+"','"+foodDTO.isType()+"')";
            Statement statement=connection.createStatement();

            String noConcatSql="insert into food_details values(?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement=connection.prepareStatement(noConcatSql);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2, foodDTO.getName());
            preparedStatement.setString(3, foodDTO.getDescription());
            preparedStatement.setString(4, foodDTO.getCategory());
            preparedStatement.setDouble(5,foodDTO.getPrice());
            preparedStatement.setBoolean(6, foodDTO.isAvailability());
            preparedStatement.setBoolean(7, foodDTO.isType());
            preparedStatement.executeUpdate();

            System.out.println("Connection:"+connection);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "false";
    }

    @Override
    public List<FoodDTO> getData() {
        List<FoodDTO>foodList=new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());

            String query="SELECT * FROM food_details";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                int foodId=resultSet.getInt("foodId");
                String name=resultSet.getString("name");
                String description=resultSet.getString("description");
                String category=resultSet.getString("category");
                double price=resultSet.getDouble("price");
                boolean availability=resultSet.getBoolean("availability");
                boolean type=resultSet.getBoolean("type");

                FoodDTO foodDTO=new FoodDTO(foodId,name,description,category,price,availability,type);
                foodList.add(foodDTO);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return foodList;
    }
}
