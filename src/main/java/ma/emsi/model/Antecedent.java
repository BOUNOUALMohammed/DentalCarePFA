package ma.emsi.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="antecedent")

public class Antecedent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idAntecedent",nullable = false)
    private Integer idAntecedent;
    @Column(name ="libelle",nullable = false)
    private String libelle;
    @Column(name ="noteMedcin",nullable = false)
    private String noteMedcin;
}
