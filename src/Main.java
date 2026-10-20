//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("\nTotal de objetos: " + Dispositivo.getTotalCreados());

    Dispositivo d1 = new Dispositivo("Laptop Dell", "Computadora");
    Dispositivo d2 = new Dispositivo("Impresora HP", "Periférico");
    Dispositivo d3 = new Dispositivo("Router Cisco", "Redes");

    d1.mostrarInformacion();
    d2.mostrarInformacion();
    d3.mostrarInformacion();

    System.out.println("\nTotal de objetos: " + Dispositivo.getTotalCreados());
}
