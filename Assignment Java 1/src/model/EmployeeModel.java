package model;

import entity.employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class EmployeeModel {
    private Connection connection;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection =
                    DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/human_resource?user=root&password=");
        }
    }

    public boolean login() {
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://http://localhost:8080/human_resource?user=root&password=");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean register(String name, String address, String email, String account, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/human_resource?user=root&password=");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into employees (name,address,email,account,password) values (?,?,?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, account);
            preparedStatement.setString(5, password);
            preparedStatement.execute();
            connection.close();
            return true;
        } catch (Exception ex) {
            System.out.println("co loi xay ra");
        }
        return false;

    }

    public boolean checkExistAccountAndPass(String account,String password) {
        try {
            initConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("select * from employees where account = ? && password = ?");
            preparedStatement.setString(1, account);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                String name = rs.getString("account");
                return true;
            }
            return false;
        } catch (Exception ex) {
            System.out.println("loi");
            ex.printStackTrace();
        }
        return false;
    }

    public void getProfileUser (String account) {
        try {
            initConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("select * from employees where account = ?");

            preparedStatement.setString(1, account);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                System.out.println("Thong tin user: " + name + "/" + email + "/" + address);
            }
        } catch (Exception ex) {

        }
    }
    public boolean checkExistPass(String pass) {
        try {
            initConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("select * from employees where password = ?");
            preparedStatement.setString(1, pass);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name = rs.getString(1);
            }
            return true;
        } catch (Exception ex) {
            System.out.println("loi");
            ex.printStackTrace();
        }
        return false;
    }

    public employees login(String account, String password) {
        try {
            initConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("select * from employees where account = ? and password = ?");
            preparedStatement.setString(1, account);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();


        } catch (Exception ex) {
        }
        return null;
    }

}