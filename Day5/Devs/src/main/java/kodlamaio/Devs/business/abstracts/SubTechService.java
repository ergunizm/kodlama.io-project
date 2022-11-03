package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.business.requests.CreateSubTechRequest;
import kodlamaio.Devs.business.requests.UpdateSubTechRequest;
import kodlamaio.Devs.business.responses.GetAllSubTechsResponse;
import kodlamaio.Devs.entities.concretes.SubTechnology;

import java.util.List;
import java.util.Optional;

public interface SubTechService {
    List<GetAllSubTechsResponse> listAllSubtechs();
    void deleteSubTech(int id);
    void addSubTech(CreateSubTechRequest createSubTechRequest) throws Exception;
    SubTechnology updateSubTech(UpdateSubTechRequest updateSubTechRequest) throws Exception;
    Optional<SubTechnology> getSubTechById(int id);
}
