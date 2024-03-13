package com.supermarket.DAO;

import java.util.List;

public abstract class HeThongDAO<EntityType, Key> {

    public abstract void insert(EntityType entity);

    public abstract void update(EntityType entity);

    public abstract void delete(Key entity);

    public abstract List<EntityType> selectAll();

    public abstract EntityType selectById(Key key);

    public abstract List<EntityType> selectSql(String sql, Object... args);
}
