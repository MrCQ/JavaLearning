package com.javalearn.ssm.normal.service.impl;

import com.javalearn.ssm.normal.base.BaseServiceImpl;
import com.javalearn.ssm.normal.base.annotation.BaseService;
import com.javalearn.ssm.normal.dao.UserMapper;
import com.javalearn.ssm.normal.dao.domain.User;
import com.javalearn.ssm.normal.dao.domain.UserExample;
import com.javalearn.ssm.normal.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User, UserExample> implements UserService {
}
