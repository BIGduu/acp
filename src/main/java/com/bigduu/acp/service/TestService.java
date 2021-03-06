package com.bigduu.acp.service;

import com.bigduu.acp.common.baseprocesshandler.exception.AlertException;
import com.bigduu.acp.common.baseprocesshandler.service.BaseService;
import com.bigduu.acp.entity.Test;
import com.bigduu.acp.entity.User;

import java.util.List;

/**
 * @author bigduu
 * @title: TestService
 * @projectName acp
 * @description: TODO
 * @date 2019/12/2119:40
 */
public interface TestService extends BaseService<Test> {
    
    /**
     * 获取该用户做过的所有试题
     * @param user 用户名
     * @return
     * @throws Exception
     */
    List<Test> getAllByUser(User user) throws Exception;
    
    Test getAllSubjectTest() throws AlertException;
    
    Test getDefaultTest() throws AlertException;
    
    Test getSingleChoiceOnlyTest() throws AlertException;
    
    Test getMultipleChoiceOnlyTest() throws AlertException;
    
    Test getJudgeChoiceOnlyTest() throws AlertException;
    
    Test getErrorSubjectTest() throws AlertException;
}
