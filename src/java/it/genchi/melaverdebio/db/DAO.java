/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.genchi.melaverdebio.db;

/**
 *
 * @author JAVASE
 */
public interface DAO<e> {
    boolean fill(e lista);
    boolean fill(e lista, String categoria);
}
