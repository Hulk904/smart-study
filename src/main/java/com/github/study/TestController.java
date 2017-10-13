package com.github.study;

import org.smart4j.framework.mvc.annotation.Action;
import org.smart4j.framework.mvc.annotation.Request;
import org.smart4j.framework.mvc.bean.Result;

/**
 * Created by yangyuan on 10/13/17.
 */
@Action
public class TestController {
    @Request.Get(value = "/hi")
    public Result hello(){
        Result result = new Result(true);
        result.setData("hello ,my first demo");
        return result;
    }
}
