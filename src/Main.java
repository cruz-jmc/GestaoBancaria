import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<conta> contas = new ArrayList<>();


        boolean continuar = true;
        while (continuar) {
            ContaCorrente contaCorrente1 = new ContaCorrente();
            ContaPoupanca contaPoupanca1 = new ContaPoupanca();
            ContaInvestimento contaInvestimento1 = new ContaInvestimento();

            System.out.println("1 - Conta Corrente\n");
            System.out.println("2 - Conta Poupanca\n");
            System.out.println("3 - Conta Investimento\n");
            System.out.println("Escolha o tipo de conta: \n");
            String opcao = input.nextLine();

            if (opcao.equals("1")) {
                System.out.println("\nDigite o número da conta: \n");
                contaCorrente1.setNumeroconta(input.nextLine());
                System.out.println("\nDigite o titular da conta: \n");
                contaCorrente1.setTitularconta(input.nextLine());
                System.out.println("\nDigite o saldo da conta: \n");
                contaCorrente1.setSaldoconta(input.nextDouble());
                System.out.println("\nDigite a taxa de projeção mensal da conta: \n");
                contaCorrente1.setProjecaoM(input.nextDouble());
                System.out.println("\nDigite o limite do cheque especial da conta: \n");
                contaCorrente1.setLimiteCheque(input.nextDouble());
                System.out.println("Carro cadastrado!");
                System.out.println("\nDeseja detalhar mostrando o limite e o saldo da conta corrente? (sim ou não) \n");
                input.nextLine();
                contaCorrente1.setChoose(input.nextLine());
                contas.add(contaCorrente1);
            } else if (opcao.equals("2")) {
                System.out.println("\nDigite o número da poupança: \n");
                contaPoupanca1.setNumeroconta(input.nextLine());
                System.out.println("\nDigite o titular da poupança: \n");
                contaPoupanca1.setTitularconta(input.nextLine());
                System.out.println("\nDigite o saldo da poupança: \n");
                contaPoupanca1.setSaldoconta(input.nextDouble());
                System.out.println("\nDigite a taxa de projeção mensal da conta: \n");
                contaPoupanca1.setProjecaoM(input.nextDouble());
                System.out.println("\nDigite a taxa de rendimento mensal: \n");
                contaPoupanca1.setTaxaRendimentoM(input.nextDouble());
                System.out.println("\nDeseja exibir a taxa anual aproximada? (sim ou não)\n");
                input.nextLine();
                contaPoupanca1.setEscolha(input.nextLine());
                contas.add(contaPoupanca1);
            } else if (opcao.equals("3")) {
                System.out.println("\nDigite o número da conta de investimento: \n");
                contaInvestimento1.setNumeroconta(input.nextLine());
                System.out.println("\nDigite o titular da conta: \n");
                contaInvestimento1.setTitularconta(input.nextLine());
                System.out.println("\nDigite o saldo do investimento: \n");
                contaInvestimento1.setSaldoconta(input.nextDouble());
                System.out.println("\nDigite a taxa de projeção mensal da conta: \n");
                contaInvestimento1.setProjecaoM(input.nextDouble());
                System.out.println("\nDigite a taxa de administração: \n");
                contaInvestimento1.setTaxaAdministracao(input.nextDouble());
                System.out.println("\nDeseja exibir o saldo líquido após aplicar a projeção e a taxa? \n");
                input.nextLine();
                contaInvestimento1.setOpcao(input.nextLine());
                contas.add(contaInvestimento1);
            }

            System.out.print("\nCadastrar novas contas (corrente, poupança e investimento)? (s/n): ");
            String resposta = input.next();
            input.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("\nEncerrando programa...");


                System.out.println("\n--- Dados de Todos os Veículos Cadastrados ---");
                for (conta conta : contas) {
                    conta.mostrarDados();


                }
            }
        }
    }
}