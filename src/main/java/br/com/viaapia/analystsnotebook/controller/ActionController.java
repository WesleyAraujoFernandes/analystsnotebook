package br.com.viaapia.analystsnotebook.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.analystsnotebook.model.AppliedAction;
import br.com.viaapia.analystsnotebook.service.ActionService;

@RestController
@RequestMapping("/acoes")
public class ActionController {
    private final ActionService acaoService;

    public ActionController(ActionService acaoService) {
        this.acaoService = acaoService;
    }

    // Implementação de métodos para manipular ações
    @GetMapping
    public List<AppliedAction> findAll() {
        return acaoService.findAll();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll() {
        acaoService.deleteAll();
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/saveAll")
    public ResponseEntity<?> saveAll(@RequestBody List<AppliedAction> acoes) {
        acaoService.saveAll(acoes);
        return new ResponseEntity<>("Ações salvas com sucesso", HttpStatus.CREATED);
    }

}
