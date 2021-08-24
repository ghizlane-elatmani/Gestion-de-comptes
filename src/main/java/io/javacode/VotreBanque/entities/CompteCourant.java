package io.javacode.VotreBanque.entities;

import java.util.Date;

public class CompteCourant extends Compte {

    private double decouvert;

    public CompteCourant() {
        super();
    }

    public CompteCourant(String codeCompte, Date dateCreation, double solde, Client client, double decouvert) {
        super(codeCompte, dateCreation, solde, client);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

}
