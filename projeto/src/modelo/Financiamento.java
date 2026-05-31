package modelo;

public class Financiamento {

    private double valorImovel;
    public double getValorImovel(){
        return valorImovel;
    }
    public void setValorImovel(double newValue){
        this.valorImovel = newValue;
    }

    private int prazoFinanciamento;
    public int getPrazoFinanciamento(){
        return prazoFinanciamento;
    }
    public void setPrazoFinanciamento(int newValue){
        this.prazoFinanciamento = newValue;
    }

    private double taxaJurosAnual;
    public double getTaxaJurosAnual(){
        return taxaJurosAnual;
    }
    public void setTaxaJurosAnual(double novaTaxa){
        this.taxaJurosAnual = novaTaxa;
    }

    public Financiamento(double valImovel, int prazoFinanc, double taxaJurosAnual){
        this.valorImovel = valImovel;
        this.prazoFinanciamento = prazoFinanc;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    public double calcPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) *(1 + (this.taxaJurosAnual / 12));
    }
    public double calcTotalPagamento(){
        return this.calcPagamentoMensal() * this.prazoFinanciamento * 12;
    }
    public void mostrarDados(){
        System.out.println("==================================== Dados Financiamento ====================================");
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
