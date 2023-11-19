package seminars.third.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;


    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

//    public  User() {
//        this.name = "admin";
//        this.password = "admin";
//        isAuthenticate = false;
//        isAdmin = false;
//    }

    //3.6.
    // Разработайте класс User с методом аутентификации по логину и паролю. Метод должен возвращать true, если
    //введенные логин и пароль корректны, иначе false. Протестируйте все методы
    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            isAuthenticate = true;
            return true;
        }
        return false;
    }

}