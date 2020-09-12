package Models;

import java.util.Objects;

public class Film {
    private int film_id;
    private String title;
    private String description;
    private int year;
    private int language_id;
    private int rental_duration;
    private double rental_rate;
    private int length;
    private double replacement_cost;
    private Rating rating;
    private String special_futures;
    private String last_update;

    public Film(int film_id, String title, String description, int year, int language_id, int rental_duration, double rental_rate, int length, double replacement_cost, Rating rating, String special_futures, String last_update) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.language_id = language_id;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        this.special_futures = special_futures;
        this.last_update = last_update;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getSpecial_futures() {
        return special_futures;
    }

    public void setSpecial_futures(String special_futures) {
        this.special_futures = special_futures;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public Film() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return film_id == film.film_id &&
                year == film.year &&
                language_id == film.language_id &&
                rental_duration == film.rental_duration &&
                Double.compare(film.rental_rate, rental_rate) == 0 &&
                length == film.length &&
                Double.compare(film.replacement_cost, replacement_cost) == 0 &&
                title.equals(film.title) &&
                description.equals(film.description) &&
                rating == film.rating &&
                special_futures.equals(film.special_futures) &&
                last_update.equals(film.last_update);
    }

    @Override
    public int hashCode() {
        return Objects.hash(film_id, title, description, year, language_id, rental_duration, rental_rate, length, replacement_cost, rating, special_futures, last_update);
    }

    @Override
    public String toString() {
        return "Film{" +
                "film_id=" + film_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", language_id=" + language_id +
                ", rental_duration=" + rental_duration +
                ", rental_rate=" + rental_rate +
                ", length=" + length +
                ", replacement_cost=" + replacement_cost +
                ", rating=" + rating +
                ", special_futures='" + special_futures + '\'' +
                ", last_update='" + last_update + '\'' +
                '}';
    }
}
