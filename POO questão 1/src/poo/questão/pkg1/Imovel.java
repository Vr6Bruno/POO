/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.questão.pkg1;

/**
 *
 * @author Lenovo
 */
public class Imovel {
   private String nomeProprietario;
    private double imposto;
    private int mesesAtraso;

    public Imovel(String nomeProprietario, double imposto, int mesesAtraso) {
        this.nomeProprietario = nomeProprietario;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public double getImposto() {
        return imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }
}
