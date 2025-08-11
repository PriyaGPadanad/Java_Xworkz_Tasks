package com.xworkz.airlines.repository;

import com.xworkz.airlines.constant.DBConstant;
import com.xworkz.airlines.dto.AirlinesDTO;


import java.sql.*;

public class AirlinesRepositoryImp implements AirlinesRepository {
    @Override
    public String save(AirlinesDTO airlinesDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/airlinedb";
            String username="root";
            String password="Xworkzodc@123";

            //create a connection
            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());

            System.out.println("Connection established");


            //prepare the statement
            //String sql = "insert into airlinedetails values('0','" + airlinesDTO.getName() + "','" +
//                    airlinesDTO.getSource() + "','" + airlinesDTO.getDestination() + "','" +
//                    airlinesDTO.getFlightCode() + "','" + airlinesDTO.getClassType() + "','" +
//                    airlinesDTO.getMealType() + "','" + airlinesDTO.getInternational() + "')";
//
//            Statement statement = connection.createStatement();
            //Execute the Statement
            // statement.executeUpdate(sql);

            String noConcatSql = "insert into airlinedetails values(?,?,?,?,?,?,?,?)";

            //pre-compiled
            PreparedStatement preparedStatement = connection.prepareStatement(noConcatSql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, airlinesDTO.getName());
            preparedStatement.setString(3, airlinesDTO.getSource());
            preparedStatement.setString(4, airlinesDTO.getDestination());
            preparedStatement.setString(5, airlinesDTO.getFlightCode());
            preparedStatement.setString(6, airlinesDTO.getClassType());
            preparedStatement.setString(7, airlinesDTO.getMealType());
            preparedStatement.setString(8, airlinesDTO.getInternational());

            preparedStatement.executeUpdate();

            System.out.println("Connection:" + connection);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "false";
    }


    @Override
    public AirlinesDTO findById(int id) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/airlinedb";
//            String username = "root";
//            String password = "Xworkzodc@123";


            //create a connection
            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());


            String sql = "select * from airlinedetails where id= " + id + " ";
            System.out.println("SQL:" + sql);

            Statement statement = connection.createStatement();
            System.out.println(connection);


            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("resultSet:" + resultSet);

            while (resultSet.next()) {

                int pk = resultSet.getInt("id");
                String name = resultSet.getString("airlinename");
                String source = resultSet.getString("source");
                String destination = resultSet.getString("destination");
                String flightCode = resultSet.getString("flightCode");
                String classType = resultSet.getString("classType");
                String mealType = resultSet.getString("mealType");
                String international = resultSet.getString("international");


                AirlinesDTO airlinesDTO = new AirlinesDTO( name, source, destination, flightCode, classType, mealType, international);
                airlinesDTO.setId(pk);

                System.out.println(airlinesDTO);

                System.out.println("name:" + name + "source:"+source+ "destination:"+destination+ "flightCode:"+flightCode+"classType:"+classType+"mealType:"+mealType+"international"+international);

                return airlinesDTO;
            }


        } catch (ClassNotFoundException  | SQLException e) {
            throw new RuntimeException(e);

        }
        return null;
    }
}