package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> listAllLanguages();
    void deleteLanguage(int id);
    void addLanguage(Language language) throws Exception;
    Language updateLanguage(int id,Language language) throws Exception;
    Language getLanguageById(int id);
}
