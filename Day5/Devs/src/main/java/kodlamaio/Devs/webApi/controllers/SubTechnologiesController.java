package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.abstracts.SubTechService;
import kodlamaio.Devs.business.requests.CreateSubTechRequest;
import kodlamaio.Devs.business.requests.UpdateSubTechRequest;
import kodlamaio.Devs.business.responses.GetAllSubTechsResponse;
import kodlamaio.Devs.entities.concretes.SubTechnology;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/subtechs")
public class SubTechnologiesController {
    private SubTechService subTechService;

    public SubTechnologiesController(SubTechService subTechService){
        this.subTechService = subTechService;
    }

    @GetMapping("/getAll")
    public List<GetAllSubTechsResponse> listAll(){
        return subTechService.listAllSubtechs();
    }

    @DeleteMapping("/delete")
    public void delete(SubTechnology subTechnology){
        subTechService.deleteSubTech(subTechnology.getSubtechId());
    }

    @PostMapping("/add")
    public void add(CreateSubTechRequest createSubTechRequest) throws Exception {
        subTechService.addSubTech(createSubTechRequest);
    }

    @PostMapping("/update")
    public void update(UpdateSubTechRequest updateSubTechRequest) throws Exception {
        subTechService.updateSubTech(updateSubTechRequest);
    }

    @GetMapping("/get/{id}")
    public Optional<SubTechnology> getOne(@PathVariable int id){
        return subTechService.getSubTechById(id);
    }
}
