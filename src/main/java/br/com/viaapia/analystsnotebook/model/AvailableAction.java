package br.com.viaapia.analystsnotebook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "design_action_available")
@Data
public class AvailableAction {
    @Id
    private String id;
    private String descricao;
}
