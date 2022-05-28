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
@Table(name="patient")

public class Patient extends Utilisateur {

    @Version
    @Column(name ="telephone",nullable = false)
    private Integer Telephone;
    @Column(name ="cin",nullable = false)
    private String cin;
    @Column(name ="genre",nullable = false)
    private String genre;


}
