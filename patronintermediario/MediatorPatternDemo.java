public class MediatorPatternDemo {
    public static void main(String[] args) {
        // Crear el mediador (sala de chat)
        ChatRoom chatRoom = new ChatRoom();

        // Crear usuarios
        User user1 = new ChatUser(chatRoom, "Juan");
        User user2 = new ChatUser(chatRoom, "Maria");
        User user3 = new ChatUser(chatRoom, "Carlos");

        // Agregar usuarios a la sala de chat
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        // Enviar mensajes entre los usuarios a través del mediador
        user1.send("¡Hola a todos!");
        user2.send("Hola, Juan");
    }
}