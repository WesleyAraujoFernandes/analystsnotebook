package br.com.viaapia.analystsnotebook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.viaapia.analystsnotebook.model.AcaoDisponivel;

public interface AcaoDisponivelRepository extends MongoRepository<AcaoDisponivel, String> {

}
