package busesycarros;

public class Coche extends Vehiculo {
    private int numPuertas;

    // Constructor
    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);  // Llama al constructor de la clase padre (Vehículo)
        this.numPuertas = numPuertas;
    }

    // Sobrescribir el método de la clase padre
    @Override
    public void tipoVehiculo() {
        System.out.println("Este es un coche.");
    }

    // Método adicional para la clase Coche
    public void mostrarPuertas() {
        System.out.println("Número de puertas: " + numPuertas);
    }
}

