package com.tiaotiao.msf.controller;

import com.tiaotiao.msf.commons.exception.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hansiyuan
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public AjaxResponse hello() {
        return AjaxResponse.success("hello world");
    }

}
