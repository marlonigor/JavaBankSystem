package sistemabancario;

public class Menu {

    public static void menuGeral() {
        System.out.println("""
                       Bem vindo ao Sistema Bancario!
                       1 - Secao Conta
                       2 - Secao Correntista
                       3 - Sair""");
    }

    public static void menuConta() {
        System.out.println("""
                       Secao Conta
                       1 - Inserir Conta
                       2 - Acessar Conta""");

    }

    public static void menuCorrentista() {
        System.out.println("""
                       Secao Correntista
                       1 - Inserir Correntista
                       2 - Exibir Correntistas""");
    }

    public static void menuTipoConta() {
        System.out.println("""
                           Insira o tipo da conta: 
                           Tipos de Conta
                           1 - Conta Corrente
                           2 - Conta Poupanca
                           3 - Conta Aplicacao""");
    }

    public static void menuOperacao() {
        System.out.println("""
                           Selecione o tipo de operacao
                           1 - Deposito
                           2 - Saque
                           3 - Transferir
                           4 - Exibir saldo
                           5 - Voltar""");
    }

}
