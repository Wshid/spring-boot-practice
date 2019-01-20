package com.wshid.sboot.springbootpractice;

import com.wshid.sboot.springbootpractice.sbtDO.ArgsComponent;
import com.wshid.sboot.springbootpractice.sbtDO.Journal;
import com.wshid.sboot.springbootpractice.sbtRepository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootPracticeApplication {

    @Bean
    InitializingBean saveData(JournalRepository repo) {
        return () -> {
            repo.save(new Journal("스프링 부트 입문", "오늘부터 부트 시작합니다", "09/01/2019"));
        };
    }

    public static void main(String[] args) {

       /* SpringApplication app = new SpringApplication(SpringBootPracticeApplication.class);
//        app.setBanner(
//                (environment, sourceClass, out) -> {
//                    out.print("\n\n 나의 배너 \n\n");
//                }
//        );

        app.run(args);
       */

        //SpringApplication.run(SpringBootPracticeApplication.class, args);

        // SpringApplicationBuilder를 활용하여 실행
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .sources(SpringBootPracticeApplication.class)
                .run(args);
    }

}

