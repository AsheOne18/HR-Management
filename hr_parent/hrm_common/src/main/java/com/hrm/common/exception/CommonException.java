package com.hrm.common.exception;

import com.hrm.common.entity.ResultCode;
import lombok.Getter;

/**
 * @author AsheOne
 * @date 2022/2/5
 * Custom exception
 */
@Getter
public class CommonException extends Exception{

    private ResultCode resultCode;

    public CommonException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
}
