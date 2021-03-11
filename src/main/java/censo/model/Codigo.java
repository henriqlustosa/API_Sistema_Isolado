package censo.model;

public class Codigo {
	
	
	
	
	
	private String nr_quarto;
	private String nm_unidade_funcional;
	

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
	
		
		result = prime * result + ((nr_quarto == null) ? 0 : nr_quarto.hashCode());
		
		result = prime * result + ((nm_unidade_funcional == null) ? 0 : nm_unidade_funcional.hashCode());
		
		
	
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
	
	
		
		return true;
	}
	public String getNm_unidade_funcional() {
		return nm_unidade_funcional;
	}
	public void setNm_unidade_funcional(String nm_unidade_funcional) {
		this.nm_unidade_funcional = nm_unidade_funcional;
	}
	

}
