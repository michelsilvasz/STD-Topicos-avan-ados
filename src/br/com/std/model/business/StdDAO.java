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
		String sql = "SELECT * FROM NOME-DA-TABELA where ID-TRAMITE=IDTRAMITE";
		List<DadosDocumentoTramite> lista = new ArrayList<DadosDocumentoTramite>();
		try {
		PreparedStatement stmt = con.prepareStatement(sql);
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
}
