package com.btc.swimpyo.backend.utils.jwt.entity;

import lombok.Getter;

@Getter
public enum ErrorMessage {

    UNKNOWN_ERROR(401,"인증 토큰이 존재하지 않습니다."),
    WRONG_TYPE_TOKEN(401,"잘못된 토큰 정보입니다."),
    EXPIRED_TOKEN(401,"만료된 토큰 정보입니다."),
    UNSUPPORTED_TOKEN(401,"지원하지 않는 토큰 방식입니다."),
    ACCESS_DENIED(401,"알 수 없는 이유로 요청이 거절되었습니다."),

    DB_ERROR(400,"DB에러 발생했습니다."),
    NULL_EXCEPTION(400,"Null 예외 발생");


    private int code;
    private String message;

    ErrorMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return message;
    }

}
