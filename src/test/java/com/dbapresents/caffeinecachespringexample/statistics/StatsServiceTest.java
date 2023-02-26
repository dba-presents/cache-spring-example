package com.dbapresents.caffeinecachespringexample.statistics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StatsServiceTest {

    @Autowired
    private StatsService statsService;

    @Test
    void shouldGetUsersStatsTwice() {
        long timeStart = System.currentTimeMillis();
        statsService.getUserStats(1);
        statsService.getUserStats(2);

        statsService.getUserStats(1);
        statsService.getUserStats(2);
        System.out.println("Duration " + (System.currentTimeMillis() - timeStart) + " ms");
    }

    @Test
    void shouldGetUsersStatsInLoop() throws InterruptedException {
        long timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Loop number " + i);
            statsService.getUserStats(1);
            statsService.getUserStats(2);
            Thread.sleep(1000);
        }
        System.out.println("Duration " + (System.currentTimeMillis() - timeStart) + " ms");
    }

}