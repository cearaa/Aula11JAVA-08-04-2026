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
            if (senha.equals("P4ssw0rD")){
                System.out.println("Teste 1: Acesso autorizado!");
            } else {
                System.out.println("Acesso negado!");
            }
            //Verificando se senha é igual.
            if (senha.equalsIgnoreCase("P4ssw0rD")){
                System.out.println("Teste 1: Acesso concedido!");
            } else {
                System.out.println("Acesso impedido!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
