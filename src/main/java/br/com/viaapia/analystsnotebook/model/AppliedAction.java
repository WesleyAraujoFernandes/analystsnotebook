package br.com.viaapia.analystsnotebook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("design_action")
@Data
public class AppliedAction {
    @Id
    private String id;
    private String descricao;
}
