package projetoaula1;

import java.util.Scanner;

/**
 *
 * @author Arthur
 * Data: 09/03/2021
 * Projoeto: Aula pratica com o netbeans.
 */
public class ProjetoAula1 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      
      String nome;
      int anonasc, idade;
      double altura, peso, imc;
      
        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();
        System.out.println("Digite seu ano de nasc:");
        anonasc = teclado.nextInt();
        System.out.println("Digite sua altura:");
        altura = teclado.nextDouble();
        System.out.println("Digite seu peso");
        peso = teclado.nextDouble();
        
        idade = 2021 - anonasc;
        imc = peso/Math.pow(altura, 2);
               
        
        System.out.println("olá "+nome);
        System.out.println("Você nascido em "+anonasc);
        System.out.println("constamos que tens "+idade);
        System.out.println("Seu imc é:"+imc);
        
 
    
    
    
    }


}
    
