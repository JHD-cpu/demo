package org.example.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "用户返回")
public class UserVo implements Serializable {
    @ApiModelProperty(value = "配置中心实时更新字段")
    private String name;
    @ApiModelProperty(value = "年龄")
    private Integer age;
    @ApiModelProperty(value = "性别")
    private Integer sex;

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
