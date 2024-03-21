package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.example.entity.ResultBody;
import org.example.entity.po.UserPo;
import org.example.entity.vo.UserVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Random;
@RefreshScope
@RestController
@Api(value = "UserController",tags = "demo接口")
@Validated
@RequestMapping("/gateway")
public class DemoController {

    @Value("${user.name}")
    private String name;


    @PostMapping("/demo")
    @ApiOperation(value="/demo",notes = "获取用户信息",httpMethod = "POST")
    public ResultBody<UserVo> getDemo(@RequestBody  @ApiParam(value = "接收封装", name = "userPo", required = true )
                            @Valid UserPo userPo){
        UserVo userVo = new UserVo();
        Random random = new Random();
        userVo.setAge(random.nextInt(80));
        userVo.setSex(random.nextInt(2));
        userVo.setName(this.name);
        return new ResultBody<>(userVo);
    }
}
