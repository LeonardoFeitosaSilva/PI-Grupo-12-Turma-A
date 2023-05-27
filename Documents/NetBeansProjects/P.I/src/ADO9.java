/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.Random;
public class ADO9 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double min, max, a, b;
    double solucao;
    System.out.println("Insira um valor mínimo: ");
      min = entrada.nextInt();
    System.out.println("Insira um valor máximo: ");
      max = entrada.nextInt();
    //do{
    //Random troca = new Random();
    //a = troca.nextDouble(((max - min) +1) + min);
    //} while(a==0);
    while((a=(Math.random() * ((max - min) + 1)) + min) == 0){};
    b = (Math.random() * ((max - min) + 1)) + min;
    //b = troca.nextDouble(((max - min) +1) + min);
    System.out.println("Valor de A " + a);
    System.out.println("Valor de B " + b);
    System.out.println("Equação:  ax+b = 0");
    solucao = -(b)/a;
    System.out.println("Resultado: x = " + solucao);  
 }  
}
