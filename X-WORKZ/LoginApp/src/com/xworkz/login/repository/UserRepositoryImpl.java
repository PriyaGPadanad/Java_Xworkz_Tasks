package com.xworkz.login.repository;

import com.xworkz.login.constant.DBConstant;
import com.xworkz.login.dto.UserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepositoryImpl implements UserRepository{


    @Override
    public String save(UserDTO dto) {


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());

            String noConcatenateSql="insert into user_details(email,userId,password)VALUES(?, ?, ?)";

            PreparedStatement preparedStatement=connection.prepareStatement(noConcatenateSql);

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2, dto.getEmail());
            preparedStatement.setString(3, dto.getUserId());
            preparedStatement.setString(4, dto.getPassword());

            preparedStatement.executeUpdate();

            System.out.println(connection);


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "false";
    }
}
