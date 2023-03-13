import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número binário: ");
        String binaryString = sc.nextLine();

        if (!binaryString.matches("[01]+")) {
            System.out.println("Entrada inválida! Por favor, digite um número binário.");
            System.exit(0);
        }

        int decimal = 0;
        int base = 1;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }

        System.out.println("O número decimal correspondente é: " + decimal);
    }

}
