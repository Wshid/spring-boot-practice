package com.wshid.sboot.springbootpractice.sbtController;

import com.wshid.sboot.springbootpractice.sbtBO.StatBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project:  spring-boot-practice
 * Author :  wshid(kso4013@gmail.com)
 * GitHub : https://github.com/Wshid
 * Date :  2019-01-20 00:13
 */
@Slf4j
@RestController
@RequestMapping(value = "/stat/api")
public class StatController {

    @Autowired
    private StatBO statBO;

    @RequestMapping(value = "/pv", method = RequestMethod.GET)
    public String pageView(
            @RequestParam(value = "sid", required = true, defaultValue = "-1") String sid,
            @RequestParam(value = "cid", required = true, defaultValue = "-1") String cid,
            @RequestParam(value = "p", required = true, defaultValue = "None") String platform,
            @RequestParam(value = "d1", defaultValue = "None") String desc1,
            @RequestParam(value = "d2", defaultValue = "None") String desc2,
            @RequestParam(value = "t", defaultValue = "1547911407") String reqTimestamp
    ) {
        statBO.pvProcess(sid, cid, platform, desc1, desc2, reqTimestamp);
        log.info("sid : {} {}", sid, "============");
        return "";
    }
}
