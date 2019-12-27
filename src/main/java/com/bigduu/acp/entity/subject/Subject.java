package com.bigduu.acp.entity.subject;


import com.bigduu.acp.entity.subject.subsubject.Option;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author mugeng.du
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    /**
     * 分数
     */
    private Integer mark;
    
    /**
     * 题干
     */
    private String question;
    
    /**
     * 选项
     */
    private List<Option> options;
    
    /**
     * 问题答案
     */
    private List<Option> answer;
    
    /**
     * 用户答案
     */
    private List<Option> solution;
    
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private transient Boolean did = false;
    
    /**
     * @return 判断该题是否正确
     */
    public Boolean isRight(){
        List<Option> answer = this.getAnswer();
        List<Option> solution = this.getSolution();
        return answer.equals(solution);
    }
    
    
}
