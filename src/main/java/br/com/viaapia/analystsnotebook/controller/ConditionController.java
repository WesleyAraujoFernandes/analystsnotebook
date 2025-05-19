package br.com.viaapia.analystsnotebook.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.analystsnotebook.model.Condition;
import br.com.viaapia.analystsnotebook.service.ConditionService;

@RestController
@RequestMapping("/conditions")
public class ConditionController {
    private final ConditionService conditionService;

    public ConditionController(ConditionService conditionService) {
        this.conditionService = conditionService;
    }

    @PostMapping("/saveAll")
    public ResponseEntity<Condition> saveAll(@RequestBody List<Condition> conditions) {
        conditionService.saveAll(conditions);
        return new ResponseEntity<Condition>(HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<Condition> save(@RequestBody Condition condition) {
        conditionService.save(condition);
        return new ResponseEntity<Condition>(condition, HttpStatus.CREATED);
    }
}
