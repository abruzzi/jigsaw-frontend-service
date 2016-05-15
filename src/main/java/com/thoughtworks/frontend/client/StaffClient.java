package com.thoughtworks.frontend.client;

import com.thoughtworks.frontend.model.Staff;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("staff-service")
public interface StaffClient {
    @RequestMapping(value = "/staffs/{loginName}", method = RequestMethod.GET)
    Staff getStaffInfo(@PathVariable("loginName") String loginName);
}
