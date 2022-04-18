package com.x.pattern.responsibility;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest1 = new LeaveRequest("Kate", 1, "discomfort");
        LeaveRequest leaveRequest2 = new LeaveRequest("Nancy", 5, "pregnant");
        LeaveRequest leaveRequest3 = new LeaveRequest("Ryan", 10, "taking care of parents");
        GroupLeader groupLeader = new GroupLeader();
        DepartmentManager departmentManager = new DepartmentManager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(departmentManager);
        departmentManager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest1);
        groupLeader.submit(leaveRequest2);
        groupLeader.submit(leaveRequest3);
    }
}
