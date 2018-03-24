/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.genchi.melaverdebio.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAVASE
 */
public class ListaCategorieBean {
    private List<String> lista;

    public ListaCategorieBean() {
        this.lista = new ArrayList<>();
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public void aggiungi(String nuovaCategoria) {
        lista.add(nuovaCategoria);
    }
}
