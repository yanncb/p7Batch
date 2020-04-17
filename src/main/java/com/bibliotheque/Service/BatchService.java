package com.bibliotheque.Service;

import com.bibliotheque.models.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BatchService {

    List<Utilisateur> listeMembreEnRetard ();
}
