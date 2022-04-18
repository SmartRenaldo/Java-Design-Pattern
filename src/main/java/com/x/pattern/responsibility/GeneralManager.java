package com.x.pattern.responsibility;

/**
 * 总经理类
 * @author Yiqi Li
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.LEVEL_TWO, Handler.LEVEL_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println("Employee name:" + leaveRequest.getEmployeeName());
        System.out.println("Numbers of days off: " + leaveRequest.getDayNum());
        System.out.println("Reason: " + leaveRequest.getReason());
        if (leaveRequest.getDayNum() <= this.getNumEnd()) {
            System.out.println("General manager: Approve!");
        } else {
            System.out.println("General manager: No permission!");
        }
    }
}
