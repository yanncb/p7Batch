package com.bibliotheque.Service;

import com.bibliotheque.models.Exemplaire;
import com.bibliotheque.models.Livre;
import com.bibliotheque.models.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BatchService {

    List<Livre> listeDeLivreDontLesExemplairesSontEnRetard();

    List<Exemplaire> listExemplairesEnRetard();

    List<Utilisateur> listUtilisateurEnRetard();


//    List<Exemplaire> listeExemplairesEnRetard();
//
//    List<Utilisateur> listUtilisateurEnRetard();
//
//    List<Livre> listLivresEnRetard();



    String sendMaill();
    }
