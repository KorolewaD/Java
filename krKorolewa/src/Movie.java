import java.util.ArrayList;
import java.util.List;
class Movie implements Rateable
{
    private String title;
    private String genre;
    private String director;
    private List<String> actors;
    private int duration;
    private double averageRating;

    public Movie(String totle, String genre, String director, List<String> actors, int duration){
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.duration = duration;
        this.averageRating = 0.0;
    }
    public void rate(int rating) {

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }

    public int getDuration() {
        return duration;
    }

    public double getAverageRating() {
        return averageRating;
    }
}