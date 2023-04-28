import java.util.ArrayList;

public abstract class Content {
    private int ID;
    private String title;
    private ArrayList<String> genres;
    private float rating;


    Content(String title, ArrayList genres, float rating, int ID) {
        this.title = title;
        this.genres = genres;
        this.rating = rating;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {

        return title;
    }

    public ArrayList getGenres() {
        return genres;
    }

    public float getRating() {
        return rating;
    }

}