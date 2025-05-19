package br.com.viaapia.analystsnotebook.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.viaapia.analystsnotebook.model.Acao;

public interface AcaoRepository extends MongoRepository<Acao, String> {
    List<Acao> findByDescricao(String descricao);
}
