import java.util.Scanner;

class Financiamento{

    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;

    Financiamento(double valImovel, int prazoFinanc, double taxaJurosAnual){
        this.valorImovel = valImovel;
        this.prazoFinanciamento = prazoFinanc;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    double calcPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) *(1 + (this.taxaJurosAnual / 12));
    }
    double calcTotalPagamento(){
        return this.calcPagamentoMensal() * this.prazoFinanciamento * 12;
    }

}
class InterfaceUsuario{

    Scanner sc = new Scanner(System.in);

    double valorImovel(){
        System.out.println("Digite o valor do imovel desejado: ");
        double valor = sc.nextDouble();
        return valor;
    }

    int prazoFinanciamento(){
        System.out.println("Digite o prazo do financiamento desejado: ");
        int prazo = sc.nextInt();
        return prazo;
    }
    double taxaJuros(){
        System.out.println("Digute a taxa de juros: ");
        double taxa = sc.nextDouble();
        return taxa;
    }

}


public class Main{
    public static void main(String[] args){
        InterfaceUsuario user = new InterfaceUsuario();
        double valorImovel = user.valorImovel();
        int prazoFinanciamento = user.prazoFinanciamento();
        double taxaJuros = user.taxaJuros();

        System.out.print("---------------------------\n\nValor do Imóvel: R$");
        System.out.println(valorImovel);

        System.out.print("Prazo do Financiamento: ");
        System.out.println(prazoFinanciamento);

        System.out.print("Taxa de Juros: ");
        System.out.println(taxaJuros);

        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);

        System.out.print("Pagamento mensal: R$");
        System.out.println(String.format("%.2f", financiamento.calcPagamentoMensal()));

        System.out.print("Total com juros: R$");
        System.out.println(String.format("%.2f",financiamento.calcTotalPagamento()));
    }
}