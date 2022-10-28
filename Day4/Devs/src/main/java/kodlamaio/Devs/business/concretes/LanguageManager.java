package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository repository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.repository = languageRepository;
    }

    @Override
    public List<Language> listAllLanguages() {
        return  repository.listAll();
    }

    @Override
    public void deleteLanguage(int id) {
        repository.delete(id);
    }

    @Override
    public void addLanguage(Language language) throws Exception {
        if(language.getName() == ""){
            throw new Exception("Programming language name cannot be empty!");
        }
        for(Language lang : listAllLanguages()){
            if(lang.getName() == language.getName()){
                throw new Exception("Name mismatch, there's an existing language with same name!");
            }
        }
        repository.add(language);
    }

    @Override
    public Language updateLanguage(int id, Language language) throws Exception {
        if(language.getName() == ""){
            throw new Exception("Programming language name cannot be empty!");
        }
        for(Language lang : listAllLanguages()){
            if(lang.getName() == language.getName()){
                throw new Exception("Name mismatch, there's an existing language with same name!");
            }
        }
        return repository.update(id,language);
    }

    @Override
    public Language getLanguageById(int id) {
        return repository.getById(id);
    }
}
