package com.tiaotiao.msf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hansiyuan
 */
@MapperScan(basePackages = {"com.tiaotiao.msf"})
@SpringBootApplication
public class MsfApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsfApplication.class, args);
    }
}
