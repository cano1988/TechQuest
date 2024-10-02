package com.TechQuest.TechQuest.application.services.crud;

public interface GetByName<Entity, String>{
    public Entity getByName(String name);
}
