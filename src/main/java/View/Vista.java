package View;

import Controller.ControladorOperaciones;

public class Vista {

    ControladorOperaciones controladorOperaciones = new ControladorOperaciones();

    public String getNumOne() {
        return "7";
    }

    public String getNumTwo() {
        return "7";
    }

    public void mostrarError() {
        System.out.println("error en el ingreso de valores....");
    }

    public void mostrarInformacion(float respuesta) {
        System.out.println("la respuesta es :" + respuesta);

    }

    public void enviar() {
        controladorOperaciones.controlarOperacion();
    }
}
