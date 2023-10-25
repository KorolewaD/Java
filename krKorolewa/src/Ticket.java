class Ticket {
    private Movie movie;
    private Hall hall;
    private String date;
    private double price;

    public Ticket(Movie movie, Hall hall, String date, double price) {
        this.movie = movie;
        this.hall = hall;
        this.date = date;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public Hall getHall() {
        return hall;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
}