package com.x.pattern.responsibility;

/**
 * @author Yiqi Li
 */
public abstract class Handler {
    protected final static int LEVEL_ONE = 1;
    protected final static int LEVEL_TWO = 3;
    protected final static int LEVEL_THREE = 7;

    /**
     * Leader's authority to approve leave
     */
    private int numStart;
    private int numEnd;

    /**
     * superior leadership
     */
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public int getNumStart() {
        return numStart;
    }

    public int getNumEnd() {
        return numEnd;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    /**
     * Methods for leaders at different levels to handle leave
     * @param leaveRequest leave request
     */
    protected abstract void handleLeave(LeaveRequest leaveRequest);

    public final void submit(LeaveRequest leaveRequest) {
        this.handleLeave(leaveRequest);

        if (this.nextHandler != null && leaveRequest.getDayNum() > this.numEnd) {
            this.nextHandler.submit(leaveRequest);
        } else {
            System.out.println("Finished!\n");
        }
    }
}
