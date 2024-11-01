//Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€
// con todos los accesorios incluidos. Sin embargo, el vendedor te descuenta el 10% por pronto pago
// ¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios?


public class Ejercicio5 {
    public static void main(String[] args) {
        // Precio inicial del PC con accesorios
        double precioInicial = 660.0;
        
        // Porcentaje restante después del descuento
        double porcentajeFinal = 0.90; // 100% - 10% = 90% = 0.90
        
        // Calcular el precio final directamente
        double precioFinal = precioInicial * porcentajeFinal;
        
        // Imprimir el resultado
        System.out.println("El precio final del PC con el descuento es: " + precioFinal + " €");
    }
}