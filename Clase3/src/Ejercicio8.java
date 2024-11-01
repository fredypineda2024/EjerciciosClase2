//Crea un programa que calcule el área y el perímetro de un rectángulo. 
//Solicita al usuario la longitud y el ancho del rectángulo.

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la longitud y el ancho del rectángulo
        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingresa el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        // Calcular el área y el perímetro
        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);

        // Mostrar los resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}