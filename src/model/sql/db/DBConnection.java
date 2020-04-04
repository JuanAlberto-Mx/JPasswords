package model.sql.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class DBConnection {

    private String host;
    private String user;
    private String password;
    private Connection connection;

    public DBConnection() {
        host = "jdbc:postgresql://localhost:5432/dbPasswords";
        user = "postgres";
        password = "postgres";
    }  

    public Connection connect() throws SQLException {
        try {            
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(host, user, password);

            if (connection != null) {
                System.out.println("Connected to database");
            }
            else {
                System.out.println("Connection failed");
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }

    public void disconnect() {
        try {
            if (connection != null) {
                connection.close();
            }
        }
        catch (SQLException e) {
        }
    }
    
    public void finalize() {
        try {
            connection.close();
            connection = null;
        }
        catch(SQLException e) {            
        }        
    }
    
    public synchronized boolean executeCommand(String command) throws Exception {
        boolean result = false;
        Statement statement = null;
        
        try {            
            statement = connection.createStatement();
            
            result = statement.execute(command);
        }
        catch(SQLException e) {
            connection.rollback();
            throw e;
        }
        finally {
            statement.close();
            statement = null;
        }
        
        return result;
    }
    
    public synchronized ResultSet executeQuery(String query) throws Exception {
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch(SQLException e) {
            connection.rollback();
            throw e;
        }
        finally {
            if(resultSet != null) {
                resultSet.close();
                statement.close();
            }
            
            resultSet = null;
            statement = null;
        }
        
        return resultSet;
    }

    public static void main(String... args) {
        DBConnection db = new DBConnection();
        try {
            db.connect();
            db.disconnect();
        }
        catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}