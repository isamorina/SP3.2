import java.util.ArrayList;

public class User {
    private int ID;
    private String username;
    private String password;
    private ArrayList<Integer> watchedMovies = new ArrayList();
    private ArrayList<Integer> savedMovies = new ArrayList();

    private ArrayList<Integer> watchedSeries = new ArrayList();
    private ArrayList<Integer> savedSeries = new ArrayList();

    public User(String username, String password, int ID, ArrayList watchedMovies, ArrayList savedMovies, ArrayList watchedSeries, ArrayList savedSeries) {
        this.username = username;
        this.password = password;
        this.ID = ID;
        this.watchedMovies = watchedMovies;
        this.savedMovies = savedMovies;
        this.watchedSeries = watchedSeries;
        this.savedSeries = savedSeries;
    }

    public void setWatchedMovies(Integer watchedM) {
        watchedMovies.add(watchedM);
    }

    public void setSavedMovies(Integer savedM) {
        savedMovies.add(savedM);
    }

    public ArrayList<Integer> getWatchedMovies() {
        return watchedMovies;
    }

    public ArrayList<Integer> getSavedMovies() {
        return savedMovies;
    }



    public void setWatchedSeries(Integer watchedS) {

        watchedSeries.add(watchedS);
    }

    public void setSavedSeries(Integer savedS) {

        savedSeries.add(savedS);
    }

    public ArrayList<Integer> getWatchedSeries() {
        return watchedSeries;
    }

    public ArrayList<Integer> getSavedSeries() {
        return savedSeries;
    }




    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getID() {
        return ID;
    }

}
}
