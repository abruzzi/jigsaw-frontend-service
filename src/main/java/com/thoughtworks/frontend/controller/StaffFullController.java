package com.thoughtworks.frontend.controller;

import com.thoughtworks.frontend.client.AssignmentClient;
import com.thoughtworks.frontend.client.StaffClient;
import com.thoughtworks.frontend.model.Assignments;
import com.thoughtworks.frontend.model.Staff;
import com.thoughtworks.frontend.model.StaffEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jigsaw/staffs")
public class StaffFullController {
    @Autowired
    StaffClient staffClient;

    @Autowired
    AssignmentClient assignmentClient;

    @RequestMapping(value = "{loginName}", method = RequestMethod.GET)
    public StaffEntity getFullInformation(@PathVariable("loginName") String loginName) {
        Staff staffInfo = staffClient.getStaffInfo(loginName);
        Assignments assignments = assignmentClient.getAssignmentFor(staffInfo.getEmployeeId());

        StaffEntity staffEntity = new StaffEntity();
        staffEntity.setStaff(staffInfo);
        staffEntity.setAssignments(assignments.getAssignments());

        return staffEntity;
    }
}
