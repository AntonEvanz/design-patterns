package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator {
    private List<User> users;

    public ChatMessageMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);

    }
    
    @Override
    public void deleteUser(User user) {
        this.users.remove(user);
    }
    
    @Override
    public boolean checkUser(User user) {
    	boolean ch=true;
    	if(this.users.contains(user)) {
    		ch = true;
    	}
    	else if(!this.users.contains(user)) {
    		ch=false;
    	};
        return ch;
    }

}