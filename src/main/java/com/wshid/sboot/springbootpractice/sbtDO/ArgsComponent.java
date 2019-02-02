package com.wshid.sboot.springbootpractice.sbtDO;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Project:  spring-boot-practice
 * Author :  wshid(kso4013@gmail.com)
 * GitHub : https://github.com/Wshid
 * Date :  2019-01-20 17:54
 */
@Slf4j
@Component
public class ArgsComponent {

    // @autowired를 메서드에서 사용하여, ArgsComponent가 호출될 때 자동 작동하도록 한다.
    @Autowired
    public ArgsComponent(ApplicationArguments args){

        log.info("ArgsComponent is RUN {}", "=================");

        boolean enable = args.containsOption("enable"); // --<인자명> 으로 넘긴 목록을 가져온다.
        if(enable)
            log.info("## > `enable` option is submitted");

        List<String> _args = args.getNonOptionArgs();
        log.info("## > 다른 인자 목록");
        if(!_args.isEmpty()){
            _args.forEach(file -> log.info(file));
        }
        log.info("parameter done {}", "=============");
    }
}
