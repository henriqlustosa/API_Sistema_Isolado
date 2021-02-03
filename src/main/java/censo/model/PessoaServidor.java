package censo.model;

public class PessoaServidor {
	
	private String CPF;
	private String nome;
	private String matricula;
	private String sexo;
	private String dt_nascimento;
	private String mae;
	private String pai;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		
		result = prime * result + ((dt_nascimento == null) ? 0 : dt_nascimento.hashCode());
		
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		
		result = prime * result + ((mae == null) ? 0 : mae.hashCode());
		
		result = prime * result + ((pai == null) ? 0 : pai.hashCode());
		

	
		
		
	
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
		PessoaServidor other = (PessoaServidor) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		
		if (dt_nascimento == null) {
			if (other.dt_nascimento != null)
				return false;
		} else if (!dt_nascimento.equals(other.dt_nascimento))
			return false;
		

		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		
		
		if (mae == null) {
			if (other.mae != null)
				return false;
		} else if (!mae.equals(other.mae))
			return false;
		if (pai == null) {
			if (other.pai != null)
				return false;
		} else if (!pai.equals(other.pai))
			return false;

	
		
		
	
		
		return true;
	}
	
}
