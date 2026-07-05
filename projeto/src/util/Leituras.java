package util;

import java.util.Scanner;

public class Leituras {
    public double lerDouble(Scanner sc){
        double numeroLido;
        while(true){
            try{
                numeroLido = sc.nextDouble();
                if(numeroLido < 0){
                    throw new Exception("Valor invalido");
                }
                break;
            }
            catch (Exception e){
                System.out.println("O valor inserido é invalido! Digite a taxa novamente: ");
                sc.nextLine();
            }
        }
        return numeroLido;
    }
    public int lerInt(Scanner sc){
        int numeroLido;
        while(true){
            try{
                numeroLido = sc.nextInt();
                if(numeroLido < 0){
                    throw new Exception("Valor invalido");
                }
                break;
            }
            catch (Exception e){
                System.out.println("O valor inserido é invalido! Digite a taxa novamente: ");
                sc.nextLine();
            }
        }
        return numeroLido;
    }
}
