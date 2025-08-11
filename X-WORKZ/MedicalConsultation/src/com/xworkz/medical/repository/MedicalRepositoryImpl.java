package com.xworkz.medical.repository;

import com.xworkz.medical.constant.DBConstant;
import com.xworkz.medical.dto.MedicalDTO;

import java.sql.*;

public class MedicalRepositoryImpl implements MedicalRepository{
    @Override
    public String save(MedicalDTO medicalDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/airlinedb";
            String username="root";
            String password="Xworkzodc@123";

            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());
            System.out.println("Connection established");

            String sql="insert into medicaldetails values('0','"+medicalDTO.getName()+"','"+medicalDTO.getEmail()+"','"+medicalDTO.getAge()+"','"+medicalDTO.getGender()+"','"+medicalDTO.getContactNumber()+"','"+medicalDTO.getConsultationMode()+"')";
            Statement statement = connection.createStatement();

            String noConcatSql = "insert into medicaldetails values(?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(noConcatSql);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,medicalDTO.getName());
            preparedStatement.setString(3,medicalDTO.getEmail());
            preparedStatement.setInt(4,medicalDTO.getAge());
            preparedStatement.setString(5,medicalDTO.getGender());
            preparedStatement.setString(6,medicalDTO.getContactNumber());
            preparedStatement.setString(7,medicalDTO.getConsultationMode());
            preparedStatement.executeUpdate();

            System.out.println("Connection:" + connection);



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "false";
    }
    @Override
    public MedicalDTO getdata() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    DBConstant.URL.getProp(),
                    DBConstant.USERNAME.getProp(),
                    DBConstant.SECRET.getProp()
            );

            String query = "SELECT * FROM medicaldetails ";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String contact = rs.getString("contactNumber");
                String mode = rs.getString("consultationMode");

                return new MedicalDTO(name, email, age, gender, contact, mode);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }



}
