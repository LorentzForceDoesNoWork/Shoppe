package com.dhu.service;

import com.dhu.param.PageParam;

/**
 * projectName: b2c-cloud-store
 *
 * @author: 赵伟风
 * time: 2022/10/25 15:03 周二
 * description:
 */
public interface OrderService {

    /**
     * 分页查询订单数据
     * @param pageParam
     * @return
     */
    Object list(PageParam pageParam);
}
