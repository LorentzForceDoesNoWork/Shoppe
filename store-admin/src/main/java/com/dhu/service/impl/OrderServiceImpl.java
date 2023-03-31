package com.dhu.service.impl;

import com.dhu.clients.OrderClient;
import com.dhu.param.PageParam;
import com.dhu.service.OrderService;
import com.dhu.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: b2c-cloud-store
 *
 * @author: 赵伟风
 * time: 2022/10/25 15:04 周二
 * description: 后台管理订单实现类
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderClient orderClient;

    /**
     * 分页查询订单数据
     *
     * @param pageParam
     * @return
     */
    @Override
    public Object list(PageParam pageParam) {

        R r = orderClient.adminList(pageParam);

        log.info("OrderServiceImpl.list业务结束，结果:{}",r);

        return r;
    }
}
