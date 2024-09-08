// Clase principal que muestra cómo funciona el patrón MVC
public class MVCDemo {
    public static void main(String[] args) {
        // Crear el modelo con datos iniciales
        Person model = new Person("Juan", 25);

        // Crear la vista
        PersonView view = new PersonView();

        // Crear el controlador
        PersonController controller = new PersonController(model, view);

        // Mostrar datos iniciales
        controller.updateView();

        // Actualizar el modelo a través del controlador
        controller.setPersonName("Carlos");
        controller.setPersonAge(30);

        // Volver a mostrar los datos actualizados
        controller.updateView();
    }
}
