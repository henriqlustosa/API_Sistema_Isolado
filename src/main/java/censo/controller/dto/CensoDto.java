package censo.controller.dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import censo.model.Censo;
import censo.persistence.Conexao;

public class CensoDto {

	public static final List<Censo> Censos = null;

	public static ArrayList<Censo> Censos() {

		ArrayList<Censo> censos = new ArrayList<Censo>();
		PreparedStatement preparedStatement;

		String sqlString = "SELECT * FROM agh.v_internacao where dt_saida_paciente is null";

		try {

			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Censo censo = new Censo();

				censo.setCd_prontuario(resultSet.getString("cd_prontuario"));
				censo.setNm_paciente(resultSet.getString("nm_paciente"));
				censo.setIn_sexo(resultSet.getString("in_sexo"));
				censo.setNr_idade(resultSet.getInt("nr_idade"));
				censo.setNr_quarto(resultSet.getString("nr_quarto"));
				censo.setNr_leito(resultSet.getString("nr_leito"));
				censo.setNm_ala(resultSet.getString("nm_ala"));
				censo.setNm_clinica(resultSet.getString("nm_clinica"));
				censo.setNm_unidade_funcional(resultSet.getString("nm_unidade_funcional"));
				censo.setNm_acomodacao(resultSet.getString("nm_acomodacao"));
				censo.setSt_leito(resultSet.getString("st_leito"));

				//StringFormat StringFormat = new SimpleStringFormat("dd/MM/yyyy HH:mm");
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				String dt_internacao = dateFormat.format(resultSet.getTimestamp("dt_internacao"));

				censo.setDt_internacao(dt_internacao);

				String dt_entrada_setor = dateFormat.format(resultSet.getTimestamp("dt_entrada_setor"));
				censo.setDt_entrada_setor(dt_entrada_setor);
				censo.setNm_especialidade(resultSet.getString("nm_especialidade"));
				censo.setNm_medico(resultSet.getString("nm_medico"));

				String dt_ultimo_evento = dateFormat.format(resultSet.getTimestamp("dt_ultimo_evento"));
				censo.setDt_ultimo_evento(dt_ultimo_evento);
				censo.setNm_origem(resultSet.getString("nm_origem"));
				censo.setSg_cid(resultSet.getString("sg_cid"));
				censo.setTx_observacao(resultSet.getString("tx_observacao"));
				censo.setNr_convenio(resultSet.getInt("nr_convenio"));
				censo.setNr_plano(resultSet.getInt("nr_plano"));
				censo.setNm_convenio_plano(resultSet.getString("nm_convenio_plano"));
				censo.setNr_crm_profissional(resultSet.getString("nr_crm_profissional"));
				censo.setNm_carater_internacao(resultSet.getString("nm_carater_internacao"));
				censo.setNm_origem_internacao(resultSet.getString("nm_origem_internacao"));
				censo.setNr_procedimento(resultSet.getString("nr_procedimento"));

				String dt_alta_medica = resultSet.getString("dt_alta_medica");

				if (dt_alta_medica == null) {
					censo.setDt_alta_medica(dt_alta_medica);
				} else {
					dt_alta_medica = dateFormat.format(resultSet.getTimestamp("dt_alta_medica"));
					censo.setDt_alta_medica(dt_alta_medica);
				}

				String dt_saida_paciente = resultSet.getString("dt_saida_paciente");
				if (dt_saida_paciente == null) {
					censo.setDt_saida_paciente(dt_saida_paciente);
				} else {
					dt_saida_paciente = dateFormat.format(resultSet.getTimestamp("dt_saida_paciente"));
					censo.setDt_saida_paciente(dt_saida_paciente);
				}

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