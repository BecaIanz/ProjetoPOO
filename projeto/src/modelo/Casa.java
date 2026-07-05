package modelo;

import util.AcrescimoMaiorQueJurosException;

public class Casa extends Financiamento{
    private double tamAreaConstruida;
    public double getTamAreaConst(){ return tamAreaConstruida; };
    public void setTamAreaConstruida(double newTam){
        tamAreaConstruida = newTam;
    };

    private double tamAreaTerreno;
    public double getTamAreaTerreno(){ return tamAreaTerreno; };
    public void setTamAreaTerreno(double newTam){
        tamAreaTerreno = newTam;
    };

    public Casa(double valImovel, int prazoFinanc, double taxaJurosAnual, double areaConst, double areaTotal){
        super(valImovel, prazoFinanc,taxaJurosAnual);
        setTamAreaConstruida(areaConst);
        setTamAreaTerreno(areaTotal);
    }

    public double calcPagamentoMensal(){
        double parcelaSemJuros = valorImovel / (prazoFinanciamento * 12);
        double juros = parcelaSemJuros * (taxaJurosAnual / 12);
        try {
            validaValorJuros(juros, 80);
        } catch (AcrescimoMaiorQueJurosException e) {
            System.out.println(e.getMessage());
        }

        return (this.valorImovel / (this.prazoFinanciamento * 12)) *(1 + (this.taxaJurosAnual / 12)) + 80;
    }


    @Override
    public void mostrarDados(int i) {
        super.mostrarDados(i);

        System.out.println("Área construída: " + getTamAreaConst());
        System.out.println("Área terreno: " + getTamAreaTerreno());
    }
    private void validaValorJuros(double juros, double acrescimo) throws AcrescimoMaiorQueJurosException {
        if (acrescimo > juros / 2) {
            throw new AcrescimoMaiorQueJurosException(
                    "O aumento de R$" + acrescimo + " é maior que metade dos juros."
            );
        }
    }


}
