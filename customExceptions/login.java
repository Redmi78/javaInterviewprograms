package customExceptions;

public class login {
    public static void main(String[] args) throws invalidTestData, tryNewData {
        login obj = new login();
        obj.login("admin", "admin123");

    }
    public void login(String username, String password) throws invalidTestData, tryNewData {

        if (username == null || username.isEmpty()) {
            throw new invalidTestData("Username test data is missing");
        }

        if (password == null || password.isEmpty()) {
            throw new tryNewData("Password test data is missing");
        }

    }
}
