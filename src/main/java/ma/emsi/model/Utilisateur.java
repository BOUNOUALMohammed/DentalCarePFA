package ma.emsi.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor@NoArgsConstructor
@Table(name="utilisateur")

public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idUtilisateur",nullable = false)
    private  Integer idUser;
    @Column(name ="login",nullable = false)
    private String login;
    @Column(name ="motdepasse",nullable = false)
    private String mdp;
    @Column(name ="nom",nullable = false)
    private String nom;
    @Column(name ="prenom",nullable = false)
    private String prenom;
    @Column(name ="adresse",nullable = false)
    private String adresse;
}
