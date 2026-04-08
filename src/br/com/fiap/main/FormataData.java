package br.com.fiap.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormataData {
    public static void main(String[] args) {
    LocalDate dataAtual = LocalDate.now();
    LocalDate fimDosTempos = LocalDate.parse("2012-12-21");

        Period bonus = Period.between(fimDosTempos, dataAtual);
        System.out.printf("Desde os fim dos tempos, passaram-se\n%d anos\n%d meses\n%d dias\n\n", bonus.getYears(), bonus.getMonths(), bonus.getDays());

        System.out.println("Data atual dos EUA: " + dataAtual);

        //Mét para mostrar a data de acordo com a origem do usuário. Mét DateTimeFormetter.ofPattern e dentro dos parênteses fica o formato que você quer.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data atual do Brasilzão: " + dataAtual.format(dtf));
    }
}
