/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.questão.pkg1;


import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class POOQuestão1 {

   
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            municipio municipio = new municipio();
            
            System.out.println("Digite o número de imóveis a serem avaliados: ");
            int numImoveis = scanner.nextInt();
            
            for (int i = 0; i < numImoveis; i++) {
                System.out.println("\nImóvel " + (i + 1) + ":");
                System.out.println("Digite o nome do proprietário do Imóvel: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                
                System.out.println("Digite o valor do imposto que deverá a ser pago: ");
                double imposto = scanner.nextDouble();
                
                System.out.println("Digite a quantidade de meses de atraso: ");
                int mesesAtraso = scanner.nextInt();
                
                Imovel imovel = new Imovel(nome, imposto, mesesAtraso);
                municipio.adicionarImovel(imovel);
            }
            
            List<Imovel> imoveis = municipio.getListagemDeImoveis();
            
            for (Imovel imovel : imoveis) {
                double multa = calcularMulta(imovel.getImposto(), imovel.getMesesAtraso());
                System.out.println("Proprietário: " + imovel.getNomeProprietario() + ", Multa: R$" + multa);
            }
        }
    }

    public static double calcularMulta(double imposto, int mesesAtraso) {
        double multa = 0;
        if (mesesAtraso > 0) {
            if (mesesAtraso <= 5) {
                multa = imposto * 0.01;
            } else if (mesesAtraso >= 6 && mesesAtraso <= 8) {
                multa = imposto * 0.023;
            } else if (mesesAtraso >= 9 && mesesAtraso <= 10){
                multa = imposto * 0.03;
            } else if(mesesAtraso >= 11 && mesesAtraso <= 12){
                 multa = imposto * 0.054;
            } 
            else {
                multa = imposto * 0.1;
            }
        }
        return multa;
    }
}