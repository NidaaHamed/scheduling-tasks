package com.example.schedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormate = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 7000)
    public void reportCurrentTime() {
        log.info("The Current Time is {} now don't be Lazy", dateFormate.format(new Date()));
    }
}
