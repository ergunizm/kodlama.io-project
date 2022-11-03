package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.business.requests.CreateLanguageRequest;
import kodlamaio.Devs.business.requests.UpdateLanguageRequest;
import kodlamaio.Devs.business.responses.GetAllLanguagesResponse;
import kodlamaio.Devs.entities.concretes.Language;

import java.util.List;
import java.util.Optional;

public interface LanguageService {
    List<GetAllLanguagesResponse> listAllLanguages();
    void deleteLanguage(int id);
    void addLanguage(CreateLanguageRequest createLanguageRequest) throws Exception;
    Language updateLanguage(UpdateLanguageRequest updateLanguageRequest) throws Exception;
    Optional<Language> getLanguageById(int id);
}
