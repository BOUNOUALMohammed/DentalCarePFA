package ma.emsi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="secretaire")
public class Secretaire extends Utilisateur{

    @Column(name ="telephone",nullable = false)
    private Integer Telephone;
    @Column(name ="cin",nullable = false)
    private String cin;
    @Column(name ="adresse",nullable = false)
    private Integer adresse;

}
