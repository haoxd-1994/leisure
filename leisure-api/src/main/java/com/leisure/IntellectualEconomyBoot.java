package com.leisure;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;


//@SpringBootApplication(exclude = {MultipartAutoConfiguration.class})
@SpringBootApplication()
@EnableScheduling
@EnableCaching
public class IntellectualEconomyBoot implements CommandLineRunner {


    private static final Logger logger = LogManager.getLogger(com.leisure.IntellectualEconomyBoot.class);

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        SpringApplication.run(com.leisure.IntellectualEconomyBoot.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                logger.info("IntellectualEconomyBoot do ShutdownHook.......... ");
                logger.info("系统运行总时长(秒){}", (System.currentTimeMillis() - time) / 1000);
            }
        });

    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("sync start");

        logger.info("sync end");
    }
}
