package modelo;

public class Terreno extends Financiamento{

    public Terreno(double valImovel, int prazoFinanc, double taxaJurosAnual){
        super(valImovel, prazoFinanc,taxaJurosAnual);
    }

    @Override
    public double calcPagamentoMensal() {
        return super.calcPagamentoMensal() + (super.calcPagamentoMensal() * 0.02);
    }
}
