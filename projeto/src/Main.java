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
    double CalcPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) *(1 + (this.taxaJurosAnual / 12));
    }
    double CalcTotalPagamento(){
        return this.CalcPagamentoMensal() * this.prazoFinanciamento * 12;
    }

}
class InterfaceUsuario{
    /*
    i. Esta classe é responsável por lidar com a entrada de dados do usuário. Estes dados podem ser recebidos via entrada do usuário usando o Scanner.

    3. Pedir ao usuário a taxa de juros: Ela deve conter um metodo o qual pede ao usuário para que digite a taxa de juros anual, e retorne o valor digitado pelo usuário.
     */
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

        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);
    }
}