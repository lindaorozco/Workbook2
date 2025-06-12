//package week10;
//
//
//import java.sql.*;
//
//public class ConnectingDB {
//
//    public static void main(String[] args) { throws SQLException {
//          if (args.length !=2){
//              System.out.println("Two parms");
//              System.exit(1);
//          }
//          String username = args[0];
//          String pw = args[1];
//
//        // create try catch
//        try {
//            // Get connection
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup2025");
//            // create statement and run it
//            PreparedStatement ps = connection.prepareStatement("Select CategoryID FROM northwind.categories\n" + "WHERE CategoryName LIKE ?";
//            // create query
//            ps.setString(1,);
//            ResultSet rs = ps.executeQuery(query);
//
//            // process results
//            while (rs.next()){
//                System.out. println(rs.getString("ProductName"));
//            }
//            connection.close();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//}
