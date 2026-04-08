package br.com.fiap.main;

import java.util.Scanner;

public class ComparaString {
    public static void main(String[] args) {
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Dígite sua senha: ");
            String senha = scan.next();

            //Verificando se senha é idêntica.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
