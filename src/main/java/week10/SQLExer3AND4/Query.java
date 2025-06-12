package week10.SQLExer3AND4;

import java.sql.*;

public class Query {

    public static void displayProducts(String url, String username, String password) {

        try(Connection connection = DriverManager.getConnection(url, username, password );
            PreparedStatement ps = connection.prepareStatement("SELECT CompanyName, ContactName, City, Country, Phone FROM northwind.customers \n" +
                    "ORDER BY Country;")){
            try (ResultSet resultSet = ps.executeQuery()){
                while (resultSet.next()){

                    System.out.printf("""
                            --------------------------
                            Company name: %s
                            Contact name: %s
                            City: %s
                            Country: %s
                            Phone: %s\n""",
                            resultSet.getString("CompanyName"),
                            resultSet.getString("ContactName"),
                            resultSet.getString("City"),
                            resultSet.getString("Country"),
                            resultSet.getString("Phone"));
                }

            }

        } catch (SQLException e) {
           e.printStackTrace();
        }
    }

    public static void displayAllCategories(String url, String username,String password) {

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = connection.prepareStatement("SELECT CategoryID, CategoryName FROM northwind.categories\n" +
                     "ORDER BY CategoryID;")) {
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {

                    System.out.printf("""
                                    --------------------------
                                    Category ID: %s
                                    Category Name: %s
                                    City: %s
                                    Country: %s
                                    Phone: %s\n""",
                            resultSet.getString("CategoryID"),
                            resultSet.getString("CategoryName"),
                            resultSet.getString("City"),
                            resultSet.getString("Country"),
                            resultSet.getString("Phone"));
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}