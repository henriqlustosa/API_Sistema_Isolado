package censo.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import censo.model.Codigo;
import censo.persistence.Conexao;

public class AssessorCodigoLeitoDto {
	
	
	public static final List<Codigo> Censos = null;

	public static ArrayList<Codigo> Censos() {

		ArrayList<Codigo> censos = new ArrayList<Codigo>();
		PreparedStatement preparedStatement;

		String sqlString = "SELECT * FROM agh.v_lista_lto_unf order by lto_id  ;";

		try {

			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Codigo censo = new Codigo();

				
				censo.setNr_quarto(resultSet.getString("lto_id"));
				censo.setNm_unidade_funcional(resultSet.getString("descricao"));
				censo.setNm_unidade_funcional_cod(resultSet.getString("unf_seq"));
				censo.setInd_situacao(resultSet.getString("ind_situacao"));
				censo.setInd_bloq_leito_limpeza(resultSet.getString("ind_bloq_leito_limpeza"));
				
			
				censos.add(censo);

			}
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return censos ;
	}

}
