package ma.emsi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="medicament")
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idMedicament",nullable = false)
    private Integer idMedicament;
    @Column(name ="libelle",nullable = false)
    private String libelle;
    @Column(name ="doseJour",nullable = false)
    private Integer doseJour;
    @Column(name ="nbrJour",nullable = false)
    private Integer nbrJour;
}
