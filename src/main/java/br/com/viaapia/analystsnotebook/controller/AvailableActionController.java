package br.com.viaapia.analystsnotebook.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.analystsnotebook.model.AvailableAction;
import br.com.viaapia.analystsnotebook.service.AvailableActionService;

@RestController
public class AvailableActionController {
    private final AvailableActionService acaoDisponivelService;

    public AvailableActionController(AvailableActionService acaoDisponivelService) {
        this.acaoDisponivelService = acaoDisponivelService;
    }

    @GetMapping("/acoes-disponiveis")
    public List<AvailableAction> getAcoesDisponiveis() {
        return acaoDisponivelService.getAcoesDisponiveis();
    }

    

}
