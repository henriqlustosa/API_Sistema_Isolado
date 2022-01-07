package censo.model;

public class Codigo {
	
	private String nr_quarto;
	private String nm_unidade_funcional;
	private String nm_unidade_funcional_cod;
	private String ind_situacao;
	private String ind_bloq_leito_limpeza;
	

	public String getNr_quarto() {
		return nr_quarto;
	}
	public void setNr_quarto(String nr_quarto) {
		this.nr_quarto = nr_quarto;
	}
	public String getNm_unidade_funcional() {
		return nm_unidade_funcional;
	}
	public void setNm_unidade_funcional(String nm_unidade_funcional) {
		this.nm_unidade_funcional = nm_unidade_funcional;
	}
	
	public String getNm_unidade_funcional_cod() {
		return nm_unidade_funcional_cod;
	}
	public void setNm_unidade_funcional_cod(String nm_unidade_funcional_cod) {
		this.nm_unidade_funcional_cod = nm_unidade_funcional_cod;
	}
	public String getInd_situacao() {
		return ind_situacao;
	}
	public void setInd_situacao(String ind_situacao) {
		this.ind_situacao = ind_situacao;
	}
	public String getInd_bloq_leito_limpeza() {
		return ind_bloq_leito_limpeza;
	}
	public void setInd_bloq_leito_limpeza(String ind_bloq_leito_limpeza) {
		this.ind_bloq_leito_limpeza = ind_bloq_leito_limpeza;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	
		
		result = prime * result + ((nr_quarto == null) ? 0 : nr_quarto.hashCode());
		
		result = prime * result + ((nm_unidade_funcional == null) ? 0 : nm_unidade_funcional.hashCode());
		result = prime * result + ((nm_unidade_funcional_cod == null) ? 0 : nm_unidade_funcional_cod.hashCode());
		result = prime * result + ((ind_situacao == null) ? 0 : ind_situacao.hashCode());
		result = prime * result + ((ind_bloq_leito_limpeza == null) ? 0 : ind_bloq_leito_limpeza.hashCode());
		
	
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
		
		Codigo other = (Codigo) obj;
		
		
		

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
		
		if (nm_unidade_funcional_cod == null) {
			if (other.nm_unidade_funcional_cod != null)
				return false;
		} else if (!nm_unidade_funcional_cod.equals(other.nm_unidade_funcional_cod))
			return false;
	
		if (ind_situacao == null) {
			if (other.ind_situacao != null)
				return false;
		} else if (!ind_situacao.equals(other.ind_situacao))
			return false;
		
		if (ind_bloq_leito_limpeza == null) {
			if (other.ind_bloq_leito_limpeza != null)
				return false;
		} else if (!ind_bloq_leito_limpeza.equals(other.ind_bloq_leito_limpeza))
			return false;
		
		return true;
	}
	
	
	

}
