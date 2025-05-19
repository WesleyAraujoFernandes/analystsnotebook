package br.com.viaapia.analystsnotebook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.viaapia.analystsnotebook.model.AvailableAction;

public interface AvailableActionRepository extends MongoRepository<AvailableAction, String> {

}
