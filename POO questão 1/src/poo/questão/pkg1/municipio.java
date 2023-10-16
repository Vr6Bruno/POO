/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.questão.pkg1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class municipio {
    private List<Imovel> listagemDeImoveis;

    public municipio() {
        listagemDeImoveis = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovel) {
        listagemDeImoveis.add(imovel);
    }

    public List<Imovel> getListagemDeImoveis() {
        return listagemDeImoveis;
    }
    
}
