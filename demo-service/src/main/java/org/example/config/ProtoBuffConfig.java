package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

@Configuration
public class ProtoBuffConfig {

    @Bean
    public ProtobufHttpMessageConverter protobufHttpMessageConverter(){
        return new ProtobufHttpMessageConverter();
    }

}
