package censo.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import censo.model.Censo;
import censo.persistence.Conexao;

public class CensoPacienteDto{
	public static final Censo Censo = null;

	public static Censo Censos(Long _prontuario) {

		Censo censo = new Censo();
		PreparedStatement preparedStatement;

		String sqlString = "SELECT prontuario, nome, nascimento, quarto, data_internacao_data, data_internacao_hora, \r\n" + 
				"       especialidade, sexo, \"Idade\" as idade, \"CID\" as cid, \"Descrição do CID\" as descricao, unidade_funcional, tempo, vinculo\r\n" + 
				"  FROM agh.v_ain_censo_24_horas where data_internacao_data != '' and prontuario = " + _prontuario + " ;" ;

		try {

			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				

				censo.setCd_prontuario(resultSet.getString("prontuario"));
				censo.setNm_paciente(resultSet.getString("nome"));
				censo.setDt_nascimento(resultSet.getString("nascimento"));
				censo.setNr_quarto(resultSet.getString("quarto"));
				censo.setDt_internacao_data(resultSet.getString("data_internacao_data"));
				censo.setDt_internacao_hora(resultSet.getString("data_internacao_hora"));
				censo.setNm_especialidade(resultSet.getString("especialidade"));
				censo.setIn_sexo(resultSet.getString("sexo"));
				censo.setNr_idade(resultSet.getInt( "idade"));
				censo.setCod_CID(resultSet.getString("cid"));
				censo.setDescricaoCID(resultSet.getString("descricao"));
				censo.setNm_unidade_funcional(resultSet.getString("unidade_funcional"));
				censo.setTempo(resultSet.getString("tempo"));
				censo.setVinculo(resultSet.getString("vinculo"));
			}

			
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return censo ;
	}

}
