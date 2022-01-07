package censo.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import censo.model.CentroCirurgico;
import censo.persistence.Conexao;

public class CentroCirurgicoDto {
	
	
public static List<CentroCirurgico> Cirurgias(String _data) {
		
		CentroCirurgico cirurgia_1 = new CentroCirurgico();
		List<CentroCirurgico> cirurgias = new ArrayList<CentroCirurgico>();
		cirurgias.add(cirurgia_1);
		PreparedStatement preparedStatement;
		

		
		String sqlString = "SELECT * FROM agh.v_lista_mbc_cirurgias where data = '" + _data + "';"; 
		
		

		try {

			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				CentroCirurgico cirurgia = new CentroCirurgico();

				cirurgia.setSeq(resultSet.getString("seq"));
				cirurgia.setData(resultSet.getString("data"));
				cirurgia.setSala_nome(resultSet.getString("sala_nome"));
				cirurgia.setPac_codigo(resultSet.getString("pac_codigo"));
				cirurgia.setNome_paciente(resultSet.getString("nome_paciente"));
				cirurgia.setProntuario(resultSet.getString("prontuario"));
				cirurgia.setEsp_seq(resultSet.getString("esp_seq"));
				cirurgia.setEsp_sigla(resultSet.getString("esp_sigla"));
				cirurgia.setEsp_nome(resultSet.getString("esp_nome"));
				cirurgia.setNatureza_agend(resultSet.getString("natureza_agend"));
				cirurgia.setDthr_fim_cirg(resultSet.getString("dthr_fim_cirg"));
				cirurgia.setOrigem_pac_cirg(resultSet.getString("origem_pac_cirg"));
				cirurgia.setCsp_cnv_codigo(resultSet.getString("csp_cnv_codigo"));
				cirurgia.setCsp_seq(resultSet.getString("csp_seq"));
				cirurgia.setDthr_inicio_cirg(resultSet.getString("dthr_inicio_cirg"));
				cirurgia.setLado_cirurgia(resultSet.getString("lado_cirurgia"));
				cirurgia.setSituacao(resultSet.getString("situacao"));
				cirurgia.setAtd_seq(resultSet.getString("atd_seq"));
				cirurgia.setQes_mtc_seq(resultSet.getString("qes_mtc_seq"));
				cirurgia.setQes_seqp(resultSet.getString("qes_seqp"));
				cirurgia.setVvc_qes_mtc_seq(resultSet.getString("vvc_qes_mtc_seq"));
				cirurgia.setVvc_qes_seqp(resultSet.getString("vvc_qes_seqp"));
				cirurgia.setVvc_seqp(resultSet.getString("vvc_seqp"));
				cirurgia.setMtc_seq(resultSet.getString("mtc_seq"));
				cirurgia.setComplemento_canc(resultSet.getString("complemento_canc"));
				cirurgia.setCriado_em(resultSet.getString("criado_em"));
				cirurgia.setInd_digt_nota_sala(resultSet.getString("ind_digt_nota_sala"));
				cirurgia.setSer_matricula(resultSet.getString("ser_matricula"));
				cirurgia.setSer_vin_codigo(resultSet.getString("ser_vin_codigo"));
				cirurgia.setUnf_seq(resultSet.getString("unf_seq"));
				cirurgia.setSci_seqp(resultSet.getString("sci_seqp"));
				cirurgia.setSci_unf_seq(resultSet.getString("sci_unf_seq"));
				cirurgia.setDthr_inicio_ordem(resultSet.getString("dthr_inicio_ordem"));
				cirurgia.setDthr_entrada_sr(resultSet.getString("dthr_entrada_sr"));
				cirurgia.setOrigem_pac_cirg(resultSet.getString("origem_pac_cirg"));
				cirurgia.setCsp_cnv_codigo(resultSet.getString("csp_cnv_codigo"));
				cirurgia.setCsp_seq(resultSet.getString("csp_seq"));
				cirurgia.setDthr_inicio_cirg(resultSet.getString("dthr_inicio_cirg"));
				cirurgia.setLado_cirurgia(resultSet.getString("lado_cirurgia"));
				cirurgia.setSituacao(resultSet.getString("situacao"));
				cirurgia.setAtd_seq(resultSet.getString("atd_seq"));
				cirurgia.setQes_mtc_seq(resultSet.getString("qes_mtc_seq"));
				cirurgia.setQes_seqp(resultSet.getString("qes_seqp"));
				cirurgia.setVvc_qes_mtc_seq(resultSet.getString("vvc_qes_mtc_seq"));
				cirurgia.setVvc_qes_seqp(resultSet.getString("vvc_qes_seqp"));
				cirurgia.setVvc_seqp(resultSet.getString("vvc_seqp"));
				cirurgia.setMtc_seq(resultSet.getString("mtc_seq"));
				cirurgia.setComplemento_canc(resultSet.getString("complemento_canc"));
				cirurgia.setCriado_em(resultSet.getString("criado_em"));
				cirurgia.setInd_digt_nota_sala(resultSet.getString("ind_digt_nota_sala"));
				cirurgia.setSer_matricula(resultSet.getString("ser_matricula"));
				cirurgia.setSer_vin_codigo(resultSet.getString("ser_vin_codigo"));
				cirurgia.setUnf_seq(resultSet.getString("unf_seq"));
				cirurgia.setSci_seqp(resultSet.getString("sci_seqp"));
				cirurgia.setSci_unf_seq(resultSet.getString("sci_unf_seq"));
				cirurgia.setDthr_inicio_ordem(resultSet.getString("dthr_inicio_ordem"));
				cirurgia.setDthr_entrada_sr(resultSet.getString("dthr_entrada_sr"));
				cirurgia.setDthr_saida_sr(resultSet.getString("dthr_saida_sr"));
				cirurgia.setProc_descr(resultSet.getString("proc_descr"));
				cirurgia.setNome_equipe(resultSet.getString("nome_equipe"));
				cirurgia.setProjeto(resultSet.getString("projeto"));
				cirurgia.setTemp_desc_ciru_pendente(resultSet.getString("temp_desc_ciru_pendente"));
				cirurgia.setTemp_desc_ciru(resultSet.getString("temp_desc_ciru"));
				cirurgia.setTemp_desc_pdt_pendente(resultSet.getString("temp_desc_pdt_pendente"));
				cirurgia.setTemp_desc_pdt_simples(resultSet.getString("temp_desc_pdt_simples"));
				cirurgia.setFicha_seq(resultSet.getString("ficha_seq"));
				cirurgia.setFicha_pendente(resultSet.getString("ficha_pendente"));
				cirurgia.setTem_certificacao(resultSet.getString("tem_certificacao"));
				cirurgia.setTem_germe_multi(resultSet.getString("tem_germe_multi"));
				cirurgia.setExige_cerih(resultSet.getString("exige_cerih"));
				cirurgia.setIto_Ito_id(resultSet.getString("lto_lto_id"));
				cirurgia.setPac_unf_seq(resultSet.getString("pac_unf_seq"));
				cirurgia.setDt_ult_internacao(resultSet.getString("dt_ult_internacao"));
				cirurgia.setDt_ult_alta(resultSet.getString("dt_ult_alta"));
				cirurgia.setQrt_descricao(resultSet.getString("qrt_descricao"));
				cirurgia.setTem_pac_internacao(resultSet.getString("tem_pac_internacao"));
				cirurgia.setPac_unf_ala(resultSet.getString("pac_unf_ala"));
				cirurgia.setPac_unf_andar(resultSet.getString("pac_unf_andar"));
				
				cirurgias.add(cirurgia);

			}
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage() );
		} catch (Exception e) {
			e.printStackTrace();
		}
		cirurgias.remove(0);
		return cirurgias;
	}

}
