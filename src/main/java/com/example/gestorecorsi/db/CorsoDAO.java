package com.example.gestorecorsi.db;

import com.example.gestorecorsi.model.Corso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorsoDAO {

    public List<Corso> getCorsoByPd(int pd){

        List<Corso> corsi = new ArrayList<>();

        String sql = "SELECT * FROM corso WHERE pd = ?";

        try {
            Connection conn = DBConnect.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pd);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Corso corso = new Corso(rs.getString("codins"), rs.getInt("crediti"),
                        rs.getString("nome"), rs.getInt("pd"));

                corsi.add(corso);
            }

            conn.close();

            return corsi;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Map<Corso, Integer> getCorsiIscritti(int periodo) {

        String sql = "SELECT c.codins, c.crediti, c.nome, c.pd, COUNT(*) AS n "
                + "FROM corso c, iscrizione i "
                + "WHERE c.codins = i.codins and c.pd = ? "
                + "GROUP BY c.codins, c.crediti, c.nome, c.pd";

        Map<Corso, Integer> result = new HashMap<>();

        try {

            Connection conn = DBConnect.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, periodo);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Corso corso = new Corso(rs.getString("codins"),
                        rs.getInt("crediti"), rs.getString("nome"),
                        rs.getInt("pd"));

                result.put(corso, rs.getInt("n"));
            }

            st.close();
            rs.close();
            conn.close();
            return result;

        } catch(SQLException e) {
            System.out.println("Error in Corso DAO");
            e.printStackTrace();
            return null;

        }
    }
}
