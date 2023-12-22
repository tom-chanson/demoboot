package fr.epsi.demoboot2.dal;

import fr.epsi.demoboot2.bo.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

    List<Fournisseur> findByRaisonSociale(String nom);
}
