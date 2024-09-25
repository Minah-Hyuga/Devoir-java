package com.ism.Repository.list;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl<T> implements IRepository<T> {
    protected List<T> list = new ArrayList<>();

    @Override
    public void insert(T value) {
        list.add(value);
    }

    @Override
    public List<T> selectAll() {
        return list;
    }
}
