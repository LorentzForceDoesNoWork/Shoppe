package com.dhu.search.controller;

import com.dhu.param.ProductParamsSearch;
import com.dhu.search.service.SearchService;
import com.dhu.utils.R;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: b2c-cloud-store
 *
 * @author: 赵伟风
 * time: 2022/10/19 18:47 周三
 * description: 搜索服务controller
 */
@RestController
@RequestMapping("search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("product")
    public R productList(@RequestBody ProductParamsSearch productParamsSearch) throws JsonProcessingException {


        return searchService.search(productParamsSearch);
    }

}
