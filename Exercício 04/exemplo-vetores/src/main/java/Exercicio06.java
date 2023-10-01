import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês (1-12): ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasPorMes[mes - 1]) {
            int diaDoAno = dia;
            for (int i = 0; i < mes - 1; i++) {
                diaDoAno += diasPorMes[i];
            }
            System.out.println("O dia " + dia + "/" + mes + " corresponde ao dia " + diaDoAno + " do ano.");
        } else {
            System.out.println("Data inválida. Certifique-se de que o mês e o dia estão dentro dos limites válidos.");
        }

        scanner.close();
    }
}
