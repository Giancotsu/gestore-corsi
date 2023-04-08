package com.example.gestorecorsi.test;

import com.example.gestorecorsi.db.CorsoDAO;

public class TestCorsoDAO {

    public static void getCorsoByPd(){

        CorsoDAO corsoDAO = new CorsoDAO();
        System.out.println(corsoDAO.getCorsoByPd(2));
    }
}
