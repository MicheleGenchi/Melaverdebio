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
public class ListaArticoliBean {
    private List<ArticoloBean> lista;

    public ListaArticoliBean() {
        this.lista = new ArrayList<>();
    }

    public List<ArticoloBean> getLista() {
        return lista;
    }

    public void setLista(List<ArticoloBean> lista) {
        this.lista = lista;
    }

    public void aggiungi(ArticoloBean articolo) {
        lista.add(articolo);
    }
    
    
    
}
