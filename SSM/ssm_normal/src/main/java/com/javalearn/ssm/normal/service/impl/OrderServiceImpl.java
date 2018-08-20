package com.javalearn.ssm.normal.service.impl;

import com.javalearn.ssm.normal.base.BaseServiceImpl;
import com.javalearn.ssm.normal.base.annotation.BaseService;
import com.javalearn.ssm.normal.dao.OrderMapper;
import com.javalearn.ssm.normal.dao.domain.Order;
import com.javalearn.ssm.normal.dao.domain.OrderExample;
import com.javalearn.ssm.normal.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, Order, OrderExample> implements OrderService {
}
