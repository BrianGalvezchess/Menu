import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args) {
        //sintaxis del do while,  al menos una vez y despues se evalua, imprime el valor de 10 y nada mas.
        Scanner scanner = new Scanner(System.in);
        int acumulador = 0;
        int numero = 0;
        char respuesta = 's';
        do { 
            System.out.println("Ingresa un numero: ");
            numero = scanner.nextInt();
            acumulador = acumulador + numero;

            System.out.println("Quieres continuar?");
            respuesta = scanner.next().charAt(0);
        } while (respuesta != 's');
    }
}