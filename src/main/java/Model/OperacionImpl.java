package Model;

public class OperacionImpl implements OperacionDAO {

    @Override
    public float sumar(Operacion operacion) {
        
        float Resultadosuma = operacion.getNumeroA() + operacion.getNumeroB();

        return Resultadosuma;
    }

}
