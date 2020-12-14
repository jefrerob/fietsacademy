package be.vdab.fietsacademy.domain;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "docenten")
public class Docent {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String voornaam;
        private String familienaam;
        private BigDecimal wedde;
        private String emailAdres;
        @Enumerated(EnumType.STRING)
        private Geslacht geslacht;


        protected Docent(){
        }

        public Docent(String voornaam, String familienaam, BigDecimal wedde, String emailAdres, Geslacht geslacht) {
                this.voornaam = voornaam;
                this.familienaam = familienaam;
                this.wedde = wedde;
                this.emailAdres = emailAdres;
                this.geslacht = geslacht;
        }

        public long getId() {
                return id;
        }

        public String getVoornaam() {
                return voornaam;
        }

        public String getFamilienaam() {
                return familienaam;
        }

        public BigDecimal getWedde() {
                return wedde;
        }

        public String getEmailAdres() {
                return emailAdres;
        }

        public Geslacht getGeslacht() {
                return geslacht;
        }
}
