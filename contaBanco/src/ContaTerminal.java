import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.print("Nome do cliente:");
        nome=input.nextLine();
        System.out.print("Agencia:");
        agencia=input.next();
        System.out.print("Numero:");
        numero=input.nextInt();
        System.out.print("Saldo:");
        saldo=input.nextDouble();
        System.out.println("Olá "+nome+",obrigado por criar uma conta em nosso banco, sua agenca é "+agencia+",conta "+numero+
                            " e seu saldo "+saldo+ " ja está disponivel para saque");
        input.close();
    }
}
