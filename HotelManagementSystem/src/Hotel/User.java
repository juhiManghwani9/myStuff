package Hotel;

public class User {
    String userId;

    public User(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                '}';
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
