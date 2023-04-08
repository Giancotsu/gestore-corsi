package com.example.gestorecorsi.model;

import com.example.gestorecorsi.db.CorsoDAO;

import java.util.List;

public class Model {

    private CorsoDAO corsoDAO;

    public Model() {
        this.corsoDAO = new CorsoDAO();
    }

    public List<Corso> getCorsiByPeriodo(int periodo){
        return this.corsoDAO.getCorsoByPd(periodo);
    }
}
