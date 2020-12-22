package be.vdab.fietsacademy.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("G")
public class GroepsCursus extends Cursus{
    private LocalDate van;
    private LocalDate tot;

    protected GroepsCursus() {
    }

    public GroepsCursus(long id, String naam, LocalDate van, LocalDate tot) {
        super(id, naam);
        this.van = van;
        this.tot = tot;
    }

    public LocalDate getVan() {
        return van;
    }

    public LocalDate getTot() {
        return tot;
    }



}
