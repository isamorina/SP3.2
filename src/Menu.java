public class Menu {
    import java.util.ArrayList;
import java.util.Arrays;

    public class Menu {
        static FileIO fileIO = new FileIO();
        static TextUI textUI = new TextUI();

        public Menu() {

        }

        public void RunMenu() {
            User u = null;
            String result = textUI.getInput("Welcome! \n Press 1 to sign up \n Press 2 to log in.");
            try {
                if (Integer.parseInt(result) == 1) {
                    u = signUp();
                } else if (Integer.parseInt(result) == 2) {
                    u = login();
                } else {
                    System.out.println("Try again, please.");
                    RunMenu();
                }
            }catch (NumberFormatException e){
                System.out.println(result + " is not accepted. Try again.");
                RunMenu();
            }
        }

        public User logIn() {
            String username = textUI.getInput("What is your username?: ");
            String password = textUI.getInput("What is your password?: ");
            User result = readUserData(username, password);
            System.out.println("Hello and welcome" + username);
            if (result == null) {
                System.out.println("Password or username is wrong. Try again.");
                login();
            } else {
                return result;
            }
            return null;
        }


        public void logout() {
            User u = null;
            String result = textUI.getUserInput("Do you want to log out? \n Press 1 to log out \n Press 2 to return to main menu.");
            if (Integer.parseInt(result) == 1) {
                RunMenu();
            } else if (Integer.parseInt(result) == 2) {
                Menu.Menu();
            } else {
                System.out.println("Please try again.");
                login();
            }

        }

        private User signUp() {
            String username = textUI.getInput("Please type your username: ");
            String password = textUI.getInput("Please type your password: ");
            User user = new User(username, password, , new ArrayList<>(), new ArrayList<>(), new ArrayList(), new ArrayList());
            return user;
        }


        public void mainMenu() {
            String input = "";
            while (!input.equals("5")) {

                ArrayList<String> options = new ArrayList<St "Search by title", "Search by genre", "View watched movies", "View watched series", "View saved movie", "View saved series ", "Log out"));

                input = textUI.getInput("Please select: ", options);
                switch (Integer.parseInt(input)) {
                    case 1:
                        searchByTitle(true);
                        break;
                    case 2:
                        viewWatchedSeries();
                        break;
                    case 3:
                        searchByGenre();
                        break;
                    case 4:
                        viewWatchedMovie();
                        break;
                    case 5:
                        Menu.logout();
                        break;

                    default:
                        System.out.println("Please select a number from 1-5");
                }
            }
        }

        protected void searchByTitle(boolean isMovie) {
            if (isMovie) {
                String input = textUI.getInput("Please enter title");
                Movie m = readMovieData("title", input);
                if (m == null) {
                    System.out.println("The movie does not exist. Try again.");
                    searchByTitle(true);
                }

            }

        }
        public void searchByGenre(){

        }
        public void viewWatchedSeries(){

        }
        public void viewWatchedMovie(){

        }
    }
