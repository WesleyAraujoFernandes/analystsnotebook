package br.com.viaapia.analystsnotebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.viaapia.analystsnotebook.model.AvailableAction;
import br.com.viaapia.analystsnotebook.repository.AvailableActionRepository;

@Service
public class AvailableActionService {
    private final AvailableActionRepository acaoDisponivelRepository;

    public AvailableActionService(AvailableActionRepository acaoDisponivelRepository) {
        this.acaoDisponivelRepository = acaoDisponivelRepository;
    }

    public List<AvailableAction> getAcoesDisponiveis() {
        return acaoDisponivelRepository.findAll();
    }
}
