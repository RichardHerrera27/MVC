package Controller;

import Model.Operacion;
import Model.OperacionDAO;
import Model.OperacionImpl;
import View.Vista;

public class ControladorOperaciones {

    public void controlarOperacion() {
        Vista vista = new Vista();
        try {

            float numerOne = Float.parseFloat(vista.getNumOne());
            float numberTwo = Float.parseFloat(vista.getNumTwo());

            Operacion operacion = new Operacion(numerOne, numberTwo);
            OperacionDAO odao = new OperacionImpl();
            float resultado = odao.sumar(operacion);

            Vista vista1 = new Vista();
            vista.mostrarInformacion(resultado);

        } catch (Exception e) {
            vista.mostrarError();
        }
    }

}
