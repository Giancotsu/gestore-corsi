package com.example.gestorecorsi.model;

import com.example.gestorecorsi.db.CorsoDAO;

import java.util.List;
import java.util.Map;

public class Model {

    private CorsoDAO corsoDAO;

    public Model() {
        this.corsoDAO = new CorsoDAO();
    }

    public List<Corso> getCorsiByPeriodo(int periodo){
        return this.corsoDAO.getCorsoByPd(periodo);
    }

    public Map<Corso,Integer> getCorsiIscritti(int periodo) {
        return this.corsoDAO.getCorsiIscritti(periodo);
    }
}
