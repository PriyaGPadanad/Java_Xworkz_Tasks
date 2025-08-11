package com.xworkz.general.repository;

        import com.xworkz.general.dto.BirthCertificateDTO;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;

public class BirthRepositoryImpl implements BirthRepository{
    @Override
    public String save(BirthCertificateDTO birthDTO) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="mysql://localhost:3306/birthdb";
            String username="root";
            String password="Xworkzodc@123";

            //create a connection
            Connection connection = DriverManager.getConnection(url,username,password);
            BirthCertificateDTO birthCertificateDTO=new BirthCertificateDTO();
            //prepare a statement


            String sql="insert into birthdetails values(0,'"+birthCertificateDTO.getBirthId()+"',"+birthCertificateDTO.getHospitalName()+"','"+birthCertificateDTO.getFatherName()+"','"+birthCertificateDTO.getMotherName()+"', '"+birthCertificateDTO.getDateTime()+"','"+birthCertificateDTO.getDoctorName()+"','"+birthCertificateDTO.getNurseName()+"','"+birthCertificateDTO.getHospitalType()+"')";


            Statement statement = connection.createStatement();

            //Execute the statement

            statement.executeUpdate(sql);
            System.out.println(connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "false";
    }

}
