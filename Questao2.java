package com.mycompany.helloworld;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
    
        Scanner tc = new Scanner(System.in);
        
        int n1;
        int n2;
        
        System.out.println("Escolha o primeiro numero:");
        n1 = tc.nextInt();
        
        System.out.println("Escolha o segundo numero:");
        n2 = tc.nextInt();
        
        System.out.println("A media dos dois numeros será" + (n1+n2)/2);
    }
}

