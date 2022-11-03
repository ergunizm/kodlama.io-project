package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.SubTechService;
import kodlamaio.Devs.business.requests.CreateSubTechRequest;
import kodlamaio.Devs.business.requests.UpdateSubTechRequest;
import kodlamaio.Devs.business.responses.GetAllSubTechsResponse;
import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.dataAccess.abstracts.SubTechRepository;
import kodlamaio.Devs.entities.concretes.Language;
import kodlamaio.Devs.entities.concretes.SubTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubTechManager implements SubTechService {
    private SubTechRepository subTechRepository;
    private LanguageRepository languageRepository;

    public SubTechManager(SubTechRepository subTechRepository){
        this.subTechRepository = subTechRepository;
    }
    @Override
    public List<GetAllSubTechsResponse> listAllSubtechs() {
        List<SubTechnology> techs = subTechRepository.findAll();
        List<GetAllSubTechsResponse> returnedTechs = new ArrayList<>();
        for(SubTechnology tech : techs){
            GetAllSubTechsResponse res = new GetAllSubTechsResponse();
            res.setId(tech.getSubtechId());
            res.setName(tech.getSubtechName());
            res.setLangId(tech.getLanguage().getId());

            returnedTechs.add(res);
        }
        return returnedTechs;
    }

    @Override
    public void deleteSubTech(int id) {
        subTechRepository.deleteById(id);
    }

    @Override
    public void addSubTech(CreateSubTechRequest createSubTechRequest) throws Exception {
        SubTechnology singleTech = new SubTechnology();
        Language lang = languageRepository.getById(createSubTechRequest.getLangId());
        singleTech.setLanguage(lang);
        singleTech.setSubtechName(createSubTechRequest.getName());

        subTechRepository.save(singleTech);
    }

    @Override
    public SubTechnology updateSubTech(UpdateSubTechRequest updateSubTechRequest) throws Exception {
        if(!subTechRepository.existsById(updateSubTechRequest.getTechId())){
            throw new Exception("Couldnt find the updated data");
        }

        SubTechnology tech = subTechRepository.getById(updateSubTechRequest.getTechId());
        Language lang = languageRepository.getById(updateSubTechRequest.getLangId());
        tech.setSubtechName(updateSubTechRequest.getName());
        tech.setLanguage(lang);

        return tech;
    }

    @Override
    public Optional<SubTechnology> getSubTechById(int id) {
        return subTechRepository.findById(id);
    }
}
