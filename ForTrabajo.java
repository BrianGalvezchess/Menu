import java.util.Scanner;
public class ForTrabajo{
    public static void main(String[] args) {
        int limite; //hasta donde llegar
        int salto; //de cuanto en cuanto
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Hasta que numero quieres contar?: ");
        limite = scanner.nextInt();

        System.out.println("¿De cuanto a cuanto quieres que aumente?: ");
        salto = scanner.nextInt();
        for(int i = 0; i <= limite;i+=salto){
             System.out.println("Numero actual" +i);
        }
    }
}