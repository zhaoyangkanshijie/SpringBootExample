package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor// 生成无参的构造方法
@AllArgsConstructor// 生成满参的构造方法
@Accessors(chain = true)// 使用链式调用
@Data// 自动生成get/set方法、重写toString方法等方法
public class User implements Serializable {

    // 主键
    @ApiModelProperty(value = "主键")
    private String id;

    // 用户名
    @ApiModelProperty(value = "用户名")
    private String name;

    // 密码
    @ApiModelProperty(value = "密码")
    private String password;
}