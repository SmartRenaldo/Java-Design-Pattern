package com.x.pattern.responsibility;

/**
 * 请假申请类
 * @author Yiqi Li
 */
public class LeaveRequest {
    private String employeeName;
    /**
     * number of days off
     */
    private int dayNum;
    private String reason;

    public LeaveRequest(String employeeName, int dayNum, String reason) {
        this.employeeName = employeeName;
        this.dayNum = dayNum;
        this.reason = reason;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDayNum() {
        return dayNum;
    }

    public String getReason() {
        return reason;
    }
}
