import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do empréstimo:");
        double total_saldo_devedor = Double.parseDouble(scanner.nextLine());

        System.out.println("Informe a taxa de juros mensal (em porcentagem):");
        double juros_ao_mes = Double.parseDouble(scanner.nextLine()) / 100;

        System.out.println("Informe o tempo de pagamento (em meses):");
        int total_de_meses = scanner.nextInt();

        double amortizacao = total_saldo_devedor / total_de_meses;
        double saldo_devedor_atual = total_saldo_devedor;
        double total_juros = 0;
        double total_parcela_mensal = 0;

        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.2f%% ao mês\n",
                          amortizacao, total_saldo_devedor, juros_ao_mes * 100);

        for (int i = 1; i <= total_de_meses; i++) {
            double juros_mensal = saldo_devedor_atual * juros_ao_mes;
            double parcela_mensal = juros_mensal + amortizacao;
            saldo_devedor_atual -= amortizacao;
            total_juros += juros_mensal;
            total_parcela_mensal += parcela_mensal;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n", 
                              i, juros_mensal, parcela_mensal, saldo_devedor_atual);
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n",
                          total_parcela_mensal, total_juros, total_saldo_devedor);

        scanner.close();
    }
}
