package fr.epsi.demoboot2.dal;

import fr.epsi.demoboot2.bo.Fournisseur;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class FournisseurRepositoryTest {
    @Autowired
    private FournisseurRepository dao;

    @Test
    void testSave() {
        //Arrange
        Fournisseur fournisseur = new Fournisseur("EPSI B3");

        //Act
        Fournisseur fournisseurSaved = dao.save(fournisseur);

        //Assert
        assertNotNull(fournisseurSaved.getId());
    }

    @Test
    void findByRaisonSociale() {
        //Arrange
        Fournisseur fournisseur = new Fournisseur("EPSI B3");
        dao.save(fournisseur);

        //Act
        List<Fournisseur> fournisseurs = dao.findByRaisonSociale("EPSI B3");

        //Assert
        assertFalse(fournisseurs.isEmpty());
    }
}