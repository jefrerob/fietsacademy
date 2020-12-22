package be.vdab.fietsacademy.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("I")
public class IndividueleCursus extends Cursus {
    private int duurtijd;

    protected IndividueleCursus() {
    }

    public IndividueleCursus(long id, String naam, int duurtijd) {
        super(id, naam);
        this.duurtijd = duurtijd;
    }
}
