
public class Main {

    public static void main(String[] args) {

        Sensor[] sensores = new Sensor[5];

        sensores[0] = new Sensor("S01", "Temperatura", "°C", 24.5, true);
        sensores[1] = new Sensor("S02", "Presion", "bar", 5.8, true);
        sensores[2] = new Sensor("S03", "Humedad", "%", 65.0, false);
        sensores[3] = new Sensor("S04", "Nivel", "cm", 80.5, true);
        sensores[4] = new Sensor("S05", "Caudal", "L/min", 12.3, false);

        PanelMonitoreo panel = new PanelMonitoreo(sensores);

        System.out.println("===== PANEL DE MONITOREO =====");
        System.out.println(panel.listarSensores());

        System.out.println("===== SENSORES ACTIVOS =====");
        System.out.println("Activos: " + panel.contarActivos());

        System.out.println("\n===== PROMEDIO DE LECTURAS =====");
        System.out.println("Promedio: " + panel.calcularPromedioLecturas());

        System.out.println("\n===== BUSCAR SENSOR =====");
        Sensor encontrado = panel.buscarSensor("S01");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Sensor no encontrado");
        }

        System.out.println("\n===== BUSQUEDA INEXISTENTE =====");
        Sensor noEncontrado = panel.buscarSensor("S10");

        if (noEncontrado == null) {
            System.out.println("El sensor no existe");
        }

        System.out.println("\n===== SENSOR CON MAYOR LECTURA =====");
        Sensor mayor = panel.obtenerMayorLectura();

        if (mayor != null) {
            System.out.println(mayor.mostrarInformacion());
        }
    }
}

