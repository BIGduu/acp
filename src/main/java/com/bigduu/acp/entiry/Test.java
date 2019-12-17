package com.bigduu.acp.entiry;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Test {
    @Id
    private String id;
    
    private List<SingleChoiceSubject> singleChoiceSubjects;
    
    private List<MultipleChoiceSubject> multipleChoiceSubjects;
    
    private List<JudgeSubject> judgeSubjects;
    
    private Long time;
    
    private Integer mark;
    
    private List<ErrorSubject> errorSubject;
}
