package com.ism.Services;

import java.util.List;

import com.ism.Repository.list.IRepository;
import com.ism.entities.Medecin;

public class MedecinService implements IMedecinSer {
    private IRepository<Medecin> MedecinRep;

    // couplage faible

    public MedecinService(IRepository<Medecin> MedecinRep) {
        this.MedecinRep = MedecinRep;
    }

    @Override
    public void create(Medecin Medecin) {
        MedecinRep.insert(Medecin);
    }

    @Override

    public List<Medecin> getAll() {
        return MedecinRep.selectAll();
    }

}
