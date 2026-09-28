public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Luis Ramos", 12500.0);
        EstrategiaComision estrategia = new ComisionEstandar();
        vendedor.cambiarEstrategia(estrategia);
        vendedor.mostrarDetalle();
    }
}
