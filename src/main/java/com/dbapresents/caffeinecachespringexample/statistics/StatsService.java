package com.dbapresents.caffeinecachespringexample.statistics;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StatsService {

    private final Random random = new Random();

    @Cacheable(cacheNames = "stats", key = "#userId")
    public UserStats getUserStats(int userId) {
        System.out.println("Calculating stats for userId=" + userId);
        return new UserStats(userId, getRequestsCountFromDb(userId));
    }

    private int getRequestsCountFromDb(int userId) {
        // heavy operation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return random.nextInt();
    }

}
