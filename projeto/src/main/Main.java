package main;

public class Main {
    public static void main(String[] args){
        util.InterfaceUsuario user = new util.InterfaceUsuario();
        double valorImovel = user.valorImovel();
        int prazoFinanciamento = user.prazoFinanciamento();
        double taxaJuros = user.taxaJuros();

        modelo.Financiamento financiamento = new modelo.Financiamento(valorImovel, prazoFinanciamento, taxaJuros);

        financiamento.mostrarDados();
    }
}
