package org.example.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@RefreshScope
public class SwaggerConfig {
    @Value("${springfox.documentation.enabled}")
    private   boolean swaggerEnable;

    @Value("${spring.application.name}")
    private   String serviceName;
    @Bean
    public Docket docket(){
        System.out.println("swaggerEnable:"+swaggerEnable);
        return new Docket(DocumentationType.SWAGGER_2).groupName(serviceName)
                .apiInfo(getInfo())
                .enable(swaggerEnable)
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getInfo(){
        return new ApiInfoBuilder()
                .title("面试")
                .termsOfServiceUrl("http://www.baidu.com/")
                .version("1.0")
                .description("API 描述")
                .build();
    }
}
