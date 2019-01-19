package com.wshid.sboot.springbootpractice.sbtController;

import com.wshid.sboot.springbootpractice.sbtDO.ApiPageView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project:  spring-boot-practice
 * Author :  wshid(kso4013@gmail.com)
 * GitHub : https://github.com/Wshid
 * Date :  2019-01-19 16:43
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/pv")
    public ApiPageView requestPv(
            @RequestParam(value = "sid", defaultValue="0") String sid,
            @RequestParam(value = "cid", defaultValue="0") String cid,
            @RequestParam(value = "attr1", defaultValue="None") String attr1,
            @RequestParam(value = "attr2", defaultValue="None") String attr2,
            @RequestParam(value = "pt", defaultValue="1547884342") String processTimestamp){
        return new ApiPageView(sid, cid, attr1, attr2, processTimestamp);
    }

}
