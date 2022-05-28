package ma.emsi.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="rendezvous")
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idRdv",nullable = false)
    private  Integer idRdv;
    @Column(name ="date",nullable = false)
    private Date date;
    @Column(name ="heure",nullable = false)
    private Time heure;
    @Column(name ="motif",nullable = false)
    private String motif;
}
