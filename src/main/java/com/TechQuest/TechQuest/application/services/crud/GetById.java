package com.TechQuest.TechQuest.application.services.crud;

public interface GetById<Entity, ID> {
    public Entity getById(ID id);
}
