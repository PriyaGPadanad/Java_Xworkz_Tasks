package com.xworkz.priya.repository;

import com.xworkz.priya.dto.PriyaDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PriyaRepositoryImpl implements PriyaRepository {
    @Override
    public void save(PriyaDTO priyaDTO) {
        System.out.println("Repository is connected");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/birthdb";
            String username="root";
            String password="Xworkzodc@123";

            Connection connection=DriverManager.getConnection(url,username,password);



            String sql="insert into registrationdetails values(0,'"+priyaDTO.getName()+"',"+priyaDTO.getAge()+",'"+priyaDTO.getPhoneNumber()+"','"+priyaDTO.getEmail()+"','"+priyaDTO.getAddress()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
