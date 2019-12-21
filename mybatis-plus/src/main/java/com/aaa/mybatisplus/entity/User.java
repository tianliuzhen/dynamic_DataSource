package com.aaa.mybatisplus.entity;

import com.aaa.mybatisplus.enums.GenderEnum;
import com.alibaba.fastjson.annotation.JSONType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/17
 */
@Data
@Accessors(chain = true)
@JSONType(serializeEnumAsJavaBean = true)
//@KeySequence(value = "mybatisKeyGenerator", clazz = String.class)
@TableName("user")
public class User {
    /**
     *
     * 官网说： 只有 type = IdType.INPUT  时 外部自定义的主键生成器才能生效
     * 其实 只要设置了 @KeySequence(value = "mybatisKeyGenerator", clazz = String.class)
     * type = IdType.ASSIGN_ID  或者其他的
     * 外部仍然可以生效
     * 但是注意：单线程内测试是会重复id的
     */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private String id;
    private String name;
    private GenderEnum age;
    private String email;
    @TableLogic
    private Integer isDel;
}

