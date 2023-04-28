import java.util.ArrayList;

public class Series extends Content {
    private int year;

    public Series(String title, int rating, int year, ArrayList<String> genre, int ID) {
        super(title, genre, rating, ID);
        this.year = year;

    }
}