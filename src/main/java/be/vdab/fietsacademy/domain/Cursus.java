package be.vdab.fietsacademy.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "cursussen")
@DiscriminatorColumn(name = "soort")
public abstract class Cursus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String naam;

    protected Cursus() {
    }

    public Cursus(long id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }



}