package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {
    public static void createHenger(Henger henger) {
    try {
      tryCreateHenger(henger);
    } catch (SQLException e) {
      System.err.println("Hiba! Új adat felvétele sikeretelen!");
      System.err.println(e.getMessage());
    }
  }
  public static void tryCreateHenger(Henger henger) throws SQLException {
    final String DB_URL = "jdbc:sqlite:henger.sqlite";
    Connection conn = DriverManager.getConnection(DB_URL);

    String sql = "INSERT INTO henger " + 
    "(radius, length, surface) VALUES " + 
    "(?, ?, ?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setDouble(1,henger.radius);
    ps.setDouble(2, henger.length);
    ps.setDouble(3, henger.surface);
    ps.execute();
    
  }
}

