package seminars.five.user;

public class UserRepository {
    public String getUserById(int id) {
        // В реальной жизни здесь был бы код, работающий с базой данных
        // return "User " + id;
        return "select username from users where id = " + id;
    }
}
