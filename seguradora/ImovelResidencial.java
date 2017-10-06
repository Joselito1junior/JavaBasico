package br.unipe.java.seguradora;

	public class ImovelResidencial extends ImovelBasico
	{
		
		private String zona; //u - urbana / s - suburbana / r - rural
		private String tipo; //c - casa / a - apartamento		
		private PessoaFisica cliente = new PessoaFisica();//
		private SeguroResidencial seguro = new SeguroResidencial();
	
		public SeguroResidencial getSeguro() {
			return seguro;
		}
		public void setSeguro(SeguroResidencial seguro) {
			this.seguro = seguro;
		}
		
		public String getZona() {
			return zona;
		}
		public void setZona(String zona) {
			this.zona = zona;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public PessoaFisica getCliente() {
			return cliente;
		}
		public void setCliente(PessoaFisica cliente) {
			
			this.cliente = cliente;
		}
}