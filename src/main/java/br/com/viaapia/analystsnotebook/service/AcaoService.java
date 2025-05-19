package br.com.viaapia.analystsnotebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.viaapia.analystsnotebook.model.Acao;
import br.com.viaapia.analystsnotebook.repository.AcaoRepository;

@Service
public class AcaoService {
    private final AcaoRepository acaoRepository;

    public AcaoService(AcaoRepository acaoRepository) {
        this.acaoRepository = acaoRepository;
    }

    // Implementação de métodos para manipular ações
    public List<Acao> findAll() {
        return acaoRepository.findAll();
    }

    public void deleteAll() {
        acaoRepository.deleteAll();
    }

    public void saveAll(List<Acao> acoes) {
        acaoRepository.saveAll(acoes);
    }

    public void save(Acao acao) {
        acaoRepository.save(acao);
    }

    public Acao findById(String id) {
        return acaoRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        acaoRepository.deleteById(id);
    }

    public void update(Acao acao) {
        acaoRepository.save(acao);
    }

    public List<Acao> findByDescricao(String nome) {
        return acaoRepository.findByDescricao(nome);
    }
}
