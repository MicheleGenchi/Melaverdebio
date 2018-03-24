/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.genchi.melaverdebio.utilita;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAVASE
 */
public class ErrMsg {
    private static List<String> msgs=new ArrayList<>();

    public static List<String> getMsgs() {
        return msgs;
    }

    public static void aggiungi(String msg) {
        msgs.add(msg);
    }
    
    public static void aggiungi(Errors msg) {
        msgs.add(msg.getDescrizione());
    }
    
    public static boolean isErr() {
        return !msgs.isEmpty();
    }
    
    public static void clear() {
        msgs.clear();
    }
}

