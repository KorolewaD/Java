import java.util.ArrayList;
import java.util.List;
class Cinema {
    private List<Movie> movies;
    private List<Employee> employees;
    private List<Hall> halls;
    private List<Ticket> tickets;

    public Cinema(List<Movie> movies, List<Employee> employees, List<Hall> halls, List<Ticket> tickets) {
        this.movies = movies;
        this.employees = employees;
        this.halls = halls;
        this.tickets = tickets;
    }
    public List<Movie> getMovies() {
        return movies;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
