package Day17;
class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}
class Password {
    void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password is too short");
        }
    }
}


public class CustomException {
    public static void main(String[] args) {
        Password pass = new Password();
        String p = "Saketh";
        try{
            pass.checkPassword(p);
            System.out.println("Password Accepted");
        }
        catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
