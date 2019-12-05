package be.ehb.demo_arm_beestjes.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BeestDAO extends CrudRepository<Beest, Integer> {
//dieren zoeken op soortextra query
    Iterable<Beest> findBeestBySoortOrderByNaam(String soort);
    //andere methode (zelf query uitschrijven)
    @Query(value = "select b from Beest b where b.naam= :naam")
    Iterable<Beest> zoekBijNaam (String naam);
}
