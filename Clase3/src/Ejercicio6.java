//Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones
// que tenían un descuento del 15%.
// ¿Qué precio tenían antes de aplicar el descuento?


public class Ejercicio6 {
    public static void main(String[] args) {
        // Precio pagado después de aplicar el descuento
        double precioConDescuento = 34.0;
        
        // Porcentaje restante después del descuento
        double porcentajeRestante = 0.85; // 100% - 15% = 85% = 0.85
        
        // Calcular el precio original antes del descuento
        double precioOriginal = precioConDescuento / porcentajeRestante;
        
        // Imprimir el resultado
        System.out.println("El precio original de los pantalones era: " + precioOriginal + " €");
    }
}