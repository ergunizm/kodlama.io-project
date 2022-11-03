package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.concretes.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SubTechRepository extends JpaRepository<SubTechnology,Integer> {
}
