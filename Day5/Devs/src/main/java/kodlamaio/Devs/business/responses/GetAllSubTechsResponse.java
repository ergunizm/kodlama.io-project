package kodlamaio.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllSubTechsResponse {
    private int id;
    private String name;
    private int langId;
}
