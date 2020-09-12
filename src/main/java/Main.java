import Models.Actor;
import Models.ActorsList;
import Models.Film;
import Models.Rating;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException{

//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "1111");
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            ArrayList<Actor> actors = new ArrayList<>();
//            while (resultSet.next()) {
//                int actor_id = resultSet.getInt("actor_id");
//                String first_name = resultSet.getString("first_name");
//                String last_name = resultSet.getString("last_name");
//                String last_update = resultSet.getString("last_update");
//               actors.add(new Actor(actor_id, first_name, last_name, last_update));
//            }
//
//        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into actor(first_name, last_name) values ('asd', 'qwe') ");
//            preparedStatement1.executeUpdate();
//
//        PreparedStatement insert = connection.prepareStatement("insert into actor(first_name, last_name) values (?,?)");
//        insert.setString(1, "Rue");
//        insert.setString(2, "Hehel");
//        insert.executeUpdate();
//
//        connection.close();
//        actors.stream().forEach(actor -> System.out.println(actor));



//        ArrayList<Actor> actors = new ArrayList<>();
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "1111");
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()) {
//            int actor_id = resultSet.getInt("actor_id");
//            String first_name = resultSet.getString("first_name");
//            String last_name = resultSet.getString("last_name");
//            String last_update = resultSet.getString("last_update");
//            actors.add(new Actor(actor_id, first_name, last_name, last_update));
//        }
//
//
//        connection.close();
//
//        Methods methods = new Methods();
//        for (Actor actor : actors) {
//            ArrayList<Film> movies = methods.getMovies(actor.getActor_id());
//            actor.setFilms(movies);
//        }
//        System.out.println(actors.get(0).getFilms().size());
        ActorsList actorsList = new ActorsList(new DataBase().connect());
        actorsList.getActor(20);
        System.out.println(actorsList.getList());
        actorsList.insertActor(new Actor(1, "xxx", "yyy", null));
//        actorsList.updateActor(205, "john", "doe");
//        actorsList.deleteActor(206);
//        actorsList.deleteActor(199);

    }
    
    
}
