package com.xworkz.student.repository;

import com.xworkz.student.constant.DBConstant;
import com.xworkz.student.dto.StudentDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

    @Override
    public String save(StudentDTO studentDTO) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/airlinedb";
                String username="root";
                String password="Xworkzodc@123";

                Connection connection= DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());
                System.out.println("Connection established");

                String sql="insert into student_details values('0','"+studentDTO.getStudentId()+"','"+studentDTO.getName()+"','"+studentDTO.getEmail()+"','"+studentDTO.getPhoneNumber()+"',"+studentDTO.getGender()+"','"+studentDTO.getCourse()+"',"+studentDTO.getDepartment()+"',"+studentDTO.getYear()+"')";
                Statement statement=connection.createStatement();

                String noConcatSql="insert into student_details values(?,?,?,?,?,?,?,?)";

                PreparedStatement preparedStatement=connection.prepareStatement(noConcatSql);
                preparedStatement.setInt(1,0);
                preparedStatement.setInt(2,studentDTO.getStudentId());
                preparedStatement.setString(3, studentDTO.getName());
                preparedStatement.setString(4, studentDTO.getEmail());
                preparedStatement.setString(5, studentDTO.getPhoneNumber());
                preparedStatement.setString(5, studentDTO.getGender());
                preparedStatement.setString(6, studentDTO.getCourse());
                preparedStatement.setString(7,studentDTO.getDepartment());
                preparedStatement.setInt(8,studentDTO.getYear());
                preparedStatement.executeUpdate();

                System.out.println("Connection:"+connection);

            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return "false";
            }
            @Override
            public List<StudentDTO> getData(){
             List<StudentDTO> studentList =new ArrayList<>();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());

                    String query = "SELECT * FROM student_details";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    ResultSet resultSet = preparedStatement.executeQuery();

                    while (resultSet.next()) {
                        int studentId = resultSet.getInt("studentId");
                        String name = resultSet.getString("name");
                        String email = resultSet.getString("email");
                        String phoneNumber = resultSet.getString("phoneNumber");
                        String gender = resultSet.getString("gender");
                        String course = resultSet.getString("course");
                        String department = resultSet.getString("department");
                        int year = resultSet.getInt("year");

                        StudentDTO studentDTO = new StudentDTO(studentId, name, email, phoneNumber, gender, course, department, year);
                        studentList.add(studentDTO);
                    }
                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    throw new RuntimeException(e);
                }

                return studentList;
    }
}
