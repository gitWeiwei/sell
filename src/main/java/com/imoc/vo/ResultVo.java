package com.imoc.vo;

import lombok.Data;

@Data
public class ResultVo {
    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*内容*/
    private Object data;

}
