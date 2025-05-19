package br.com.viaapia.analystsnotebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.viaapia.analystsnotebook.model.AcaoDisponivel;
import br.com.viaapia.analystsnotebook.repository.AcaoDisponivelRepository;

@Service
public class AcaoDisponivelService {
    private final AcaoDisponivelRepository acaoDisponivelRepository;

    public AcaoDisponivelService(AcaoDisponivelRepository acaoDisponivelRepository) {
        this.acaoDisponivelRepository = acaoDisponivelRepository;
    }

    public List<AcaoDisponivel> getAcoesDisponiveis() {
        return acaoDisponivelRepository.findAll();
    }
}
