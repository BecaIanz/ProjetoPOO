package main;

import modelo.Financiamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        financiamentos.add(new Financiamento(200000, 10, 0.15));
        financiamentos.add(new Financiamento(300000, 16, 0.12));
        financiamentos.add(new Financiamento(230000, 11, 0.14));
        financiamentos.add(new Financiamento(450000, 22, 0.10));

        int i = 1;
        for(Financiamento fin : financiamentos){
            System.out.println("\n------------------------------\nFinanciamento " + i + "\nValor do imóvel: R$" + String.format("%.2f", fin.getValorImovel())  + "\nValor do Financiamento: R$" +  String.format("%.2f", fin.calcTotalPagamento()));
            i++;
        }
    }
}
