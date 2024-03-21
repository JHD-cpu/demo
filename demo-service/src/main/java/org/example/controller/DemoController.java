package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.example.entity.ResultBodyBuff;
import org.example.entity.ResultBodyUtil;
import org.example.entity.po.UserPo;
import org.example.entity.vo.UserVoProtoBuff;
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
@RequestMapping("/user")
public class DemoController {

    @Value("${user.name}")
    private String name;


    @PostMapping(value = "/demo")
    @ApiOperation(value="/demo",notes = "获取用户信息",httpMethod = "POST")
    public ResultBodyBuff.ResultBody getDemo(@RequestBody

                                                 @ApiParam(value = "接收封装", name = "userPo", required = true )
                            @Valid UserPo userPo){

        Random random = new Random();
        UserVoProtoBuff.UserVo.Builder userVo = UserVoProtoBuff.UserVo.newBuilder();

        userVo.setAge(random.nextInt(80));
        userVo.setSex(random.nextInt(2));
        userVo.setName(this.name);
        UserVoProtoBuff.UserVo build = userVo.build();
        ResultBodyBuff.ResultBody success = ResultBodyUtil.success(build.toByteString());

        return success;
    }
}
