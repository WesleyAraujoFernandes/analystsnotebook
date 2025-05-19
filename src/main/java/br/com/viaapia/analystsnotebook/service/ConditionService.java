package br.com.viaapia.analystsnotebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.viaapia.analystsnotebook.model.Condition;
import br.com.viaapia.analystsnotebook.repository.ConditionRepository;

@Service
public class ConditionService {
    private final ConditionRepository conditionRepository;

    public ConditionService(ConditionRepository conditionRepository) {
        this.conditionRepository = conditionRepository;
    }

    public void saveAll(List<Condition> conditions) {
        conditionRepository.saveAll(conditions);
    }

    public Condition save(Condition condition) {
        return conditionRepository.save(condition);
    }
}
