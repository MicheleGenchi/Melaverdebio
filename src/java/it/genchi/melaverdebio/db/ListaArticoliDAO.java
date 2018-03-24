/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.genchi.melaverdebio.db;

import it.genchi.melaverdebio.bean.ArticoloBean;
import it.genchi.melaverdebio.bean.ListaArticoliBean;
import it.genchi.melaverdebio.utilita.ErrMsg;
import it.genchi.melaverdebio.utilita.Errors;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAVASE
 */
public class ListaArticoliDAO extends DAOClass<ListaArticoliBean> {

    @Override
    public boolean fill(ListaArticoliBean lista, String categoria) {
        boolean valid = false;
        String sql = "SELECT idArticolo,descrizione,catmerceologica "
                + "FROM melaverdebio.magazzino where catMerceologica=? ORDER BY ?";
        try (Connection conn = DBConnect.get();
                PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, categoria);
            st.setInt(2, 2);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ArticoloBean articolo = new ArticoloBean();
                articolo.setIdArticolo(rs.getString("idArticolo"));
                articolo.setDescrizione(rs.getString("descrizione"));
                articolo.setCatmerceologica(rs.getString("catmerceologica"));
                lista.aggiungi(articolo);
            }
            valid = true;
        } catch (Exception ex) {
            ErrMsg.aggiungi(Errors.DataBaseInsesistente.getDescrizione()
                    + " - mancano le informazioni del magazzino");
            Logger.getLogger(ListaArticoliDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Database error in " + this.getClass().getSimpleName());
        } finally {
            return valid;
        }

    }
}
