public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Luis Ramos", 12500.0);
        vendedor.cambiarEstrategia(new ComisionPersonalizada("Luis"));
        vendedor.mostrarDetalle();
    }
}
