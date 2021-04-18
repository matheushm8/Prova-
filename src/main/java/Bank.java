import java.util.Scanner;

public class Bank {

    Double actualCash = 2000.0;
    Double withdraw;//saque
    Double deposit;//deposito
    Double transfer;//transferencia
    Double stratum;//estrato
    Double pix;//pix
    Double process;
    Double result;
    Scanner ler = new Scanner(System.in);

    void bankProcess() {

        System.out.println("Olá usuário, oque deseja fazer hoje?\n Saque \n Deposito \n Transferencia \n Pix  \n Estrato do saldo");
        String read = ler.next();

        if (read.equals("Saque")) {
            saque();
        }
        if (read.equals("Deposito")) {
            depo();
        }
        if (read.equals("Transferencia")) {
            trans();
        }
        if (read.equals("Estrato de saldo")) {
            estra();
        }
        if (read.equals("Pix")) {
            pix();
        }

        System.out.println(result);
    }

    double depo() {
        System.out.println("Insira o valor do deposito\n");
        double value = ler.nextDouble();

        return result = actualCash + value;
    }

    double saque() {
        System.out.println("Insira o valor do saque\n");
        double value = ler.nextDouble();

        return result = actualCash - value;
    }

    double trans() {
        System.out.println("Qual o valor você deseja transferir?\n");
        process = ler.nextDouble();
        System.out.println("Qual o número da conta de destino?\n");
        process = ler.nextDouble();
        System.out.println("Transferido com sucesso!\n");

        double value = ler.nextDouble();

        return result = actualCash - value;
    }

    double estra() {
        return result = actualCash;
    }

    void pix() {
        Scanner pix = new Scanner(System.in);
        System.out.println("Deseja receber ou pagar um pix ?\n");
        String read = ler.next();
        switch (read) {
            case "pagar":
                System.out.println("Insira o valor do pagamento\n");
                double pixValuePay = pix.nextDouble();
                result = actualCash - pixValuePay;
                break;
            case "receber":
                System.out.println("Insira o valor a ser recebido\n");

                double pixValueDep = pix.nextDouble();
                result = actualCash + pixValueDep;
                break;
                
        }
                System.out.println("Pix realizado com sucesso!\n"
                        + "saldo atual: " + actualCash);
    }
    

    public static void main(String[] args) {
        Bank user1 = new Bank();
        user1.actualCash = 2000.0;

        Bank user2 = new Bank();
        user2.actualCash = 2300.0;

        Bank user3 = new Bank();
        user3.actualCash = 1000.0;
        System.out.println("Qual seu nome?\n");
        System.out.println("Maria, João, Jeffersom.\n");

        Scanner username = new Scanner(System.in);
        String user = username.next();
        switch (user) {
            case "Maria" ->
                user1.bankProcess();
            case "João" ->
                user2.bankProcess();
            case "Jeffersom" ->
                user3.bankProcess();

        }
    }
}

