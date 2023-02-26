package com.dbapresents.caffeinecachespringexample.statistics;

public class UserStats {

    private final int userId;
    private final int noOfRequests;

    public UserStats(int userId, int noOfRequests) {
        this.userId = userId;
        this.noOfRequests = noOfRequests;
    }

    public int getUserId() {
        return userId;
    }

    public int getNoOfRequests() {
        return noOfRequests;
    }

}
