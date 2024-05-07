import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio_Conta {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "Claudio Junior";
        double saldo = 3000;
        String dadosBancarios = """
                ***************************************************
                Dados iniciais do cliente:
                                
                Nome: %s.
                Tipo de Conta: Corrente.               
                Saldo Bancario: %.2f.
                ***************************************************
                """.formatted(nome, saldo);
        System.out.println(dadosBancarios);

        String menu = """
                MENU DE OPÇÕES:
                                
                1) Consultar Saldo
                2) Receber Saldo                               
                3) Transferir Saldo
                4) Sair
                """.formatted();
        System.out.println(menu);

        System.out.println("Digite a opção desejada: ");
        int option = scan.nextInt();

        while (option != 4) {
            if (option == 1) {
                String dadosAtualizados = """
                        *********************************
                        DADOS ATUALIZADOS:
                        Nome: %s.
                        Saldo Bancario: %.2f.
                                            
                        """
            }
        }
    }

}
