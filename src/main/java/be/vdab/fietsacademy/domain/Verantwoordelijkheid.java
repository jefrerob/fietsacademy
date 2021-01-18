package be.vdab.fietsacademy.domain;

import javax.persistence.*;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "verantwoordelijkheden")
public class Verantwoordelijkheid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String naam;
    @ManyToMany
    @JoinTable(
            name = "docentenverantwoordelijkheden",
            joinColumns = @JoinColumn(name = "verantwoordelijkheidid"),
            inverseJoinColumns = @JoinColumn(name = "docentid"))
    private Set<Docent> docenten = new LinkedHashSet<>();

    protected Verantwoordelijkheid(){}

    public Verantwoordelijkheid(String naam) {
        this.naam = naam;
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public boolean add(Docent docent) {
        var toegevoegd = docenten.add(docent);
        if ( ! docent.getVerantwoordelijkheden().contains(this)) {
            docent.add(this);
        }
        return toegevoegd;
    }
    public boolean remove(Docent docent) {
        var verwijderd = docenten.remove(docent);
        if (docent.getVerantwoordelijkheden().contains(this)) {
            docent.remove(this);
        }
        return verwijderd;
    }
    public Set<Docent> getDocenten() {
        return Collections.unmodifiableSet(docenten);
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Verantwoordelijkheid)) return false;
        Verantwoordelijkheid that = (Verantwoordelijkheid) o;
        return naam.toUpperCase().equals(that.naam.toUpperCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam.toUpperCase());
    }
}