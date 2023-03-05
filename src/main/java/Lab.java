
public class Lab {
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
    boolean result;
   
    public boolean login(String username, String password){
        String user = username;
        String pword = password;
        
        
        if (user == "admin"){
            if (pword == "qwerty"){
                result = true;
            } else {
                result = false;
            }
        }
        else if (user == "user"){
            if (pword == "password"){
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
               
}
