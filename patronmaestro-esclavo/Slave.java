// Clase Esclavo que realiza la tarea de sumar 10 a un número
class Slave extends Thread {
    private int number;
    private int result;

    public Slave(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // La tarea del esclavo es sumar 10 al número
        result = number + 10;
        System.out.println("Esclavo procesó el número: " + number + ", resultado: " + result);
    }

    public int getResult() {
        return result;
    }
}
