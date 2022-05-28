package ma.emsi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="act")

public class Act {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idAct",nullable = false)
    private Integer idAct;
    @Column(name ="libelle",nullable = false)
    private String libelle;
    @Column(name ="prixBase",nullable = false)
    private Integer prixBase;
    @Column(name ="prixPatient",nullable = false)
    private Integer prixPatient;

}
