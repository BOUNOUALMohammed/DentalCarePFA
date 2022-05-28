package ma.emsi.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="certificat")

public class Certificat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idCertificat",nullable = false)
    private Integer idCertificat;
    @Column(name ="dateDebut",nullable = false)
    private Date dateDebut;
    @Column(name ="dateFin",nullable = false)
    private Date dateFin;
    @Column(name ="motif",nullable = false)
    private String motif ;

}
