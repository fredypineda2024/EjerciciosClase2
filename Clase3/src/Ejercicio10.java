//Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.


import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingresa el primer número entero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número entero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número entero: ");
        double numero3 = scanner.nextDouble();

        // Calcular la media aritmética
        double media = (numero1 + numero2 + numero3) / 3;

        // Mostrar el resultado
        System.out.println("La media aritmética de los tres números es: " + media);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}