package com.ism.Services;

import java.util.List;

import com.ism.Repository.list.IRepository;
import com.ism.entities.Dette;

public class DetteService implements IDetteSer {
    private IRepository<Dette> DetteRep;

    public void IDetteSer(IRepository<Dette> DetteRep) {
        this.DetteRep = DetteRep;
    }

    public void create(Dette Dette) {
        DetteRep.insert(Dette);
    }

    public List<Dette> getAll() {
        return DetteRep.selectAll();
    }
}
