package main;

import java.util.Scanner;
import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        double somaValores = 0;
        double somaFinanciamento = 0;
        System.out.println("-----------------------\nCasa 1\n");
        financiamentos.add(cadastrarImovel("casa"));
        System.out.println("-----------------------\nCasa 2\n");
        financiamentos.add(cadastrarImovel("casa"));
        System.out.println("-----------------------\nApartamento 1\n");
        financiamentos.add(cadastrarImovel("apartamento"));
        System.out.println("-----------------------\nApartamento 2\n");
        financiamentos.add(cadastrarImovel("apartamento"));
        System.out.println("-----------------------\nTerreno 1\n");
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
        InterfaceUsuario ui = new InterfaceUsuario(sc);

        double valor = ui.valorImovel();
        int prazo = ui.prazoFinanciamento();
        double taxa = ui.taxaJuros();

        if(tipo.equals("casa")){
            System.out.println("Digite o tamanho da àrea contruida da casa: ");
            double areaConst = sc.nextDouble();
            System.out.println("Digite o tamanho da àrea total do terreno da casa: ");
            double areaTotal = sc.nextDouble();

            return new Casa(valor, prazo, taxa, areaConst, areaTotal);
        }
        else if(tipo.equals("apartamento")){
            System.out.println("Digite a quantidade de vagas de garagem: ");
            int garagem = sc.nextInt();
            System.out.println("Digite o andar do apartamento: ");
            int andar = sc.nextInt();

            return new Apartamento(valor, prazo, taxa, garagem, andar);
        }
        else{
            System.out.println("Digite o tipo de zona (ex. residencial ou comercial):");
            String zona = sc.next();
            return new Terreno(valor, prazo, taxa, zona);
        }
    }
}


