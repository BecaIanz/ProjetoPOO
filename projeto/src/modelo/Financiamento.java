package modelo;

public abstract class Financiamento {
    // CRIAÇÃO DE VARIAVEIS
    protected double valorImovel;
    public double getValorImovel(){
        return valorImovel;
    }
    public void setValorImovel(double newValue){
        this.valorImovel = newValue;
    }

    protected int prazoFinanciamento;
    public int getPrazoFinanciamento(){
        return prazoFinanciamento;
    }
    public void setPrazoFinanciamento(int newValue){
        this.prazoFinanciamento = newValue;
    }

    protected double taxaJurosAnual;
    public double getTaxaJurosAnual(){
        return taxaJurosAnual;
    }
    public void setTaxaJurosAnual(double novaTaxa){
        this.taxaJurosAnual = novaTaxa;
    }

    // MÉTODOS
    public Financiamento(double valImovel, int prazoFinanc, double taxaJurosAnual){
        this.valorImovel = valImovel;
        this.prazoFinanciamento = prazoFinanc;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public abstract double calcPagamentoMensal();

    public double calcTotalPagamento(){
        return this.calcPagamentoMensal() * this.prazoFinanciamento * 12;
    }
    public void mostrarDados(int posicao){
        System.out.println("==================================== Dados Financiamento " + posicao + " ====================================");
        System.out.print("\nValor do Imóvel: R$");
        System.out.println(valorImovel);

        System.out.print("Prazo do Financiamento: ");
        System.out.println(prazoFinanciamento);

        System.out.print("Taxa de Juros: ");
        System.out.println(taxaJurosAnual);

        System.out.print("Pagamento mensal: R$");
        System.out.println(String.format("%.2f", calcPagamentoMensal()));

        System.out.print("Total com juros: R$");
        System.out.println(String.format("%.2f", calcTotalPagamento()));
    }
}
