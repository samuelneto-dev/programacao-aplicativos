package exercicio;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class pratica {
   public static void main(String[] args) {
  
       Scanner tc = new Scanner(System.in);
      
       String nome;
       int uni1;
       int uni2;
       int uni3;
      
       System.out.println("Digite nome do aluno");
       nome = tc.nextLine();
        System.out.println("Nota unidade 1:");
       uni1 = tc.nextInt();
        System.out.println("Nota unidade 2:");
       uni2 = tc.nextInt();
        System.out.println("Nota unidade 3:");
       uni3 = tc.nextInt();
      
       int soma =  uni1 + uni2 + uni3;
       double media = soma/3.0;
      
        System.out.println("A media das notas é "+ media);
       
       if((soma/3) >= 7){
           System.out.println("Esta acima da media!");
       }else{
           System.out.println("Burro!");
       }
      
   }
}
