package br.com.viaapia.analystsnotebook.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("applied_condition")
@Data
public class AppliedCondition {
    @Id
    private String id;
    private List<Map<Condition, String>> conditions;
    private String value;
}
