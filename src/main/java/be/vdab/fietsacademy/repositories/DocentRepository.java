package be.vdab.fietsacademy.repositories;

import be.vdab.fietsacademy.domain.Docent;
import be.vdab.fietsacademy.queryresults.AantalDocentenPerWedde;
import be.vdab.fietsacademy.queryresults.IdEnEmailAdres;


import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface DocentRepository {
    Optional<Docent> findById(long id);
    void create(Docent docent);
    void delete(long id);
    List<Docent> findAll();
    List<Docent> findByWeddeBetween(BigDecimal van, BigDecimal tot);
    List<String> findEmailAdressen();
    List<IdEnEmailAdres> findIdsEnEmailAdressen();
    BigDecimal findGrootsteWedde();
    List<AantalDocentenPerWedde> findAantalDocentenPerWedde();
    int algemeneOpslag(BigDecimal percentage);
    Optional<Docent> findByIdWithLock(long id);
}
