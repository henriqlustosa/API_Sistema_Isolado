package censo.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import censo.model.Censo;
import censo.persistence.Conexao;

public class CensoNepiDto {
	public static final List<Censo> Censos = null;

	public static ArrayList<Censo> Censos() {

		ArrayList<Censo> censos = new ArrayList<Censo>();
		PreparedStatement preparedStatement;

		String sqlString = "SELECT * FROM agh.v_ain_censo_24_horas;";

		try {

			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Censo censo = new Censo();

				censo.setCd_prontuario(resultSet.getString("prontuario"));
				censo.setNm_paciente(resultSet.getString("nome"));
				censo.setDt_nascimento(resultSet.getString("nascimento"));
				censo.setNr_quarto(resultSet.getString("quarto"));
				censo.setDt_internacao_data(resultSet.getString("data_internacao_data"));
				censo.setDt_internacao_hora(resultSet.getString("data_internacao_hora"));
				censo.setNm_especialidade(resultSet.getString("especialidade"));
				censo.setNm_medico(resultSet.getString("medico"));
				censo.setDt_ultimo_evento_data(resultSet.getString("data_de_movimentacao_data"));
				censo.setDt_ultimo_evento_hora(resultSet.getString("data_de_movimentacao_hora"));
				censo.setNm_origem(resultSet.getString("origem"));
				censo.setNr_convenio(resultSet.getString("convênio"));
				censo.setIn_sexo(resultSet.getString("sexo"));
				censo.setNr_idade(resultSet.getInt( "Idade"));
				censo.setCod_CID(resultSet.getString("CID"));
				censo.setDescricaoCID(resultSet.getString("Descrição do CID"));
				censo.setNm_unidade_funcional(resultSet.getString("unidade_funcional"));
				censo.setTempo(resultSet.getString("tempo"));
				censo.setVinculo(resultSet.getString("vinculo"));
			
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
