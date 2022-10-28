package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> listAll();
    void delete(int id);
    void add(Language language);
    Language update(int id,Language language);
    Language getById(int id);
}
