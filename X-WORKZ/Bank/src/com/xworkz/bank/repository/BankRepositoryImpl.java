package com.xworkz.bank.repository;

import com.xworkz.bank.dto.BankDTO;

import java.sql.*;

public class BankRepositoryImpl implements BankRepository {
    @Override
    public String save(BankDTO bankDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/airlinedb";
            String username = "root";
            String password = "Xworkzodc@123";

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully!");

            String query = "INSERT INTO bank_table (name, accno) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, bankDTO.getName());
            preparedStatement.setString(2, bankDTO.getAccno());


            int rowsAffected = preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

            return rowsAffected > 0 ? "Data saved successfully" : "Data not saved";
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return "Failed to save data: " + e.getMessage();
        }
    }
}
