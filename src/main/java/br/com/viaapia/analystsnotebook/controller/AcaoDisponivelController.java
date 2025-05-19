package br.com.viaapia.analystsnotebook.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.analystsnotebook.model.AcaoDisponivel;
import br.com.viaapia.analystsnotebook.service.AcaoDisponivelService;

@RestController
public class AcaoDisponivelController {
    private final AcaoDisponivelService acaoDisponivelService;

    public AcaoDisponivelController(AcaoDisponivelService acaoDisponivelService) {
        this.acaoDisponivelService = acaoDisponivelService;
    }

    @GetMapping("/acoes-disponiveis")
    public List<AcaoDisponivel> getAcoesDisponiveis() {
        return acaoDisponivelService.getAcoesDisponiveis();
    }

    

}
