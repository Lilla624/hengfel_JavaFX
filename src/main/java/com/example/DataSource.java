package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {
  private static final String URL = "jdbc:sqlite:henger.sqlite";
    private static Connection connection;
  public static Connection getConnection() {
    if (connection == null) {
      try {
          connection = DriverManager.getConnection(URL);
          System.out.println("Sikeres adatbázis kapcsolat!");
      } catch (SQLException e) {
          System.out.println("Kapcsolódási hiba: " + e.getMessage());
      }
  }
  return connection;
  }
}

