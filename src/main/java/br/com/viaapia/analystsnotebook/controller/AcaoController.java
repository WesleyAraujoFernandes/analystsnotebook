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

import br.com.viaapia.analystsnotebook.model.Acao;
import br.com.viaapia.analystsnotebook.service.AcaoService;

@RestController
@RequestMapping("/acoes")
public class AcaoController {
    private final AcaoService acaoService;

    public AcaoController(AcaoService acaoService) {
        this.acaoService = acaoService;
    }

    // Implementação de métodos para manipular ações
    @GetMapping
    public List<Acao> findAll() {
        return acaoService.findAll();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll() {
        acaoService.deleteAll();
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/saveAll")
    public ResponseEntity<?> saveAll(@RequestBody List<Acao> acoes) {
        acaoService.saveAll(acoes);
        return new ResponseEntity<>("Ações salvas com sucesso", HttpStatus.CREATED);
    }

}
