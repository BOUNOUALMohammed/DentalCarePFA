package ma.emsi.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="situationfinanciere")
public class SituationFinanciere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idSf",nullable = false)
    private Integer idSf;
    @Column(name ="montantPay√©",nullable = false)
    private Float montantPay√©;
    @Column(name ="reste",nullable = false)
    private Float reste;
    @Column(name ="typePaiement",nullable = false)
    private String typePaiement;
}
