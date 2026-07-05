package modelo;

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
        return (this.valorImovel / (this.prazoFinanciamento * 12)) *(1 + (this.taxaJurosAnual / 12)) + 240;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();

        System.out.println("Área construída: " + getTamAreaConst());
        System.out.println("Área terreno: " + getTamAreaTerreno());
    }
}
