package com.bibliotheque.proxies;


import com.bibliotheque.models.Utilisateur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "microservice-back", url = "localhost:9001")
public interface ProxyBatchToBack {

    @GetMapping(value = "/listeDesRetardataires")
    List<Utilisateur> listeDesUtilisateursEnRetard();


}
