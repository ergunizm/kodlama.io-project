package kodlamaio.Devs.entities.concretes;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "languages")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "language")
    private List<SubTechnology> techs;
}
