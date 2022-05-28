package ma.emsi.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="medcin")
public class Medcin extends Utilisateur {

    @Version
    @Column(name ="idFacture",nullable = false)
    private String specialisation;
}
