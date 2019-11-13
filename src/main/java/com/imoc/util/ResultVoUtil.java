package com.imoc.util;

import com.imoc.vo.ResultVo;

public class ResultVoUtil {
    public static ResultVo sucess(Object object){
        ResultVo  resultVo = new ResultVo();
        resultVo.setCode(200);
        resultVo.setMsg("成功");
        resultVo.setData(object);
        return  resultVo;
    }
    public static ResultVo sucess(){
        return sucess(null);
    }
    public static ResultVo error(Integer code ,String msg){
        ResultVo  resultVo = new ResultVo();
        resultVo.setCode(code);
        //resultVo.setMsg(msg);
        //resultVo.setData(object);
        return  resultVo;
    }
}
