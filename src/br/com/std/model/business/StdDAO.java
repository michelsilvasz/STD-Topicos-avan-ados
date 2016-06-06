package br.com.std.model.business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.std.model.dao.ConnectionFactory;
import br.com.std.model.business.DadosDocumentoTramite;;

public class StdDAO {
	private Connection con;
	
	public StdDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}
	
	@Override
	public void finalize() throws SQLException {
		con.close();
	}
	
	public List<DadosDocumentoTramite> lista() {
		DadosDocumentoTramite x = new DadosDocumentoTramite();
		String sql = "SELECT * FROM NOME-DA-TABELA where ID_TRAMITE = ?";
		List<DadosDocumentoTramite> lista = new ArrayList<DadosDocumentoTramite>();
		try {
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, x.getIdTramite());
		ResultSet res = stmt.executeQuery();
	    
			while(res.next()){
				DadosDocumentoTramite v = new DadosDocumentoTramite();
				v.setIdTramite((int) res.getInt("id_tramite"));
				v.setNomeDocumento(res.getString("nomde_documento"));
				v.setDescricao(res.getString("descricao"));
				v.setDestinatario(res.getString("destinatario"));
				v.setCentroCusto(res.getString("centroCusto"));
				v.setDataTramite(res.getString("data"));
				lista.add(v);
			}
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			}
		return lista;
		}
	public List<DadosDocumentoTramite> lista1() {
		DadosDocumentoTramite t = new DadosDocumentoTramite();
		String sql = "SELECT * FROM NOME-DA-TABELA where ID_TRAMITE = ?";
		List<DadosDocumentoTramite> lista = new ArrayList<DadosDocumentoTramite>();
		try {
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, t.getIdTramite());
		ResultSet res = stmt.executeQuery();
	    
			while(res.next()){
				DadosDocumentoTramite v = new DadosDocumentoTramite();
				v.setIdTramite((int) res.getInt("id_tramite"));
				v.setNomeDocumento(res.getString("nomde_documento"));
				v.setDescricao(res.getString("descricao"));
				v.setDestinatario(res.getString("destinatario"));
				v.setCentroCusto(res.getString("centroCusto"));
				v.setDataTramite(res.getString("data"));
				lista.add(v);
			}
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			}
		return lista;
		}
	public void incluir(DadosDocumentoTramite usu) throws RuntimeException, SQLException {
		String sql = "INSERT INTO tramite (tipo, nomedoc, descricaoDoc, CentroDeCusto, Destinatario, data_tramite) VALUES (?,?,?,?,?,?)";
		java.sql.PreparedStatement stmt = con.prepareStatement(sql);
		try {
			stmt.setString(1, usu.getTipo());
			stmt.setString(2, usu.getNomeDocumento());
			stmt.setString(3, usu.getDescricao());
			stmt.setString(4, usu.getCentroCusto());
			stmt.setString(5, usu.getDestinatario());
			stmt.setString(6, usu.getDataTramite());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			stmt.close();
		}
	}
}
