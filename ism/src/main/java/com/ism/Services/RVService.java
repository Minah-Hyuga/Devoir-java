package com.ism.Services;

import java.util.List;

import com.ism.Repository.list.IRepository;
import com.ism.entities.RV;

public class RVService implements IRVService {
    private IRepository<RV> RVRep;

    // couplage faible

    public RVService(IRepository<RV> RVRep) {
        this.RVRep = RVRep;
    }

    @Override
    public void create(RV RV) {
        RVRep.insert(RV);
    }

    @Override

    public List<RV> getAll() {
        return RVRep.selectAll();
    }

    @Override
    public void add(RV saisie) {
        RVRep.insert(saisie);
    }

    @Override
    public Object selectAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectAll'");
    }
}
