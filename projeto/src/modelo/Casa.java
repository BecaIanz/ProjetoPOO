package modelo;

public class Casa extends Financiamento{

    public Casa(double valImovel, int prazoFinanc, double taxaJurosAnual){
        super(valImovel, prazoFinanc,taxaJurosAnual);
    }

    public double calcPagamentoMensal(){
        return super.calcPagamentoMensal() + 240;
    }
}
