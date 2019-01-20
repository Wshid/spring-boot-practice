package com.wshid.sboot.springbootpractice.sbtBO;

import org.springframework.stereotype.Service;

/**
 * Project:  spring-boot-practice
 * Author :  wshid(kso4013@gmail.com)
 * GitHub : https://github.com/Wshid
 * Date :  2019-01-20 00:24
 */
@Service
public class StatBO implements pBO{

    // 로그를 파일로 출력하는 내용을 담을 예정
    // log4j, appender 설정을 추가해야함
    @Override
    public void process() {

    }

    public void pvProcess(String sid, String cid, String platform, String desc1, String desc2, String reqTimestamp){

    }

    public void eventProcess(){

    }
}
