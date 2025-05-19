package br.com.viaapia.analystsnotebook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.viaapia.analystsnotebook.model.Condition;

public interface ConditionRepository extends MongoRepository<Condition, String> {
    Condition save(Condition condition);
}
