import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<Hall> halls = new ArrayList<>();
        List<Ticket> tickets = new ArrayList<>();

        System.out.print("Введите количество фильмов: ");
        int movieCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < movieCount; i++) {
            System.out.println("Фильм " + (i + 1));
            System.out.print("Название фильма: ");
            String title = scanner.nextLine();

            System.out.print("Жанр: ");
            String genre = scanner.nextLine();

            System.out.print("Режиссер: ");
            String director = scanner.nextLine();

            System.out.print("Длительность (в минутах): ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            List<String> actors = new ArrayList<>();
            System.out.print("Актеры (через запятую): ");
            String actorString = scanner.nextLine();
            String[] actorArray = actorString.split(",");
            for (String actor : actorArray) {
                actors.add(actor.trim());
            }

            Movie movie = new Movie(title, genre, director, actors, duration);
            movies.add(movie);
            System.out.println();
        }

        System.out.println("Фильмы:");
        for (Movie movie : movies) {
            System.out.println("- Название: " + movie.getTitle());
            System.out.println("  Жанр: " + movie.getGenre());
            System.out.println("  Режиссер: " + movie.getDirector());
            System.out.println("  Длительность: " + movie.getDuration() + " мин");
            System.out.println("  Актеры: " + movie.getActors());
            System.out.println();
        }

        System.out.println("Сотрудники кинотеатра:");
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Должность: ");
        String position = scanner.nextLine();
        System.out.print("Зарплата: ");
        double salary = scanner.nextDouble();

        for (Employee employee : employees) {
            System.out.println("Имя: " + employee.getFirstName());
            System.out.println("Фамилия: " + employee.getLastName());
            System.out.println("Должность: " + employee.getPosition());
            System.out.println("Зарплата: " + employee.getSalary());
            System.out.println();
        }

        System.out.println("Залы кинотеатра: ");
        System.out.print("Номер зала: ");
        int hallNumber = scanner.nextInt();
        System.out.print("Объем зала: ");
        int capacity = scanner.nextInt();
        System.out.print("Тип зала: ");
        String type = scanner.nextLine();

        System.out.println("Залы кинотеатра: ");
        for (Hall hall : halls){
            System.out.println("Номер зала: " + hall.getHallNumber());
            System.out.println("Объем зала: " + hall.getCapacity());
            System.out.println("Тип зала: " + hall.getType());
            System.out.println();
        }

        System.out.println("Билеты: ");
        System.out.print("Фильм: ");
        String movie = scanner.nextLine();
        System.out.print("Номер зала: ");
        int hall = scanner.nextInt();
        System.out.print("Дата: ");
        String date = scanner.nextLine();
        System.out.print("Стоимость: ");
        double price = scanner.nextDouble();


        System.out.println("Билеты: ");
        for (Ticket ticket : tickets){
            System.out.println("Фильм: " + ticket.getMovie());
            System.out.println("Номер зала: " + ticket.getHall());
            System.out.println("Дата: " + ticket.getDate());
            System.out.println("Стоимость: " + ticket.getPrice());
            System.out.println();
        }

    }
}