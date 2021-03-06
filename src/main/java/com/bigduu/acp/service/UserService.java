package com.bigduu.acp.service;


import com.bigduu.acp.common.baseprocesshandler.exception.AlertException;
import com.bigduu.acp.common.baseprocesshandler.service.BaseService;
import com.bigduu.acp.entity.Test;
import com.bigduu.acp.entity.User;

public interface UserService extends BaseService<User> {
    User findByName(String username);
    void logTestHistory(User user,Test test) throws AlertException;
}
