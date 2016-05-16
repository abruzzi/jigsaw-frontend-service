package com.thoughtworks.frontend.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.thoughtworks.frontend.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class StaffClientHystrixWrapper implements StaffClient {
    @Autowired
    StaffClient staffClient;

    @Override
    public Staff getStaffInfo(@PathVariable("loginName") String loginName) {
        return this.staffClient.getStaffInfo(loginName);
    }

    @HystrixCommand(fallbackMethod = "getStaffInfoFallBack")
    public Staff getStaffInfoFallBack(String loginName) {
        return new Staff();
    }
}
