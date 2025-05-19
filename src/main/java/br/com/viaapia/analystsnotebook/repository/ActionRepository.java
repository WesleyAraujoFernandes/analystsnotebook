package br.com.viaapia.analystsnotebook.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.viaapia.analystsnotebook.model.AppliedAction;

public interface ActionRepository extends MongoRepository<AppliedAction, String> {
    List<AppliedAction> findByDescricao(String descricao);
}
