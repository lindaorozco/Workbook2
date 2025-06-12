package SakilaMoviesExer3;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.xml.crypto.Data;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2){
            System.out.println("Need two args");

        }

        String username = args [0];
        String password = args [1];

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");

        List<Actor> actorsList = DataManager.getAllActors(dataSource);

        for(Actor actor : actorsList){
            System.out.println("Actor ID: " + actor.getActorId() + " " + actor.getFirstName() + " " + actor.getLastName());
        }
    }

}
