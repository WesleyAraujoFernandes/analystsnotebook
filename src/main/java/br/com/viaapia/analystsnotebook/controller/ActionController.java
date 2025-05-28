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
@RequestMapping("/action")
public class ActionController {
    private final ActionService actionService;

    public ActionController(ActionService actionService) {
        this.actionService = actionService;
    }

    // Implementação de métodos para manipular ações
    @GetMapping
    public List<AppliedAction> findAll() {
        return actionService.findAll();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll() {
        actionService.deleteAll();
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/saveAll")
    public ResponseEntity<?> saveAll(@RequestBody List<AppliedAction> actions) {
        actionService.saveAll(actions);
        return new ResponseEntity<>("Ações salvas com sucesso", HttpStatus.CREATED);
    }

}
