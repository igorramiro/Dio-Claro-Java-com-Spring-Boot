/*
 * Controle de Fluxo - Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
Crie o projeto DesafioControleFluxo
Dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa.
Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.
 */
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Primeiro parametro:");
        int p1=input.nextInt();
        System.out.print("Segundo parametro:");
        int p2=input.nextInt();
        try {
            contar(p1,p2);
        } catch (ParametrosInvalidosException e) {
            //
        }
        
    }
    public static void contar(int n1, int n2) throws ParametrosInvalidosException {
        int cont=0;
        if(n2<n1){
            throw new ParametrosInvalidosException();
        }
        for (int i=n1;i<=n2;i++) {
            cont++;
            System.out.println("Imprimindo o número "+cont);
        }
    }
}
