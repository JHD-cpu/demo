package org.example.entity;


import com.google.protobuf.Any;
import com.google.protobuf.ByteString;

public class ResultBodyUtil{

    public static ResultBodyBuff.ResultBody success(ByteString data){

        ResultBodyBuff.ResultBody.Builder builder = ResultBodyBuff.ResultBody.newBuilder();
        builder.setCode(200);
        builder.setStatus("success");
        Any.Builder builder1 = Any.newBuilder();
        builder1.setValue(data);
        builder.setData(builder1.build());
        return builder.build();
    }
}
