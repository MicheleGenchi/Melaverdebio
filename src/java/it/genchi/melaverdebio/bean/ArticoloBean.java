/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.genchi.melaverdebio.bean;

/**
 *
 * @author JAVASE
 */
public class ArticoloBean {
    private String idArticolo;
    private String descrizione;
    private String catmerceologica;

    public ArticoloBean() {
        this.idArticolo = "";
        this.descrizione="";
        this.catmerceologica="";
    }

    public String getCatmerceologica() {
        return catmerceologica;
    }

    public void setCatmerceologica(String catmerceologica) {
        this.catmerceologica = catmerceologica;
    }

    public String getIdArticolo() {
        return idArticolo;
    }

    public void setIdArticolo(String idArticolo) {
        this.idArticolo = idArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    
}
