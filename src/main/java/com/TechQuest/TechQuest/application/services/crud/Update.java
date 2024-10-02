package com.TechQuest.TechQuest.application.services.crud;

public interface Update<ID,Entity>{
    public Entity update(ID id);
}
