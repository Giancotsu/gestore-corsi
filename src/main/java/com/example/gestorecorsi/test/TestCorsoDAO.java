package com.example.gestorecorsi.test;

import com.example.gestorecorsi.db.CorsoDAO;
import com.example.gestorecorsi.model.Corso;

import java.util.ArrayList;
import java.util.List;

public class TestCorsoDAO {

    public static void getCorsoByPd(){

        CorsoDAO dao = new CorsoDAO();

        List<Corso> result;

        result = dao.getCorsoByPd(2);

        for (Corso c : result) {
            System.out.println("" + c);
        }
    }
}
