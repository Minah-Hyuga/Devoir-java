package com.ism.Repository.list;

import java.util.List;

public interface IRepository<T> {
    void insert(T value);

    List<T> selectAll();
}
