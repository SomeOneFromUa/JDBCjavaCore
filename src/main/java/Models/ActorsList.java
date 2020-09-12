package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

public class ActorsList {
    private HashSet<Actor> list = new HashSet<>();
    private Connection connection;

    public ActorsList(Connection connection) {
        this.connection = connection;
    }
    public void getActor(int id) throws SQLException {
        PreparedStatement preparedStatement = this.connection.prepareStatement("select  * from actor where actor_id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int actor_id = resultSet.getInt("actor_id");
            String first_name = resultSet.getString("first_name");
            String last_name = resultSet.getString("last_name");
            String last_update = resultSet.getString("last_update");
            list.add(new Actor(actor_id, first_name, last_name, last_update));
        }
    }

    public void insertActor (Actor actor) throws SQLException {
        PreparedStatement preparedStatement = this.connection.prepareStatement(" insert into actor(first_name, last_name) values (?, ?)");
        preparedStatement.setString(1, actor.getFirst_name());
        preparedStatement.setString(2, actor.getLast_name());
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
    }

    public void updateActor (int id, String first_name, String last_name) throws SQLException {
        PreparedStatement preparedStatement = this.connection.prepareStatement("update actor set first_name = ?, last_name = ? where actor_id = ?");
        preparedStatement.setString(1, first_name);
        preparedStatement.setString(2, last_name);
        preparedStatement.setInt(3, id);
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
    }
    public void deleteActor (int id) throws SQLException {
        PreparedStatement preparedStatement = this.connection.prepareStatement("delete from film_actor where film_actor.actor_id = ?");
        preparedStatement.setInt(1, id);
        int i = preparedStatement.executeUpdate();
        PreparedStatement preparedStatement2 = this.connection.prepareStatement("delete from actor where actor_id = ?");
        preparedStatement2.setInt(1, id);
        int y = preparedStatement2.executeUpdate();
        System.out.println(i);
        System.out.println(y);
    }

    public void getAllActor () throws SQLException {
        PreparedStatement preparedStatement = this.connection.prepareStatement("select * from actor");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int actor_id = resultSet.getInt("actor_id");
            String first_name = resultSet.getString("first_name");
            String last_name = resultSet.getString("last_name");
            String last_update = resultSet.getString("last_update");
            list.add(new Actor(actor_id, first_name, last_name, last_update));
        }

    }

    @Override
    public String toString() {
        return "ActorsList{" +
                "list=" + list +
                '}';
    }

    public HashSet<Actor> getList() {
        return list;
    }

}
