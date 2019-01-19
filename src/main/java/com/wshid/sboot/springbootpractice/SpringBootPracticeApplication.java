package com.wshid.sboot.springbootpractice;

import com.wshid.sboot.springbootpractice.sbtDO.Journal;
import com.wshid.sboot.springbootpractice.sbtRepository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootPracticeApplication {


    @Bean
    InitializingBean saveData(JournalRepository repo){
        return () -> {
            repo.save(new Journal("스프링 부트 입문", "오늘부터 부트 시작합니다", "09/01/2019"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPracticeApplication.class, args);
    }

}

