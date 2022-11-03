package kodlamaio.Devs.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Table(name="subtechnology")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SubTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subtechId")
    private int subtechId;

    @Column(name="subtechName")
    private String subtechName;

    @ManyToOne()
    @JoinColumn(name = "id")
    private Language language;
}
