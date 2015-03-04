package it.auto.modello;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Preventivo {

    
    
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private Calendar dataEmissione;
    private ModelloAuto modelloAuto = new ModelloAuto();
    private Finanziamento finanziamento = new Finanziamento();
    
    public Preventivo(){}

    public Preventivo(String nome, String cognome, String cf, Calendar data, ModelloAuto modello, Finanziamento fi) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = cf;
        this.dataEmissione = data;
        this.modelloAuto = modello;
        this.finanziamento = fi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Calendar getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(Calendar dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    public ModelloAuto getModelloAuto() {
        return modelloAuto;
    }

    public void setModelloAuto(ModelloAuto modelloAuto) {
        this.modelloAuto = modelloAuto;
    }

    public Finanziamento getFinanziamento() {
        return finanziamento;
    }

    public void setFinanziamento(Finanziamento finanziamento) {
        this.finanziamento = finanziamento;
    }
}
