// Capa de datos
class UserDao {
    public String getUser() {
        return "Alice";
    }
}

// Capa de lógica de negocio
class UserService {
    private UserDao userDao = new UserDao();  // Se simplifica aquí

    public String getUserName() {
        return userDao.getUser();
    }
}

// Capa de presentación
public class SimpleLayeredArchitecture {
    public static void main(String[] args) {
        UserService userService = new UserService();  // Se crea el servicio
        String userName = userService.getUserName();  // Se obtiene el nombre del usuario
        System.out.println("Usuario: " + userName);   // Se muestra el nombre
    }
}
