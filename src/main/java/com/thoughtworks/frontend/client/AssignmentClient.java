package com.thoughtworks.frontend.client;

import com.thoughtworks.frontend.model.Assignments;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "assignment-service")
public interface AssignmentClient {
    @RequestMapping(value = "/assignments/{employeeId}", method = RequestMethod.GET)
    Assignments getAssignmentFor(@PathVariable("employeeId") String employeeId);
}

