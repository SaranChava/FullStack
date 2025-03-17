package com.springclass.day3jdbc;

public class testDbConn {
    private String testCol;

    public testDbConn() {
    }

    public testDbConn(String testCol) {
        this.testCol = testCol;
    }

    public String getTestCol() {
        return testCol;
    }

    public void setTestCol(String testCol) {
        this.testCol = testCol;
    }

    @Override
    public String toString() {
        return "testDbConn{" +
                "testCol='" + testCol + '\'' +
                '}';
    }
}
