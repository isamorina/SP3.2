public class UserHandler {

    User readUserData(String username, String password) {
        String[] userData = readUserData(username, password);
        if (userData.length < 1) {
            return null;
        } else {
            return users(userData);
        }
    }
    public void saveUserData(User u){
    }
    private Movies movie(String[] m) {

    }
    private Series series(String[] s) {

    }
}