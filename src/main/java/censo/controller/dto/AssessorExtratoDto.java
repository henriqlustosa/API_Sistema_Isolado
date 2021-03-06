package censo.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import censo.model.Extrato;
import censo.persistence.Conexao;

public class AssessorExtratoDto {
	public static final Extrato Extrato = null;

	public static List<Extrato> Extrato(String dataInicial, String dataFinal) {
		Extrato extrato_1 = new Extrato();
		List<Extrato> extratos = new ArrayList<Extrato>();
		extratos.add(extrato_1);
	
		PreparedStatement preparedStatement;

		String sqlString = "SELECT *  FROM agh.v_extrato_internacao where dt_lancamento between '" + dataInicial + "' and '" + dataFinal + "'" ;

		try {
			
			
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				Extrato extrato = new Extrato();
				
		

				extrato.setCd_prontuario(resultSet.getString("cd_prontuario"));
				extrato.setNm_paciente(resultSet.getString("nm_paciente"));
				extrato.setDt_lancamento(resultSet.getString("dt_lancamento"));
				extrato.setNm_movimento(resultSet.getString("nm_movimento"));
				extrato.setNm_especialidade(resultSet.getString("nm_especialidade"));
				extrato.setNr_leito(resultSet.getString("nr_leito"));
				extrato.setNr_quarto(resultSet.getString("nr_quarto"));
				extrato.setNm_unidade_funcional(resultSet.getString("nm_unidade_funcional"));
				extrato.setNr_int_seq(resultSet.getString("nr_int_seq"));
				extrato.setNr_seq(resultSet.getString("nr_seq"));
				extrato.setDc_origem(resultSet.getString("dc_origem"));
				
				extratos.add(extrato);
			}

			
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		extratos.remove(0);
		return extratos ;
	}

}
