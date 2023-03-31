package com.dhu.search.service;

import com.dhu.param.ProductParamsSearch;
import com.dhu.utils.R;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * projectName: b2c-cloud-store
 *
 * @author: 赵伟风
 * time: 2022/10/19 18:55 周三
 * description:
 */
public interface SearchService {

    /**
     * 商品搜索
     * @param productParamsSearch
     * @return
     */
    R search(ProductParamsSearch productParamsSearch) throws JsonProcessingException;
}
