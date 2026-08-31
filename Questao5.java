package com.mycompany.helloworld;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
    
        Scanner tc = new Scanner(System.in);
        
        int n1;
        
        
        System.out.println("Digite um numero:");
        n1 = tc.nextInt();
        
        System.out.println("O antecessor é:" + (n1- 1));
        System.out.println("O sucessor é:" + (n1 + 1));
        
    }
}
