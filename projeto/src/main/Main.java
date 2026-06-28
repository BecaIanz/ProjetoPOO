package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        double somaValores = 0;
        double somaFinanciamento = 0;

        financiamentos.add(new Casa(200000, 10, 0.15));
        financiamentos.add(new Casa(300000, 16, 0.12));
        financiamentos.add(new Apartamento(230000, 11, 0.14));
        financiamentos.add(new Apartamento(450000, 22, 0.10));
        financiamentos.add(new Terreno(100000, 10, 0.10));

        int i = 1;
        for(Financiamento fin : financiamentos){
            somaValores += fin.getValorImovel();
            somaFinanciamento += fin.calcTotalPagamento();
            System.out.println("\n------------------------------\nFinanciamento " + i +"\nValor do imóvel: R$" + String.format("%.2f", fin.getValorImovel())  + "\nValor do Financiamento: R$" +  String.format("%.2f", fin.calcTotalPagamento()));
            i++;
        }

        System.out.println("\n\nSoma imoveis: R$" + somaValores);
        System.out.println("Soma Total dos Financiamentos: R$" + somaFinanciamento);
    }
}
