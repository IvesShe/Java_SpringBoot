package com.ives.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBoot項目啟動入口類
// @SpringBootApplication - springboot核心註解，主要是用於開啟spring自動配置
@SpringBootApplication
public class SpringbootExercise01Application {

    // springboot項目代碼必須放到Application類所在的同級目錄或下級目錄
    public static void main(String[] args) {

        SpringApplication.run(SpringbootExercise01Application.class, args);
    }

}
