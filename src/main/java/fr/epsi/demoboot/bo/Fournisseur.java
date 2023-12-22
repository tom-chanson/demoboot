package fr.epsi.demoboot2.bo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOM")
    private String raisonSociale;

    public Fournisseur() {
    }

    public Fournisseur(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", raisonSociale='" + raisonSociale + '\'' +
                '}';
    }


}
