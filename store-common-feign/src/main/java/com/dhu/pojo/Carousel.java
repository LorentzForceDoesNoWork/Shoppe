package com.dhu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * projectName: b2c-cloud-store
 *
 * @author: 赵伟风
 * time: 2022/10/17 17:36 周一
 * description: 轮播图实体类
 */

@Data
@TableName("carousel")
public class Carousel  implements Serializable {

    public static final Long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @JsonProperty("carousel_id")
    private Integer carouselId;
    private String  imgPath;
    private String  describes;
    @JsonProperty("product_id")
    private Integer productId;
    //优先级
    private Integer priority;

}