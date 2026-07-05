package modelo;

public class Terreno extends Financiamento{
    private String tipoZona;
    public String getTipoZona(){ return tipoZona; };
    public void setTipoZona(String newZona){
        tipoZona = newZona;
    };
    public Terreno(double valImovel, int prazoFinanc, double taxaJurosAnual, String zona){
        super(valImovel, prazoFinanc,taxaJurosAnual);
        setTipoZona(zona);
    }

    @Override
    public double calcPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) *(1 + (this.taxaJurosAnual / 12)) * 1.02;
    }

    @Override
    public void mostrarDados(int i) {
        super.mostrarDados(i);

        System.out.println("Tipo de Zona: " + getTipoZona());
    }
}
