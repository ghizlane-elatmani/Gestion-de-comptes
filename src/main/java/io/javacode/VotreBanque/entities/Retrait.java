package io.javacode.VotreBanque.entities;

import java.util.Date;

public class Retrait extends Operation {

    public Retrait() {
    }

    public Retrait(Date dateOperation, double montant, Compte compte) {
        super(dateOperation, montant, compte);
    }

}
