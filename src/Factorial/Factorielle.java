package Factorial;

import java.util.Scanner;


public class Factorielle {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int nb;
        
        System.out.println("Saisir nb=");
        nb = input.nextInt();
        System.out.println("fact(" + nb + ") = " + fact(nb));
    }
    
    private static int fact(int n) {
        int returnFact;
        
        System.out.println("n = " + n);
        if (n == 0) {
            returnFact = 1;
        } else {
            returnFact = fact(n - 1) * n;
        }
        
        return returnFact;
    }
}
