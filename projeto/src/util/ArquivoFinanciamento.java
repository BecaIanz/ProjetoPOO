package util;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ArquivoFinanciamento {

    public static void salvarTexto(ArrayList<Financiamento> lista) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("financiamentos.txt"));

            for (Financiamento fin : lista) {

                if (fin instanceof Casa) {
                    Casa casa = (Casa) fin;
                    out.println("CASA;" + casa.getValorImovel() + ";" + casa.calcTotalPagamento() + ";" + casa.getTaxaJurosAnual() + ";" + casa.getPrazoFinanciamento() + ";" + casa.getTamAreaConst() + ";" + casa.getTamAreaTerreno());
                }
                else if (fin instanceof Apartamento) {
                    Apartamento apt = (Apartamento) fin;
                    out.println("APARTAMENTO;" + apt.getValorImovel() + ";" + apt.calcTotalPagamento() + ";" + apt.getTaxaJurosAnual() + ";" + apt.getPrazoFinanciamento() + ";" + apt.getVagasGaragem() + ";" + apt.getAndar());
                }
                else if (fin instanceof Terreno) {
                    Terreno terreno = (Terreno) fin;
                    out.println("TERRENO;" + terreno.getValorImovel() + ";" + terreno.calcTotalPagamento() + ";" + terreno.getTaxaJurosAnual() + ";" + terreno.getPrazoFinanciamento() + ";" + terreno.getTipoZona());
                }
            }
            out.close();
            System.out.println("Arquivo salvo com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo.");
            e.printStackTrace();
        }
    }

    public static void lerTexto() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("financiamentos.txt"));
            String linha;
            System.out.println("\n===== Dados salvos =====");
            while ((linha = in.readLine()) != null) {
                System.out.println(linha);
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
    public static void salvarObjetos(ArrayList<Financiamento> lista) {

        try {

            ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("financiamentos.dat"));

            out.writeObject(lista);

            out.close();

            System.out.println("Arquivo serializado salvo com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar objetos.");
            e.printStackTrace();
        }

    }
    @SuppressWarnings("unchecked")
    public static void lerObjetos() {
        try {
            ObjectInputStream in = new ObjectInputStream( new FileInputStream("financiamentos.dat"));
            ArrayList<Financiamento> lista = (ArrayList<Financiamento>) in.readObject();
            in.close();
            System.out.println("\n===== FINANCIAMENTOS SERIALIZADOS =====");
            int i = 1;
            for (Financiamento fin : lista) {
                fin.mostrarDados(i);
                i++;
            }
        }
        catch (IOException e) {
            System.out.println("Erro ao ler arquivo serializado.");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
            e.printStackTrace();
        }
    }
}