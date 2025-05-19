package br.com.viaapia.analystsnotebook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.analystsnotebook.model.AppliedAction;

@RestController
public class InicializarController {
    private final ActionController acaoController;

    public InicializarController(ActionController acaoController) {
        this.acaoController = acaoController;
    }

    @PostMapping("/inicializar")
    public ResponseEntity<AppliedAction> inicializarTabelas(@RequestBody AppliedAction acao) {
        // Lógica para inicializar as tabelas
        // acaoController.deleteAll();
        //acaoController.save(acao);
        return ResponseEntity.ok(acao);
    }
}
