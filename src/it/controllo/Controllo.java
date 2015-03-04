
package it.auto.controllo;

import it.auto.Costanti;
import it.auto.modello.Concessionaria;
import it.auto.modello.Modello;
import it.auto.persistenza.MDAOConcessionaria;
import it.auto.vista.Vista;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Action;
import javax.swing.JOptionPane;


public class Controllo {

    private Modello modello;
    private Vista vista;
    private Map mappaAzioni = new HashMap();

    public Controllo() {
        inizializzaAzioni();
        this.modello = new Modello();
        this.vista = new Vista(getModello(), this);
        
        postInizializzaAzioni();
        
        try {
            Concessionaria concessionaria = MDAOConcessionaria.caricaDati();
            this.modello.putBean(Costanti.CONCESSIONARIA, concessionaria);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Errore nel sistema", "ERRORE", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public Action getAzione(String chiave) {
        return (Action) this.mappaAzioni.get(chiave);
    }

    private void postInizializzaAzioni() {
        
    }
    
    private void inizializzaAzioni() {
        this.mappaAzioni.put(Costanti.AZIONE_ESCI, new AzioneEsci(this));
        this.mappaAzioni.put(Costanti.AZIONE_INFO, new AzioneInfo(this));
        this.mappaAzioni.put(Costanti.AZIONE_INSERIMENTO, new AzioneInserimento(this));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Controllo();
            }
        });
    }

    public Modello getModello() {
        return modello;
    }

    public Vista getVista() {
        return vista;
    }
}
