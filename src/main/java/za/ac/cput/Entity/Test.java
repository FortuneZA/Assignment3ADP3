package za.ac.cput.Entity;

import java.time.LocalDate;
/*
Test.java
Entity for Test
Author: Athi Fukama 218328591
Date :11 June 2021
 */
public class Test {
    private String testId;
    private String lecturerId;
    private String testInfo;


    private Test(Test.Builder builder) {
        this.testId = builder.testId;
        this.lecturerId = builder.lecturerId;
        this.testInfo = builder.testInfo;

    }

    @Override
    public String toString() {
        return "Test{" +
                "testID='" + testId + '\'' +
                ", lecturerId='" + lecturerId + '\'' +
                ", testInfo='" + testInfo + '\'' +
                '}';
    }

    public String getTestId() {
        return testId;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public String getTestInfo() {
        return testInfo;
    }

    // Builder Class
    public static class Builder {
        private String testId;
        private String lecturerId;
        private String testInfo;
        private int id;

        public Builder setTestId(String testId) {
            this.testId = testId;
            return this;
        }

        public Builder setLecturerId(String lecturerId) {
            this.lecturerId = lecturerId;
            return this;
        }

        public Builder setTestInfo(String testInfo) {
            this.testInfo = testInfo;
            return this;
        }

        public Test build() {
            return new Test(this);

        }

        public Test.Builder copy(Test test) {
            this.testId = test.testId;
            this.lecturerId = test.lecturerId;
            this.testInfo = test.testInfo;


            return this;
        }

        public Test.Builder id(int id) {
            this.id = id;
            return this;
        }
    }

}
