package pms.hola

@Data class Saludador {
	
	
	String saludo
	
	def void setSaludo(String saludo) {
		this.saludo = saludo
	}
	
	def saludar() {
		println(saludo)
	}
	
}