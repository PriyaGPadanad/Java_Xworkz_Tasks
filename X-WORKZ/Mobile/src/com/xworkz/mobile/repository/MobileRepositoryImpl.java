package com.xworkz.mobile.repository;

import com.xworkz.mobile.constant.DBConstant;
import com.xworkz.mobile.dto.MobileDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MobileRepositoryImpl implements MobileRepository {


    @Override
    public String save(MobileDTO mobileDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/airlinedb";
            String username = "root";
            String password = "Xworkzodc@123";

            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());
            System.out.println("Connection established");

            String sql = "insert into mobiledetails values('0','" + mobileDTO.getMobileId() + "','" + mobileDTO.getModel() + "','" + mobileDTO.getBrand() + "','" + mobileDTO.getOperatingSystem() + "','" + mobileDTO.getStorageCapacity() + "','" + mobileDTO.getRamSize() + "','" + mobileDTO.getPrice() + "','" + mobileDTO.getRating() + "')";
            Statement statement = connection.createStatement();

            String noConcatSql = "insert into mobiledetails values(?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(noConcatSql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setInt(2, mobileDTO.getMobileId());
            preparedStatement.setString(3, mobileDTO.getModel());
            preparedStatement.setString(4, mobileDTO.getBrand());
            preparedStatement.setString(5, mobileDTO.getOperatingSystem());
            preparedStatement.setInt(6, mobileDTO.getRamSize());
            preparedStatement.setInt(7, mobileDTO.getStorageCapacity());
            preparedStatement.setDouble(8, mobileDTO.getPrice());
            preparedStatement.setFloat(9, mobileDTO.getRating());
            preparedStatement.executeUpdate();

            System.out.println("Connection:" + connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "false";
    }

    @Override
    public List<MobileDTO> getData() {
        List<MobileDTO> mobileList = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());

            String query = "SELECT * FROM mobiledetails";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int mobileId = resultSet.getInt("mobileId");
                String model = resultSet.getString("model");
                String brand = resultSet.getString("brand");
                String operatingSystem = resultSet.getString("operatingSystem");
                int ramSize = resultSet.getInt("ramSize");
                int storageCapacity = resultSet.getInt("storageCapacity");
                double price = resultSet.getDouble("price");
                float rating = resultSet.getFloat("rating");

                MobileDTO mobileDTO = new MobileDTO(mobileId, model, brand, operatingSystem, ramSize, storageCapacity, price, rating);
                mobileList.add(mobileDTO);
            }

            // Always close your resources
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return mobileList;
    }

}