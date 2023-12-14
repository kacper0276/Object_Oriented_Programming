public class UserAuthentication implements Authentication{
    protected String username, password;

    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano admina");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(oldPassword.equals(newPassword))
            return false;
        if(!username.equals(this.username))
            return false;
        this.password = newPassword;
        return true;
    }
}
