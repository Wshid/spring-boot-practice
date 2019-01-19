package com.wshid.sboot.springbootpractice.sbtController;

import com.wshid.sboot.springbootpractice.sbtDO.Journal;
import com.wshid.sboot.springbootpractice.sbtRepository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Project:  spring-boot-practice
 * Author :  wshid(kso4013@gmail.com)
 * GitHub : https://github.com/Wshid
 * Date :  2019-01-19 13:43
 */
@Controller
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    JournalRepository repo;

    @RequestMapping("/")
    public String journal(Model model){
        model.addAttribute("journal", repo.findAll());
        return "journal";
    }

    /**
     * API 문서형태, json형태로 내용을 리턴할 수 있다.
     * @return
     */
    @RequestMapping(value = "/jsonPage", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public @ResponseBody
    List<Journal> getJournal(){
        return repo.findAll();
    }
}
