package main;

import java.util.Scanner;
import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        double somaValores = 0;
        double somaFinanciamento = 0;

        financiamentos.add(cadastrarImovel("casa"));
        financiamentos.add(cadastrarImovel("casa"));
        financiamentos.add(cadastrarImovel("apartamento"));
        financiamentos.add(cadastrarImovel("apartamento"));
        financiamentos.add(cadastrarImovel("terreno"));

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
    public static Financiamento cadastrarImovel( String tipo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do imóvel: ");
        double valor = sc.nextDouble();

        System.out.print("Prazo: ");
        int prazo = sc.nextInt();

        System.out.print("Taxa anual: ");
        double texto = sc.nextDouble();
        System.out.println("Você digitou: " + texto);

        if(tipo.equals("casa")){
            return new Casa(valor, prazo, 1);
        }
        else if(tipo.equals("apartamento")){
            return new Apartamento(valor, prazo, 1);
        }
        else{
            return new Terreno(valor, prazo, 1);
        }
    }
}


