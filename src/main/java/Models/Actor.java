package Models;

import java.util.ArrayList;
import java.util.Objects;

public class Actor {
    private int actor_id;
    private String first_name;
    private String last_name;
    private String last_update;
    private ArrayList<Film> films;

    public Actor() {
    }

    public Actor(int actor_id, String first_name, String last_name, String last_update) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;
        this.films = new ArrayList<>();
    }

    public Actor(int actor_id, String first_name, String last_name, String last_update, ArrayList<Film> films) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;
        this.films = films;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return actor_id == actor.actor_id &&
                Objects.equals(first_name, actor.first_name) &&
                Objects.equals(last_name, actor.last_name) &&
                Objects.equals(last_update, actor.last_update) &&
                Objects.equals(films, actor.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor_id, first_name, last_name, last_update, films);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actor_id=" + actor_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", last_update='" + last_update + '\'' +
                ", films=" + films +
                '}';
    }
}
