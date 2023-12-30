
public class Main {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Star Wars");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Star Wars");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Devil weares Prada");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var devil = Movie.getMovie("C", "Devil weares Prada");
        devil.watchMovie();

    }
}