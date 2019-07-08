package com.infobelt.aadhaar.services;

import com.infobelt.aadhaar.pojo.Task;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomAuditor {

    public void auditLogMe(Task task) {
        log.info("I'm auditing " + task);
    }
}
