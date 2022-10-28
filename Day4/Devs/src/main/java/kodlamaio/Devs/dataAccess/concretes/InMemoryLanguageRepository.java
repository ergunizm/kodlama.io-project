package kodlamaio.Devs.dataAccess.concretes;

import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    private ArrayList<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(0,"C#","Backend"));
        languages.add(new Language(1,"Java","Backend"));
        languages.add(new Language(2,"JS","Frontend"));
    }

    @Override
    public List<Language> listAll() {
        return languages;
    }

    @Override
    public void delete(int id) {
        languages.remove(id);
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public Language update(int id,Language language) {
        languages.set(id,language);
        return language;
    }

    @Override
    public Language getById(int id) {
        return languages.get(id);
    }
}
