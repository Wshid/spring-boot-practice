package com.wshid.sboot.springbootpractice.sbtRepository;

import com.wshid.sboot.springbootpractice.sbtDO.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project:  spring-boot-practice
 * Author :  wshid(kso4013@gmail.com)
 * GitHub : https://github.com/Wshid
 * Date :  2019-01-19 13:41
 */
public interface JournalRepository extends JpaRepository<Journal, Long>{}
