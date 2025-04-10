/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maisumprojeto;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class MaisUmProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        for (int c = 1; c <= N; c++) {
            if ( c % 2 ==0 ) {
                System.out.printf("O numero " + c + " e par!\n");
            } else {
                System.out.printf("O numero " + c + " e impar!\n");
            }
        }
        System.out.println("");
        System.out.println("Obrigado pela participacao! Volte sempre!");
    }
    
}
