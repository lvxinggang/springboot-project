package com.project.mes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package: com.project.mes
 * @ClassName: ProjectApplication
 * @Author: hantongyang
 * @Description:
 * @Date: 2020/1/6 10:42
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.project.mes.demo.dao","com.project.mes.systemmanage.dao"})
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }
}
