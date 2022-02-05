package com.hrm.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author AsheOne
 * @date 2022/2/1
 * Used in controller class to return result
 *     success; is success
 *     code; return code
 *     message; return message
 *     data; return data
 */

@Data
// Don't display not-null data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    private boolean success;// is success
    private Integer code;// return code
    private String message;// return message
    private Object data;// return data

    public Result () {
    }

    public Result(ResultCode code){
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
        this.data = data;
    }

    public Result(boolean success,Integer code,String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static Result SUCCESS(){
        return new Result(ResultCode.SUCCESS);
    }

    public static Result ERROR(){
        return new Result(ResultCode.SERVER_ERROR);
    }

    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }

}
