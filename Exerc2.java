package Questao2;

import java.util.Scanner;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
public class Exerc2 {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = sc1.nextInt();
        System.out.println("O número informado foi " + numero);
        
        sc1.close();
    }
}
