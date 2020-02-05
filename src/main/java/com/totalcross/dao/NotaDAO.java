package com.totalcross.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.totalcross.util.DatabaseManager;
import com.totalcross.model.Nota;

import totalcross.sql.Connection;
import totalcross.sql.PreparedStatement;
import totalcross.sql.ResultSet;
import totalcross.sql.Statement;

public class NotaDAO{
    // insert
	public boolean insertNota(Nota nota) throws SQLException {
		boolean success = false;
		Connection dbcon = DatabaseManager.getConnection();
		String sql = "insert into person values(?)";
		PreparedStatement ps = dbcon.prepareStatement(sql);
        ps.setString(1, nota.getTitle());
        ps.setString(2, nota.getDescription()); // é assim?

		int i = ps.executeUpdate();
		ps.close();

		if (i > 0) {
			success = true;
		} else {
			success = false;
		}
		return success;
	}

    // read
    // search for title
	public ArrayList<Nota> getNota() throws SQLException {
		ArrayList<Nota> notas = new ArrayList<>();

		try {
			Connection dbcon = DatabaseManager.getConnection();
			Statement st = dbcon.createStatement();
			ResultSet rs = st.executeQuery("select * from nota where title = ");

			while (rs.next()) {
				// Nota nota = rs.getString("cpf"); // O que eu faço aqui?
				// notas.add(cpf);
			}
			rs.close();
			st.close();
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}

		return notas;
	}

    // update
	public void updateNota(Nota newNota, Nota oldNota) throws SQLException {
		Connection dbcon = DatabaseManager.getConnection();
		String sql = "UPDATE nota SET title = " + newNota.getTitle() + ", description = " + newNota.getDescription() + " WHERE title = " + oldNota.getTitle();
		PreparedStatement ps = dbcon.prepareStatement(sql);
		ps.executeUpdate();
	}

    // delete
	public void deleteNota(String titulo) throws SQLException {
		Connection dbcon = DatabaseManager.getConnection();
		String sql = "DELETE from person where title = ?";
		PreparedStatement ps = dbcon.prepareStatement(sql);
		ps.setString(1, titulo);
		ps.executeUpdate();
	}

    
}