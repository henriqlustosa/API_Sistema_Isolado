package censo.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import censo.model.PessoaServidor;
import censo.persistence.Conexao;

public class AssessorPessoaServidorDto {
	
	public static final PessoaServidor PesssoaServidor = null;

	public static List<PessoaServidor> profissional(String CPF) {
		PessoaServidor PesssoaServidor_1 = new PessoaServidor();
		List<PessoaServidor> profissionais = new ArrayList<PessoaServidor>();
		profissionais.add(PesssoaServidor_1);
	
		PreparedStatement preparedStatement;
		String sqlString ="";
		
		if(CPF.contentEquals("0"))
		{
			sqlString = "SELECT pes_codigo, ser_vin_codigo, ser_matricula, vin_descricao, nome, dt_nascimento, dt_fim_vinculo, nome_usual, sexo, oca_car_codigo, oca_codigo, cct_codigo, cct_codigo_atua, ind_situacao, fone_celular, fone_residencial, fone_pager_bip, dt_inicio_vinculo, turno, ram_nro_ramal, cpf, cct_codigo_desempenho\r\n" + 
					"	,nm_mae, nm_pai FROM agh.v_rap_pessoa_servidor " ;
		}
		else
		{
		sqlString = "SELECT pes_codigo, ser_vin_codigo, ser_matricula, vin_descricao, nome, dt_nascimento, dt_fim_vinculo, nome_usual, sexo, oca_car_codigo, oca_codigo, cct_codigo, cct_codigo_atua, ind_situacao, fone_celular, fone_residencial, fone_pager_bip, dt_inicio_vinculo, turno, ram_nro_ramal, cpf, cct_codigo_desempenho\r\n" + 
				" ,nm_mae, nm_pai FROM agh.v_rap_pessoa_servidor where cpf = " + CPF + " ;" ;
		}
		try {
			
			
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				PessoaServidor profissional = new PessoaServidor();
				


				profissional.setCPF(resultSet.getString("cpf"));
				profissional.setNome(resultSet.getString("nome"));
				profissional.setMatricula(resultSet.getString("ser_matricula"));
				profissional.setSexo(resultSet.getString("sexo"));
				profissional.setDt_nascimento(resultSet.getString("dt_nascimento"));
				profissional.setMae(resultSet.getString("nm_mae"));
				profissional.setPai(resultSet.getString("nm_pai"));
				
				
				profissionais.add(profissional);
			}

			
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		profissionais.remove(0);
		return profissionais ;
	}

}
