package Mediator;

public abstract class User {

    protected MessageMediator mediator;
    protected String name;

    public User(MessageMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public String send(String msg, String chatBotActive) {
    	return chatBotActive;
    }

    public abstract void receive(String msg);
}