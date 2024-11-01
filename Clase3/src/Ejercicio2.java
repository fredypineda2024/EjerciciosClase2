
//En el mercado, podemos encontrar que el precio del producto **Pernil Iberic D'Engreix Llen. Azuaga** 
//en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. 
//¿Crees que es correcto el precio?


public class Ejercicio2 {
    public static void main(String[] args) {
        // Precio de 100 gramos
        double precio100Gramos = 5.95;
        
        // Precio por kilo dado por el vendedor
        double precioKiloVendedor = 29.75;
        
        // Calcular el precio real por kilo basado en el precio de 100 gramos
        double precioKiloCalculado = precio100Gramos * 10;
        
        // Imprimir los resultados
        System.out.println("Precio por kilo calculado a partir de 100 gramos: " + precioKiloCalculado + " €");
        System.out.println("Precio por kilo dado por el vendedor: " + precioKiloVendedor + " €");

        // Comparar los precios
        if (precioKiloCalculado == precioKiloVendedor) {
            System.out.println("El precio proporcionado por el vendedor es correcto.");
        } else {
            System.out.println("El precio proporcionado por el vendedor es incorrecto.");
            System.out.println("El precio real del kilo debería ser: " + precioKiloCalculado + " €");
        }
    }
}