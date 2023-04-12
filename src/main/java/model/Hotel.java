package model;

public class Hotel {
		private int id;
		private String nome;
		private String descricao;
		private String estrelas;
		
		
		
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getEstrelas() {
			return estrelas;
		}
		public Hotel(int id, String nome, String descricao, String estrelas) {
			super();
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.estrelas = estrelas;
		}
		public void setEstrelas(String estrelas) {
			this.estrelas = estrelas;
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getdescricao() {
			return descricao;
		}
		public void setdescricao(String descricao) {
			this.descricao = descricao;
		}
}
