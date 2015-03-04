

package it.auto.controllo;

import it.auto.Costanti;
import it.auto.modello.Concessionaria;
import it.auto.modello.Preventivo;
import it.auto.vista.PannelloPrincipale;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;


public class AzioneAnnulla extends AbstractAction{

    private Controllo controllo;
    
    public AzioneAnnulla(Controllo controllo) {
        this.controllo = controllo;
        this.putValue(Action.NAME, "Annulla");
        this.putValue(Action.MNEMONIC_KEY, new Integer(KeyEvent.VK_A));
        this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl A"));
    }
    
       
    public void actionPerformed(ActionEvent e) {
      PannelloPrincipale pannello = (PannelloPrincipale) this.controllo.getVista().getSottoVista(Costanti.PANNELLO);
      Preventivo pre = (Preventivo) this.controllo.getModello().getBean(Costanti.DATI_PREVENTIVO);
      pannello.ripulisci();
      pannello.abilitaCampi();
      pannello.abilitaLista();
      ((AzioneRegistra)this.controllo.getAzione(Costanti.AZIONE_REGISTRA)).disabilita();
      ((AzioneSeleziona)this.controllo.getAzione(Costanti.AZIONE_SELEZIONA)).disabilita();
    }

}
