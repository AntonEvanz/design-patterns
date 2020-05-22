  
package Mediator;

public class MediatorMain {

    public static void main(String[] args) {

    	String chatBotActive="false";
    	
        MessageMediator mediator = new ChatMessageMediator();
        User user1 = new ChatUser(mediator, "Peter");
        User user2 = new ChatUser(mediator, "Ivan");
        User user3 = new ChatUser(mediator, "Georgi");

        chatBotActive= user1.send("ChatBot", chatBotActive);
        chatBotActive= user1.send("Hello!", chatBotActive);
        chatBotActive= user1.send("I love my cat!", chatBotActive);
        chatBotActive= user1.send("How are you?", chatBotActive);
        chatBotActive= user2.send("ChatBot", chatBotActive);
    }

}
