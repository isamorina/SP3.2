import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO{

    public ArrayList<String> readSeriesData() {
        File file = new File("/Data/series.txt");
        ArrayList<java.lang.String> series = new ArrayList<>();
        try {Scanner input = new Scanner(file);
            input.nextLine();

            while (input.hasNextLine()){
                series.add(input.nextLine());
            }
        }catch (FileNotFoundException e) {
            series = null;
        }
        return series;
    }


    public String[] readUserData(String username, String password) {
        File file = new File("/Data/users.txt");
        ArrayList<String> users = new ArrayList<>();
    }

    public ArrayList searchGenres(int i) {
        String path = "/Data/movies.txt";
        path = "/Data/series.txt";
    }
}

    public void writeUserData(User u){
        try{
            FileWriter writer = new FileWriter("/Data/users.txt", true);
            writer.write(u.getID() + ";" + u.getUsername() + ";" + u.getPassword());
            writer.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}