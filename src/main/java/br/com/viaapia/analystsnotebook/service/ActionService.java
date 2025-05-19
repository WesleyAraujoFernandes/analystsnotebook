package br.com.viaapia.analystsnotebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.viaapia.analystsnotebook.model.AppliedAction;
import br.com.viaapia.analystsnotebook.repository.ActionRepository;

@Service
public class ActionService {
    private final ActionRepository acaoRepository;

    public ActionService(ActionRepository acaoRepository) {
        this.acaoRepository = acaoRepository;
    }

    // Implementação de métodos para manipular ações
    public List<AppliedAction> findAll() {
        return acaoRepository.findAll();
    }

    public void deleteAll() {
        acaoRepository.deleteAll();
    }

    public void saveAll(List<AppliedAction> acoes) {
        acaoRepository.saveAll(acoes);
    }

    public void save(AppliedAction acao) {
        acaoRepository.save(acao);
    }

    public AppliedAction findById(String id) {
        return acaoRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        acaoRepository.deleteById(id);
    }

    public void update(AppliedAction acao) {
        acaoRepository.save(acao);
    }

    public List<AppliedAction> findByDescricao(String nome) {
        return acaoRepository.findByDescricao(nome);
    }
}
