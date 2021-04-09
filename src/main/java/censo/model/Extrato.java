package censo.model;

public class Extrato {
	
	
	private String cd_prontuario;
	private String nm_paciente;
	private String dt_lancamento;
	private String nm_movimento;
	private String nm_especialidade;
	private String nr_leito;
	private String nr_quarto;
	private String nm_unidade_funcional;
	private String nr_int_seq;
	private String nr_seq;
	private String dc_origem;
	
	


	
	public String getCd_prontuario() {
		return cd_prontuario;
	}
	public void setCd_prontuario(String cd_prontuario) {
		this.cd_prontuario = cd_prontuario;
	}
	public void setNm_paciente(String nm_paciente) {
		this.nm_paciente = nm_paciente;
	}
	public String getNm_paciente() {
		return nm_paciente;
	}
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_prontuario == null) ? 0 : cd_prontuario.hashCode());
		
		result = prime * result + ((nm_paciente == null) ? 0 : nm_paciente.hashCode());
		
		result = prime * result + ((dt_lancamento == null) ? 0 : dt_lancamento.hashCode());
		
		result = prime * result + ((nm_movimento == null) ? 0 : nm_movimento.hashCode());
		
		result = prime * result + ((nm_especialidade == null) ? 0 : nm_especialidade.hashCode());
		
		result = prime * result + ((nr_leito == null) ? 0 : nr_leito.hashCode());
		
		result = prime * result + ((nr_quarto == null) ? 0 : nr_quarto.hashCode());
		
		result = prime * result + ((nm_unidade_funcional == null) ? 0 : nm_unidade_funcional.hashCode());
		
		result = prime * result + ((nr_int_seq == null) ? 0 : nr_int_seq.hashCode());
		
		result = prime * result + ((nr_seq == null) ? 0 : nr_seq.hashCode());
		
		result = prime * result + ((dc_origem == null) ? 0 : dc_origem.hashCode());
	
		
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
		Extrato other = (Extrato) obj;
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
		
		if (dt_lancamento == null) {
			if (other.dt_lancamento != null)
				return false;
		} else if (!dt_lancamento.equals(other.dt_lancamento))
			return false;
		

		if (nm_movimento == null) {
			if (other.nm_movimento != null)
				return false;
		} else if (!nm_movimento.equals(other.nm_movimento))
			return false;
		
		
		if (nm_especialidade == null) {
			if (other.nm_especialidade != null)
				return false;
		} else if (!nm_especialidade.equals(other.nm_especialidade))
			return false;
		if (nr_leito == null) {
			if (other.nr_leito != null)
				return false;
		} else if (!nr_leito.equals(other.nr_leito))
			return false;

		if (nr_quarto == null) {
			if (other.nr_quarto != null)
				return false;
		} else if (!nr_quarto.equals(other.nr_quarto))
			return false;
		if (nm_unidade_funcional == null) {
			if (other.nm_unidade_funcional != null)
				return false;
		} else if (!nm_unidade_funcional.equals(other.nm_unidade_funcional))
			return false;
		
		 if(nr_int_seq == null) {
				if (other.nr_int_seq != null)
					return false;
			} else if (!nr_int_seq.equals(other.nr_int_seq))
				return false;
		
		 if(nr_seq == null) {
				if (other.nr_seq != null)
					return false;
			} else if (!nr_seq.equals(other.nr_seq))
				return false;
		
		 if(dc_origem == null) {
				if (other.dc_origem != null)
					return false;
			} else if (!dc_origem.equals(other.dc_origem))
				return false;
		
		
	
		
		return true;
	}
	

	public String getDt_lancamento() {
		return dt_lancamento;
	}
	public void setDt_lancamento(String dt_lancamento) {
		this.dt_lancamento = dt_lancamento;
	}
	public String getNm_movimento() {
		return nm_movimento;
	}
	public void setNm_movimento(String nm_movimento) {
		this.nm_movimento = nm_movimento;
	}
	public String getNm_especialidade() {
		return nm_especialidade;
	}
	public void setNm_especialidade(String nm_especialidade) {
		this.nm_especialidade = nm_especialidade;
	}
	public String getNr_leito() {
		return nr_leito;
	}
	public void setNr_leito(String nr_leito) {
		this.nr_leito = nr_leito;
	}
	public String getNm_unidade_funcional() {
		return nm_unidade_funcional;
	}
	public void setNm_unidade_funcional(String nm_unidade_funcional) {
		this.nm_unidade_funcional = nm_unidade_funcional;
	}
	public String getNr_quarto() {
		return nr_quarto;
	}
	public void setNr_quarto(String nr_quarto) {
		this.nr_quarto = nr_quarto;
	}
	public String getDc_origem() {
		return dc_origem;
	}
	public void setDc_origem(String dc_origem) {
		this.dc_origem = dc_origem;
	}
	public String getNr_seq() {
		return nr_seq;
	}
	public void setNr_seq(String nr_seq) {
		this.nr_seq = nr_seq;
	}
	public String getNr_int_seq() {
		return nr_int_seq;
	}
	public void setNr_int_seq(String nr_int_seq) {
		this.nr_int_seq = nr_int_seq;
	}




}
