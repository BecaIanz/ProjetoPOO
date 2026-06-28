package modelo;

public class Apartamento extends Financiamento{


    public Apartamento(double valImovel, int prazoFinanc, double taxaJurosAnual){
        super(valImovel, prazoFinanc,taxaJurosAnual);
    }

    @Override
    public double calcTotalPagamento() {
        return super.valorImovel * (1 + (super.taxaJurosAnual * super.prazoFinanciamento));
    }

    @Override
    public double calcPagamentoMensal() {
        return calcTotalPagamento() / (super.prazoFinanciamento * 12);
    }
}
