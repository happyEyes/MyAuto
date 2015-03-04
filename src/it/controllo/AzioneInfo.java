
package it.auto.controllo;

import it.auto.controllo.Controllo;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;


public class AzioneInfo extends AbstractAction {

    private Controllo controllo;

    public AzioneInfo(Controllo controllo) {
        this.controllo = controllo;
        this.putValue(Action.NAME, "Informazioni");
        this.putValue(Action.MNEMONIC_KEY, new Integer(KeyEvent.VK_I));
        this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl I"));
    }

    public void actionPerformed(ActionEvent e) {
        this.controllo.getVista().finestraInfo();
    }
}
