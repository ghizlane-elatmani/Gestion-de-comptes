package io.javacode.VotreBanque.entities;

import java.util.Date;

public class Versement extends Operation {

    public Versement() {
    }

    public Versement(Date dateOperation, double montant, Compte compte) {
        super(dateOperation, montant, compte);
    }

}
