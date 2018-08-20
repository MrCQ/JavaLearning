package com.javalearn.ssm.normal.service.impl;

import com.javalearn.ssm.normal.base.BaseServiceImpl;
import com.javalearn.ssm.normal.base.annotation.BaseService;
import com.javalearn.ssm.normal.dao.GoodMapper;
import com.javalearn.ssm.normal.dao.domain.Good;
import com.javalearn.ssm.normal.dao.domain.GoodExample;
import com.javalearn.ssm.normal.service.GoodService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class GoodServiceImpl extends BaseServiceImpl<GoodMapper, Good, GoodExample> implements GoodService {
}
