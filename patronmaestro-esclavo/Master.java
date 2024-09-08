// Clase Maestro que asigna tareas a los esclavos
public class Master {
    public static void main(String[] args) {
        // Números que se van a procesar
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Crear un arreglo de esclavos
        Slave[] slaves = new Slave[numbers.length];

        // Crear y asignar esclavos para procesar cada número
        for (int i = 0; i < numbers.length; i++) {
            slaves[i] = new Slave(numbers[i]);
            slaves[i].start();  // Iniciar cada esclavo (thread)
        }

        // Esperar a que todos los esclavos terminen su trabajo
        for (int i = 0; i < numbers.length; i++) {
            try {
                slaves[i].join();  // Esperar que el esclavo termine
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Recoger los resultados de los esclavos
        System.out.println("Resultados finales:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Esclavo " + i + " resultado: " + slaves[i].getResult());
        }
    }
}
