package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LanguageRepository extends JpaRepository<Language,Integer> {

}
