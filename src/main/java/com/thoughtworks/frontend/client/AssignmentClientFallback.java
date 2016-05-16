package com.thoughtworks.frontend.client;

import com.thoughtworks.frontend.model.Assignments;
import org.springframework.stereotype.Component;

@Component
public class AssignmentClientFallback implements AssignmentClient {
    @Override
    public Assignments getAssignmentFor(String employeeId) {
        return new Assignments();
    }
}
