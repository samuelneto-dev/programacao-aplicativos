package com.mycompany.helloworld;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
    
        Scanner tc = new Scanner(System.in);
        
        int n1;
        
        
        System.out.println("Escolha o primeiro numero:");
        n1 = tc.nextInt();
        
        if(n1 %2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero não é par");
        }
        
    }
}

