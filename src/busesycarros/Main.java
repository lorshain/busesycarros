package busesycarros;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020, 4);
        System.out.println("Información del coche:");
        miCoche.mostrarInfo();  // Heredado de Vehículo
        miCoche.tipoVehiculo(); // Sobrescrito en Coche
        miCoche.mostrarPuertas();  // Método específico de Coche

        System.out.println("\nInformación del autobús:");
        // Crear un objeto de tipo Autobús
        Autobus miAutobus = new Autobus("Mercedes", "Sprinter", 2018, 50);
        miAutobus.mostrarInfo();  // Heredado de Vehículo
        miAutobus.tipoVehiculo(); // Sobrescrito en Autobús
        miAutobus.mostrarAsientos();  // Método específico de Autobús
    }
}
