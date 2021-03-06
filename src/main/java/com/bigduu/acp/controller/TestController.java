package com.bigduu.acp.controller;

import com.bigduu.acp.common.baseprocesshandler.controller.BaseController;
import com.bigduu.acp.common.baseprocesshandler.exception.AlertException;
import com.bigduu.acp.entity.Test;
import com.bigduu.acp.service.TestService;
import org.springframework.web.bind.annotation.*;

/**
 * @author bigduu
 * @title: TestController
 * @projectName acp
 * @description: TODO
 * @date 2019/12/2121:58
 */
@RequestMapping("/test")
@RestController
public class TestController extends BaseController<Test> {
    
    private final TestService testService;
    
    private static Test allTest = null;
    
    public TestController(TestService testService) {
        super(testService);
        this.testService = testService;
    }
    
    @GetMapping("/allSubject")
    public Test getAllTest() throws AlertException {
        if (allTest == null){
            allTest = testService.getAllSubjectTest();
        }
        return allTest;
    }
    @GetMapping("/default")
    public Test getDefaultTest() throws AlertException {
        return testService.getDefaultTest();
    }
    
    @GetMapping("/single")
    public Test getSingleChoiceOnlyTest() throws AlertException {
        return testService.getSingleChoiceOnlyTest();
    }
    
    @GetMapping("/multiple")
    public Test getMultipleChoiceOnlyTest() throws AlertException {
        return testService.getMultipleChoiceOnlyTest();
    }
    
    @GetMapping("/judge")
    public Test getJudgeChoiceOnlyTest() throws AlertException {
        return testService.getJudgeChoiceOnlyTest();
    }
    
    @GetMapping("/error")
    public Test getErrorTest() throws AlertException {
        return testService.getErrorSubjectTest();
    }
    
}
