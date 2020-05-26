package Mediator;

import java.util.List;

public class ChatUser extends User {

    public ChatUser(MessageMediator mediator, String name) {
        super(mediator, name);
        mediator.addUser(this);
        System.out.println(this.name + " join chat!");
    }

    @Override
    public String send(String message, String chatBotActive) {
    	if(mediator.checkUser(this)==false) {
    		System.out.println(this.name + "is not in chat now, or he/she was deleted");
    	}
    	else {
    	if(chatBotActive=="false"&&message=="ChatBot") {
    		chatBotActive="true";
    		System.out.println(this.name + " activate chatBot!");
    	}
    	else if(chatBotActive=="true" && message=="ChatBot") {
    		chatBotActive="false";
    		System.out.println(this.name + " disactivate chatBot!");
    	}
    	
    	if(chatBotActive=="true" && message.contains("cat")) {
    			System.out.println(this.name + " sends bad word, please follow rules!");
    			mediator.deleteUser(this);
    	}
    	else if(chatBotActive=="true"&&!message.contains("cat")) {
    			System.out.println(this.name + " sends: " + message);
            mediator.sendMessage(message, this);
    	}
    	else if(chatBotActive=="false") {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    	}
    	}
    	
        return chatBotActive;
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives:" + message);

    }

}
