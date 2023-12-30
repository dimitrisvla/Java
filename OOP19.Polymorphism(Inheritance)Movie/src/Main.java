import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();
        System.out.println();
        Movie theMovie2 = new Comedy("Dump & Dumper");
        theMovie2.watchMovie(); */
    	
    	Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
