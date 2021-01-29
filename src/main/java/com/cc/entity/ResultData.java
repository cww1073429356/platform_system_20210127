package com.cc.entity;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jinjinwen
 * @description: 返回数据
 * @date: 2021-01-29 10:59
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultData {
    private Integer code;
    private String msg;
    private Object data;
    public static ResultData getSuccess(Integer code,String msg,Object data){
        return new ResultData(code,msg,data);
    }
}
