package br.com.fiap.main;

public class ManipulaString {
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma";
        System.out.println(frase);

        //Mostrar quantidade de letras
        int qtdeCaracteres= frase.length();
        System.out.println("Quantidade de letras: " + qtdeCaracteres);

        //ToupperCase mostra tudo em Maíusculo.
        System.out.println(frase.toUpperCase());

        //ToLowerCase converte tudo para Minúsculo.
        System.out.println(frase.toLowerCase());

        //Exibe apenas as palavras da variavel String, de acordo com a posição da mesma.
        System.out.println(frase.substring(30, 34));

        //Troca uma palavra dentro da String declarada - neste caso frase - dentro de aspas. A primeira aspas é a palavra que quer trocar e a segunda é a palavra que vai substituir
        System.out.println(frase.replace("O rato", "A traça"));

    }
}
