package com.zerui.mybatisplusgenerator;

import com.sun.glass.ui.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zerui.mybatisplusgenerator.mapper")  //配置mapper扫描
public class MybatisplusgeneratorApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
