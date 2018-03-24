/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.genchi.melaverdebio.db;

import it.genchi.melaverdebio.bean.ListaCategorieBean;
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
public class CategoriaDAO extends DAOClass<ListaCategorieBean> {

    @Override
    public boolean fill(ListaCategorieBean lista) {
        boolean valid = false;
        String sql = "SELECT DISTINCT catmerceologica FROM melaverdebio.magazzino ORDER BY catmerceologica;";
        try (Connection conn = DBConnect.get();
                PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lista.aggiungi(rs.getString("catmerceologica"));
            }
            valid = true;
        } catch (Exception ex) {
            ErrMsg.aggiungi(Errors.DataBaseInsesistente.getDescrizione()
                    + " - mancano le informazioni sulle categorie");
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Database error in " + this.getClass().getSimpleName());
        } finally {
            return valid;
        }
    }
}
