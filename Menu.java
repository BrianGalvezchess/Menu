import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Usamos double para permitir decimales en los cálculos
        double lado, base, altura, radio;
        final double PI = 3.1416;

        Scanner scanner = new Scanner(System.in);
        String opcion = ""; 

        do {
            System.out.println("\n------- Menu de Areas -----");
            System.out.println("1. Area del cuadrado");
            System.out.println("2. Area del circulo");
            System.out.println("3. Area del triangulo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            
            opcion = scanner.next().toLowerCase(); // Leemos la entrada y la pasamos a minúscula

            switch (opcion) {
                case "1":
                    System.out.print("Ingresa el valor del lado: ");
                    lado = scanner.nextDouble();
                    System.out.println("El area del cuadrado es: " + (lado * lado));
                    break;
                
                case "2":
                    System.out.print("Ingresa el radio: ");
                    radio = scanner.nextDouble();
                    double areaCirculo = PI * (radio * radio);
                    System.out.println("El area del circulo es: " + areaCirculo);
                    break;
                
                case "3":
                    System.out.print("Ingresa la base: ");
                    base = scanner.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    altura = scanner.nextDouble();
                    System.out.println("El area del triangulo es: " + ((base * altura) / 2));
                    break;

                case "4":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            
        } while (!opcion.equals("4")); 
    }
}