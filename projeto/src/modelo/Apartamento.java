package modelo;

public class Apartamento extends Financiamento{
    private int vagasGaragem;
    public int getVagasGaragem(){ return vagasGaragem; };
    public void setVagasGaragem(int newVaga){
        vagasGaragem = newVaga;
    };

    private int andar;
    public int getAndar(){ return andar; };
    public void setAndar(int newAndar){
        andar = newAndar;
    };

    public Apartamento(double valImovel, int prazoFinanc, double taxaJurosAnual, int vagas, int andarApt){
        super(valImovel, prazoFinanc,taxaJurosAnual);

        setVagasGaragem(vagas);
        setAndar(andarApt);
    }

    @Override
    public double calcPagamentoMensal() {
        return (valorImovel / (prazoFinanciamento * 12)) * (1 + taxaJurosAnual / 12);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();

        System.out.println("Vagas de garagem: " + getVagasGaragem());
        System.out.println("Andar: " + getAndar());
    }
}
