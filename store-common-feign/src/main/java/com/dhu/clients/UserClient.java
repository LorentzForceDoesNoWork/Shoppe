package com.dhu.clients;

import com.dhu.param.PageParam;
import com.dhu.pojo.User;
import com.dhu.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: b2c-cloud-store
 *
 * @author: 赵伟风
 * time: 2022/10/17 22:24 周一
 * description: userfeign调用标准化接口
 */
@FeignClient(value = "user-service")
public interface UserClient {

    /**
     * 后台管理,展示用户信息接口
     * @param pageParam
     * @return
     */
    @PostMapping("/user/list")
    R listPage(@RequestBody PageParam pageParam);

    @PostMapping("/user/remove")
    R remove(@RequestBody Integer userId);

    @PostMapping("/user/update")
    R update(@RequestBody User user);

    @PostMapping("/user/register")
    R save(@RequestBody User user);
}
