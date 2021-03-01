package censo.model;





import censo.model.Censo;

public class Censo {
	private String cd_prontuario;
	private String nm_paciente;
	private String dt_nascimento;
	private String nr_quarto;
	private String dt_internacao_data;
	private String dt_internacao_hora;
	private String nm_especialidade;
	private String nm_medico;
	private String dt_ultimo_evento_data;
	private String dt_ultimo_evento_hora;
	private String nm_origem;
	private String nr_convenio;
	private String in_sexo;
	private Integer nr_idade;
	private String cod_CID;
	private String descricaoCID;
	private String nm_unidade_funcional;
	private String tempo;
	private String vinculo;
	


	
	public String getCd_prontuario() {
		return cd_prontuario;
	}
	public void setCd_prontuario(String cd_prontuario) {
		this.cd_prontuario = cd_prontuario;
	}
	public String getNm_paciente() {
		return nm_paciente;
	}
	public void setNm_paciente(String nm_paciente) {
		this.nm_paciente = nm_paciente;
	}
	public String getIn_sexo() {
		return in_sexo;
	}
	public void setIn_sexo(String in_sexo) {
		this.in_sexo = in_sexo;
	}
	public Integer getNr_idade() {
		return nr_idade;
	}
	public void setNr_idade(Integer nr_idade) {
		this.nr_idade = nr_idade;
	}
	public String getNr_quarto() {
		return nr_quarto;
	}
	public void setNr_quarto(String nr_quarto) {
		this.nr_quarto = nr_quarto;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_prontuario == null) ? 0 : cd_prontuario.hashCode());
		
		result = prime * result + ((nm_paciente == null) ? 0 : nm_paciente.hashCode());
		
		result = prime * result + ((dt_nascimento == null) ? 0 : dt_nascimento.hashCode());
		
		result = prime * result + ((nr_quarto == null) ? 0 : nr_quarto.hashCode());
		
		result = prime * result + ((dt_internacao_data == null) ? 0 : dt_internacao_data.hashCode());
		
		result = prime * result + ((dt_internacao_hora == null) ? 0 : dt_internacao_hora.hashCode());
		
		result = prime * result + ((nm_especialidade == null) ? 0 : nm_especialidade.hashCode());
		
		result = prime * result + ((nm_medico == null) ? 0 : nm_medico.hashCode());
		
		result = prime * result + ((dt_ultimo_evento_data == null) ? 0 : dt_ultimo_evento_data.hashCode());
		
		result = prime * result + ((dt_ultimo_evento_hora == null) ? 0 : dt_ultimo_evento_hora.hashCode());
		
		result = prime * result + ((nm_origem == null) ? 0 : nm_origem.hashCode());
		
		result = prime * result + ((nr_convenio == null) ? 0 : nr_convenio.hashCode());
		
		result = prime * result + ((in_sexo == null) ? 0 : in_sexo.hashCode());
		
		result = prime * result + ((nr_idade == null) ? 0 : nr_idade.hashCode());
		
		result = prime * result + ((cod_CID == null) ? 0 : cod_CID.hashCode());
		
		result = prime * result + ((descricaoCID == null) ? 0 : descricaoCID.hashCode());
		
		result = prime * result + ((nm_unidade_funcional == null) ? 0 : nm_unidade_funcional.hashCode());
		
		result = prime * result + ((tempo == null) ? 0 : tempo.hashCode());
		
		result = prime * result + ((vinculo == null) ? 0 : vinculo.hashCode());
	
		
		
	
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Censo other = (Censo) obj;
		
		if (cd_prontuario == null) {
			if (other.cd_prontuario != null)
				return false;
		} else if (!cd_prontuario.equals(other.cd_prontuario))
			return false;
		
		if (nm_paciente == null) {
			if (other.nm_paciente != null)
				return false;
		} else if (!nm_paciente.equals(other.nm_paciente))
			return false;
		
		if (dt_nascimento == null) {
			if (other.dt_nascimento != null)
				return false;
		} else if (!dt_nascimento.equals(other.dt_nascimento))
			return false;
		

		if (nr_quarto == null) {
			if (other.nr_quarto != null)
				return false;
		} else if (!nr_quarto.equals(other.nr_quarto))
			return false;
		
		
		if (dt_internacao_data == null) {
			if (other.dt_internacao_data != null)
				return false;
		} else if (!dt_internacao_data.equals(other.dt_internacao_data))
			return false;
		
		if (dt_internacao_hora == null) {
			if (other.dt_internacao_hora != null)
				return false;
		} else if (!dt_internacao_hora.equals(other.dt_internacao_hora))
			return false;

		if (nm_especialidade == null) {
			if (other.nm_especialidade != null)
				return false;
		} else if (!nm_especialidade.equals(other.nm_especialidade))
			return false;
		
		if (nm_medico == null) {
			if (other.nm_medico != null)
				return false;
		} else if (!nm_medico.equals(other.nm_medico))
			return false;
		
		if (dt_ultimo_evento_data == null) {
			if (other.dt_ultimo_evento_data != null)
				return false;
		} else if (!dt_ultimo_evento_data.equals(other.dt_ultimo_evento_data))
			return false;
		
		if (dt_ultimo_evento_hora == null) {
			if (other.dt_ultimo_evento_hora != null)
				return false;
		} else if (!dt_ultimo_evento_hora.equals(other.dt_ultimo_evento_hora))
			return false;
		
		if (nm_origem == null) {
			if (other.nm_origem != null)
				return false;
		} else if (!nm_origem.equals(other.nm_origem))
			return false;
		
		if (nr_convenio == null) {
			if (other.nr_convenio != null)
				return false;
		} else if (!nr_convenio.equals(other.nr_convenio))
			return false;
		
		
		if (in_sexo == null) {
			if (other.in_sexo != null)
				return false;
		} else if (!in_sexo.equals(other.in_sexo))
			return false;
		
		if (nr_idade == null) {
			if (other.nr_idade != null)
				return false;
		} else if (!nr_idade.equals(other.nr_idade))
			return false;
	
		if (cod_CID == null) {
			if (other.cod_CID != null)
				return false;
		} else if (!cod_CID.equals(other.cod_CID))
			return false;
		
		if (descricaoCID == null) {
			if (other.descricaoCID != null)
				return false;
		} else if (!cod_CID.equals(other.descricaoCID))
			return false;
		
		if (nm_unidade_funcional == null) {
			if (other.nm_unidade_funcional != null)
				return false;
		} else if (!nm_unidade_funcional.equals(other.nm_unidade_funcional))
			return false;
		
		if (tempo == null) {
			if (other.tempo != null)
				return false;
		} else if (!tempo.equals(other.tempo))
			return false;
	
		
		if (vinculo == null) {
			if (other.vinculo != null)
				return false;
		} else if (!vinculo.equals(other.vinculo))
			return false;
	
	
		
		return true;
	}
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
	public String getCod_CID() {
		return cod_CID;
	}
	public void setCod_CID(String cod_CID) {
		this.cod_CID = cod_CID;
	}
	public String getDescricaoCID() {
		return descricaoCID;
	}
	public void setDescricaoCID(String descricaoCID) {
		this.descricaoCID = descricaoCID;
	}
	public String getVinculo() {
		return vinculo;
	}
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}
	public String getNm_unidade_funcional() {
		return nm_unidade_funcional;
	}
	public void setNm_unidade_funcional(String nm_unidade_funcional) {
		this.nm_unidade_funcional = nm_unidade_funcional;
	}
	public String getDt_internacao_data() {
		return dt_internacao_data;
	}

	
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public void setDt_internacao_data(String dt_internacao_data) {
		this.dt_internacao_data = dt_internacao_data;
	}
	public String getDt_internacao_hora() {
		return dt_internacao_hora;
	}
	public void setDt_internacao_hora(String dt_internacao_hora) {
		this.dt_internacao_hora = dt_internacao_hora;
	}
	public String getNm_especialidade() {
		return nm_especialidade;
	}
	public void setNm_especialidade(String nm_especialidade) {
		this.nm_especialidade = nm_especialidade;
	}
	public String getNm_medico() {
		return nm_medico;
	}
	public void setNm_medico(String nm_medico) {
		this.nm_medico = nm_medico;
	}
	public String getDt_ultimo_evento_data() {
		return dt_ultimo_evento_data;
	}
	public void setDt_ultimo_evento_data(String dt_ultimo_evento_data) {
		this.dt_ultimo_evento_data = dt_ultimo_evento_data;
	}
	public String getDt_ultimo_evento_hora() {
		return dt_ultimo_evento_hora;
	}
	public void setDt_ultimo_evento_hora(String dt_ultimo_evento_hora) {
		this.dt_ultimo_evento_hora = dt_ultimo_evento_hora;
	}
	public String getNr_convenio() {
		return nr_convenio;
	}
	public void setNr_convenio(String nr_convenio) {
		this.nr_convenio = nr_convenio;
	}
	public String getNm_origem() {
		return nm_origem;
	}
	public void setNm_origem(String nm_origem) {
		this.nm_origem = nm_origem;
	}



}
