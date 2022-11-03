package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.business.requests.CreateLanguageRequest;
import kodlamaio.Devs.business.requests.UpdateLanguageRequest;
import kodlamaio.Devs.business.responses.GetAllLanguagesResponse;
import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository repository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.repository = languageRepository;
    }

    @Override
    public List<GetAllLanguagesResponse> listAllLanguages() {
        List<Language> languages = repository.findAll();
        List<GetAllLanguagesResponse> returnedList = new ArrayList<>();

        for(Language lang : languages){
            GetAllLanguagesResponse singleLang = new GetAllLanguagesResponse();
            singleLang.setName(lang.getName());
            singleLang.setId(lang.getId());
            singleLang.setType(lang.getType());

            returnedList.add(singleLang);
        }

        return returnedList;
    }

    @Override
    public void deleteLanguage(int id) {
        repository.deleteById(id);
    }

    @Override
    public void addLanguage(CreateLanguageRequest createLanguageRequest) throws Exception {
        if(createLanguageRequest.getName() == ""){
            throw new Exception("Programming language name cannot be empty!");
        }
        for(Language lang : repository.findAll()){
            if(createLanguageRequest.getName() == lang.getName()){
                throw new Exception("Name mismatch, there's an existing language with same name!");
            }
        }

        Language lang = new Language();
        lang.setName(createLanguageRequest.getName());

        this.repository.save(lang);
    }

    @Override
    public Language updateLanguage(UpdateLanguageRequest updateLanguageRequest) throws Exception {
        if(!repository.existsById(updateLanguageRequest.getId())){
            throw new Exception("Couldnt find the updated data");
        }

        if(updateLanguageRequest.getName() == ""){
            throw new Exception("Programming language name cannot be empty!");
        }
        for(Language lang : repository.findAll()){
            if(updateLanguageRequest.getName() == lang.getName()){
                throw new Exception("Name mismatch, there's an existing language with same name!");
            }
        }
        Language lang = repository.getById(updateLanguageRequest.getId());
        lang.setName(updateLanguageRequest.getName());
        lang.setType(updateLanguageRequest.getType());

        return lang;
    }

    @Override
    public Optional<Language> getLanguageById(int id) {
        return repository.findById(id);
    }
}
