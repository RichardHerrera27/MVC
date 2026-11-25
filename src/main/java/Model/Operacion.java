package Model;

public class Operacion {

    private float numeroA;
    private float numeroB;

    public Operacion() {
    }

    public Operacion(float numeroA, float numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public float getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(float numeroA) {
        this.numeroA = numeroA;
    }

    public float getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(float numeroB) {
        this.numeroB = numeroB;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numeroA=" + numeroA + ", numeroB=" + numeroB + '}';
    }

}
