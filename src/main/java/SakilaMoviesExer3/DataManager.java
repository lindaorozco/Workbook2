package SakilaMoviesExer3;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

    public static List<Actor> getAllActors(BasicDataSource dataSource){
        List<Actor> actorsList = new ArrayList<>();

        try(Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("Select actor_id, first_name,last_name FROM actor")){

            try (ResultSet resultSet = ps.executeQuery()){
                while(resultSet.next()){

                    // build object of actor
                    Actor actor= new Actor(resultSet.getInt("actor_id"),
                            resultSet.getString("first_name"), resultSet.getString("last_name"));
                    actorsList.add(actor);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return actorsList;
    }
}
