package Mediator;

public interface MessageMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
    void deleteUser(User user);
    boolean checkUser(User user);
}