import java.util.ArrayList;

public class Movies extends Content {
    private int year;

    Movie(String title, ArrayList genres, int rating, int year, int ID) {
        super(title, genres, rating, ID);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

}
}