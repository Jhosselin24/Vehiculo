package hilos;

import dao.VehiculoDAO;
import modelo.Vehiculo;

public class HiloGuardar extends Thread {

    private Vehiculo vehiculo;

    public HiloGuardar(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void run() {
        VehiculoDAO dao = new VehiculoDAO();
        dao.guardar(vehiculo);

        System.out.println("Vehículo guardado desde hilo");
    }
}