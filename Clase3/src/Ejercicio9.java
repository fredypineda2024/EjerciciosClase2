//Escribe un programa que convierta una temperatura dada en grados Celsius
// a grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:
//```
//Fahrenheit = Celsius * 9/5 + 32
//Kelvin = Celsius + 273.15
//```

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la temperatura en Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertir Celsius a Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Convertir Celsius a Kelvin
        double kelvin = celsius + 273.15;

        // Mostrar los resultados
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura en Kelvin: " + kelvin);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}