package ma.emsi.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="consultation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idConsultation",nullable = false)
    private Integer idConsultation;
    @Column(name ="date",nullable = false)
    private Date date;
    @Column(name ="note",nullable = false)
    private String note;
    @Column(name ="acts",nullable = false)
    private String acts;

}
