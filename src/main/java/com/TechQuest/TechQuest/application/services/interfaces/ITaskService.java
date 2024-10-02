package com.TechQuest.TechQuest.application.services.interfaces;

import com.riwi.TechQuest.application.services.crud.Create;
import com.riwi.TechQuest.application.services.crud.Delete;
import com.riwi.TechQuest.application.services.crud.GetByName;
import com.riwi.TechQuest.application.services.crud.Update;
import com.riwi.TechQuest.domain.model.entities.Task;

public interface ITaskService extends
        Create<Task,Task>,
        Delete<Long>,
        GetByName<Task, String>,
        Update<Long, Task> {
}
