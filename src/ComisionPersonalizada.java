public class ComisionPersonalizada implements EstrategiaComision {
    private final int letrasPrimerNombre;

    public ComisionPersonalizada(String primerNombre) {
        this.letrasPrimerNombre = primerNombre.length();
    }

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5 + letrasPrimerNombre) / 100.0;
        return montoVenta * porcentaje;
    }
}
