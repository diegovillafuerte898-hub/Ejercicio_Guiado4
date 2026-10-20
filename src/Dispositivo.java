public class Dispositivo {
    private String nombre;
    private String tipo;
    private static int contador = 0;
    private int id;

    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        contador++;
        this.id = contador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public void mostrarInformacion() {
        System.out.println("\nID " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo: " + this.tipo);
    }
}
