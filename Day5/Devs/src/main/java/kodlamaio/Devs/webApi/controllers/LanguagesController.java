package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.business.requests.CreateLanguageRequest;
import kodlamaio.Devs.business.requests.UpdateLanguageRequest;
import kodlamaio.Devs.business.responses.GetAllLanguagesResponse;
import kodlamaio.Devs.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService service;

    public LanguagesController(LanguageService languageService) {
        this.service = languageService;
    }

    @GetMapping("/getAll")
    public List<GetAllLanguagesResponse> listAll(){
        return service.listAllLanguages();
    }


    //@RequestBody yazmaya gerek yoktur (otomatik)
    @DeleteMapping("/delete")
    public void delete(Language language){
        service.deleteLanguage(language.getId());
    }

    @PostMapping ("/add")
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
        service.addLanguage(createLanguageRequest);
    }

    @PostMapping("/update")
    public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception {
        service.updateLanguage(updateLanguageRequest);
    }

    @GetMapping("/get/{id}")
    public Optional<Language> getOne(@PathVariable int id){
        return service.getLanguageById(id);
    }
}
