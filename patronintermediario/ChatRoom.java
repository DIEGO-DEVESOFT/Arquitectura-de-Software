import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatRoomMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        // Enviar el mensaje a todos los usuarios, excepto al remitente
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}