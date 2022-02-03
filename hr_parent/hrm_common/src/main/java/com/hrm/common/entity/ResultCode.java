package com.hrm.common.entity;

/**
 * @author AsheOne
 * @date 2022/2/1
 * Return code:
 *      Success: 10000
 *      FAIL: 10001
 *      UNAUTHENTICATED: 10002
 *      UNAUTHORISE: 10003
 *      SERVER_ERROR: 99999
 */
public enum ResultCode {

    SUCCESS(true,10000,"Success！"),
    FAIL(false,10001,"FAIL！"),
    UNAUTHENTICATED(false,10002,"Please Login Your Account！"),
    UNAUTHORISE(false,10003,"Insufficient permissions！"),
    SERVER_ERROR(false,99999,"Error,Please Try again");

    boolean success;// is success
    int code;// response code
    String message;// tip message

    ResultCode(boolean success,int code,String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success(){
        return success;
    }

    public int code(){
        return code;
    }

    public String message(){
        return message;
    }

}
