package com.example.gestorecorsi.db;

import com.example.gestorecorsi.model.Corso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CorsoDAO {

    public List<Corso> getCorsoByPd(int pd){

        List<Corso> corsi = new ArrayList<>();

        try {
            Connection conn = DBConnect.getConnection();

            String sql = "SELECT * FROM corso WHERE pd = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pd);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Corso corso = new Corso(rs.getString("codins"), rs.getInt("crediti"), rs.getString("nome"), rs.getInt("pd"));
                corsi.add(corso);
            }

            conn.close();

            return corsi;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
