package com.bibliotheque.step;

import com.bibliotheque.Service.BatchService;
import com.bibliotheque.Service.BatchServiceImpl;
import com.bibliotheque.models.Utilisateur;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MembreEnRetardTasklet implements Tasklet {

    @Autowired
    BatchService batchService;

    @Autowired
    BatchServiceImpl service;


    public MembreEnRetardTasklet(BatchService batchService) {
        this.batchService = batchService;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        List<Utilisateur> utilisateurList = batchService.listeMembreEnRetard();


        // appel du service aller cherche dans le proxies la liste des membres en retard + envoie mail


        return RepeatStatus.FINISHED;
    }
}
