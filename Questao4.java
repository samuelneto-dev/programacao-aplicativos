package com.mycompany.helloworld;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
    
        Scanner tc = new Scanner(System.in);
        
        int n1;
        
        
        System.out.println("Digite a sua idade");
        n1 = tc.nextInt();
        
        System.out.println("Seu ano de nacimento é:"+(2026 - n1));
        
    }
}

