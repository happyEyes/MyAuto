
package it.auto.controllo;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;

public class AzioneEsci extends AbstractAction {

    private Controllo controllo;
    
    public AzioneEsci(Controllo controllo) {
        this.controllo = controllo;
        this.putValue(Action.NAME, "Esci");
        this.putValue(Action.MNEMONIC_KEY, new Integer(KeyEvent.VK_E));
        this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl E"));
    }
    
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
