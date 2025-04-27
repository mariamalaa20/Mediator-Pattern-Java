import java.util.*;

// Concrete Mediator
class ChatMediator implements IMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Deliver message to all users except the sender
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
