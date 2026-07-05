package util;

import java.util.Scanner;

public class InterfaceUsuario {
    Scanner sc;
    public InterfaceUsuario(Scanner scanner){
        sc = scanner;
    }
    public double valorImovel(){
        System.out.println("Digite o valor do imovel desejado: ");
        double valor = 0;
        while(true){
            valor = sc.nextDouble();
            if(valor < 0){
                System.out.println("O valor inserido é inválido! Digite o valor novamente: ");
                continue;
            }
            else {
                break;
            }
        }
        return valor;
    }

    public int prazoFinanciamento(){
        System.out.println("Digite o prazo do financiamento desejado: ");
        int prazo = 0;
        while(true){
            prazo = sc.nextInt();
            if(prazo < 0){
                System.out.println("O valor inserido é inválido! Digite o prazo novamente: ");
                continue;
            }
            else {
                break;
            }
        }
        return prazo;
    }
    public double taxaJuros(){
        System.out.println("Digite a taxa de juros: ");
        double taxa = 0;
        while(true){
            try{
                taxa = sc.nextDouble();
                if(taxa < 0){
                    System.out.println("O valor inserido é inválido! Digite a taxa novamente: ");
                    continue;
                }
                else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("O valor inserido é inválido! Digite a taxa novamente: ");
                sc.nextLine();
            }
        }
        return taxa;
    }
}
