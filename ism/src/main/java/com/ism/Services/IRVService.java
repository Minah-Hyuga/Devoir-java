package com.ism.Services;

import java.util.List;

import com.ism.entities.RV;

public interface IRVService {
    void create(RV value);

    List<RV> getAll();

    void add(RV saisie);

    Object selectAll();

}
