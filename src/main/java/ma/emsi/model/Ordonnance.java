package ma.emsi.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ordonnance")
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idOrdonnance",nullable = false)
    private Integer idOrdonnance;
    @Column(name ="date",nullable = false)
    private Date date;
    @Column(name ="note",nullable = false)
    private String note;
    @Column(name ="medicaments",nullable = false)
    private String medicaments;

}
