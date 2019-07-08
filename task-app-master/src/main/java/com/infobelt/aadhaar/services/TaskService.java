package com.infobelt.aadhaar.services;

import com.infobelt.aadhaar.pojo.Task;
import com.infobelt.aadhaar.service.AbstractAuditingEntityService;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends AbstractAuditingEntityService<Task, CustomAuditor> {

    @Override
    protected Class<Task> getEntityClass() {
        return Task.class;
    }

    @Override
    protected void handleSaveAudit(CustomAuditor customAuditor, Task newInstance) {
        customAuditor.auditLogMe(newInstance);
    }

    @Override
    protected void handleDeleteAudit(CustomAuditor customAuditor, Task entity) {
        customAuditor.auditLogMe(entity);
    }
}
