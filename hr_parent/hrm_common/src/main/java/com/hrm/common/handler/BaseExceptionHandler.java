package com.hrm.common.handler;

import com.hrm.common.entity.Result;
import com.hrm.common.entity.ResultCode;
import com.hrm.common.exception.CommonException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author AsheOne
 * @date 2022/2/5
 * Custom common exception handlers
 *      1. Declare exception handlers @ControllerAdvice
 *      2. Uniformly handle exceptions
 */

@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(HttpServletRequest Request, HttpServletResponse response, Exception e){

        if(e.getClass() == CommonException.class){
            CommonException ce = (CommonException) e;
            Result result = new Result(ce.getResultCode());
            return result;
        }else {
            Result result = new Result(ResultCode.SERVER_ERROR);
            return result;
        }
    }
}
