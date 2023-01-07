
public class HardcodedLogin {
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password){
        String userName1 = "admin";
        String userName2 = "user";
        String password1 = "qwerty";
        String password2 = "password";
        boolean granted = true;
        
        userName1 = password1;
        userName2 = password2;
        if (userName1 != userName1){
            granted = false;
        }
        if (userName1 != password1) {
            granted = false;
        }
        if (userName2 != userName2){
            granted = false;
        }
        if (userName2 != password2) {
            granted = false;
        }
            

        
        
        return granted;
    }
}
