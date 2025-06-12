//package Sakila;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class DatabaseQuery {
//    public static void displayAllActorsLastName(BasicDataSource dataSource) {
//
//        try (Connection connection = dataSource.getConnection();
//             PreparedStatement ps = connection.prepareStatement(
//                     "SELECT first_name, last_name FROM actor" +
//                             " WHERE last_name LIKE ? ")){
//             ps.setString(1,getUserInput());
//             try(ResultSet resultSet = ps.executeQuery()){
//
//                 if (resultSet.next()){
//                     System.out.println("Your matches are: \n");
//                     do {
//                         System.out.printf("""
//                             -----------------------
//                             Actor:
//                             First name: %s
//                             Last name: %s
//
//                             """,
//                                 resultSet.getString("first_name"),
//                                 resultSet.getString("last_name"));
//
//                     }while(resultSet.next());
//
//                 }else {
//                     System.out.println("No matches found");
//
//                }
//             }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//    public static String getUserInput(){
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine().trim();
//
//    }
//
//    public static void moviesByActorName(BasicDataSource dataSource){
//        try (Connection connection = dataSource.getConnection();
//             PreparedStatement ps = connection.prepareStatement(
//                     "SELECT title FROM actor AS a \n" +
//                             "JOIN film_actor ON a.actor_id = film_actor.actor_id\n" +
//                             "JOIN film ON film_actor.film_id = film.film_id\n" +
//                             " WHERE last_name = ? AND first_name = ?")){
//            ps.setInt(1, getActorId(dataSource));
//            try(ResultSet resultSet = ps.executeQuery()){
//
//                if (resultSet.next()){
//                    System.out.println("Your matches are: \n");
//                    do {
//                        System.out.printf("""
//                             -----------------------
//                             Actor: %s %s
//                             %s""",
//                                resultSet.getString("first_name"),
//                                resultSet.getString("last_name"),
//                                resultSet.getString("title"));
//
//                    }while(resultSet.next());
//
//                }else {
//                    System.out.println("No matches found");
//
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//    // LONG WAY
//    public static int getActorId(BasicDataSource dataSource){
//        try (Connection connection = dataSource.getConnection();
//             PreparedStatement ps = connection.prepareStatement(
//                     "SELECT actor_id FROM actor AS a \n" +
//                             " WHERE last_name = ? AND first_name = ?")) {
//            System.out.println("Enter first name");
//            System.out.println("Enter last name");
//            ps.setInt(1, "%" + getUserInput() + "%");
//            ps.setString(2, getUserInput() + "%");
//
//    } catch (NumberFormatException e){
//            e.printStackTrace();
//
//        }
//
//        return 0;
//    }
//}
