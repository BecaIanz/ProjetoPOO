package util;

import java.util.Scanner;

public class InterfaceUsuario {
    Scanner sc;
    Leituras lt = new Leituras();
    public InterfaceUsuario(Scanner scanner){
        sc = scanner;
    }
    public double valorImovel() {
        System.out.println("Digite o valor do imóvel desejado: ");
        double valor = lt.lerDouble(sc);
        return valor;
    }

    public int prazoFinanciamento() {
        System.out.println("Digite o prazo do financiamento desejado: ");
        int prazo = lt.lerInt(sc);
        return prazo;
    }
    public double taxaJuros(){
        System.out.println("Digite a taxa de juros: ");
        double taxa = lt.lerDouble(sc);
        return taxa;
    }

}
