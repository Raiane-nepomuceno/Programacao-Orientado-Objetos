import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2,res;
        System.out.println("Digite o primeiro numero:");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = entrada.nextInt();
        res = n1 + n2;

        System.out.printf("Resultado: %d",res);

    }
}
