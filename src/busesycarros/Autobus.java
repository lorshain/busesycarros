package busesycarros;

public class Autobus extends Vehiculo {
    private int numAsientos;

    // Constructor
    public Autobus(String marca, String modelo, int anio, int numAsientos) {
        super(marca, modelo, anio);  // Llama al constructor de la clase padre (Vehículo)
        this.numAsientos = numAsientos;
    }

    // Sobrescribir el método de la clase padre
    @Override
    public void tipoVehiculo() {
        System.out.println("Este es un autobús.");
    }

    // Método adicional para la clase Autobús
    public void mostrarAsientos() {
        System.out.println("Número de asientos: " + numAsientos);
    }
}
