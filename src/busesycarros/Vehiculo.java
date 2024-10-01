package busesycarros;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

   
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    public void tipoVehiculo() {
        System.out.println("Este es un vehículo genérico.");
    }
}
