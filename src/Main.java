public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Luis Ramos", 10000.0);
        vendedor.cambiarEstrategia(new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
