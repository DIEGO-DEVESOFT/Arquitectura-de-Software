// Clase Controlador que actúa como intermediario entre el modelo y la vista
class PersonController {
    private Person model;
    private PersonView view;

    public PersonController(Person model, PersonView view) {
        this.model = model;
        this.view = view;
    }

    public void setPersonName(String name) {
        model.setName(name);
    }

    public String getPersonName() {
        return model.getName();
    }

    public void setPersonAge(int age) {
        model.setAge(age);
    }

    public int getPersonAge() {
        return model.getAge();
    }

    // Método para actualizar la vista con los datos del modelo
    public void updateView() {
        view.printPersonDetails(model.getName(), model.getAge());
    }
}
