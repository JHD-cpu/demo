package org.example.entity.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ApiModel(value = "用户接口接受")
public class UserPo implements Serializable {
    @ApiModelProperty(value = "用户id")
    @NotBlank(message = "id不能为空")
    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
