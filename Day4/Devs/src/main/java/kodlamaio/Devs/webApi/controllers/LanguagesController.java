package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService service;

    public LanguagesController(LanguageService languageService) {
        this.service = languageService;
    }

    @GetMapping("/getAll")
    public List<Language> listAll(){
        return service.listAllLanguages();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Language language){
        service.deleteLanguage(language.getId());
    }

    @PostMapping ("/add")
    public void add(@RequestBody Language language) throws Exception {
        service.addLanguage(language);
    }

    @PostMapping("/update")
    public void update(@RequestBody Language language) throws Exception {
        service.updateLanguage(language.getId(),language);
    }

    @GetMapping("/get/{id}")
    public Language getOne(@PathVariable int id){
        return service.getLanguageById(id);
    }
}
