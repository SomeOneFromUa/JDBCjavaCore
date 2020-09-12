import Models.Film;
import Models.Rating;

import java.sql.*;
import java.util.ArrayList;

public class Methods {
    public ArrayList<Film> getMovies (int actor_id){
        ArrayList<Film> films = new ArrayList<>();
        try {
            Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "1111");
            PreparedStatement preparedStatement = root.prepareStatement("select * from actor a join film_actor fa on a.actor_id = fa.actor_id join film f on fa.film_id = f.film_id where a.actor_id = ?");
            preparedStatement.setInt(1,actor_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int film_id = resultSet.getInt("film_id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                int year = resultSet.getInt("release_year");
                int language_id = resultSet.getInt("language_id");
                int rental_duration = resultSet.getInt("rental_duration");
                double rental_rate = resultSet.getDouble("rental_rate");
                int length = resultSet.getInt("length");
                double replacement_cost = resultSet.getDouble("replacement_cost");
                String rating = resultSet.getString("rating");
                String special_futures = resultSet.getString("special_features");
                String last_update = resultSet.getString("last_update");
                Rating rating1 = null;
                switch (rating){
                    case "G":
                        rating1 = Rating.G;
                        break;
                    case "PG":
                        rating1 = Rating.PG;
                        break;
                    case "PG-13":
                        rating1 = Rating.PG13;
                        break;
                    case "R":
                        rating1 = Rating.R;
                        break;
                    case "NS-17":
                        rating1 = Rating.NS17;
                        break;
                    default: break;
                }

                films.add(new Film(film_id, title, description, year, language_id, rental_duration,rental_rate, length, replacement_cost, rating1, special_futures, last_update));

            }
            root.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return films;
    }
}
