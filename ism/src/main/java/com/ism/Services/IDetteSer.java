package com.ism.Services;

import java.util.List;

import com.ism.entities.Dette;

public interface IDetteSer {
    void create(Dette value);

    List<Dette> getAll();
}
