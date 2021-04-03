package newthinkersTrilhaBasica;

public class Cozinha {
	  private int numeroPratos;
	  private String tipo;
	  private int numeroCozinheiros;
	  private int tempoPreparo;
	  private int horaDeAbertura;
	  private int horaDeFechamento;
	  private String pratoPrincipal;
	   Ingrediente ingrediente[];
	   Funcionario funcionarios[];
	  
	  void statusCozinha() { // testado ....
			System.out.println("Hora de abretura " + getHoraDeAbertura()+ " Horas");
			System.out.println("Hora de fechamento " + getHoraDeFechamento()+ " Horas");
			System.out.println("Prato principal " + getPratoPrincipal());
		  

		
   }
	  void prepararPratos(){
		    //O que eu preciso fazer para preparar um prato?
		  }

		  void lavarLouca(){

		  }
		  
		  //Getter e Setter
		     // *****numeros pratos*****
		  public int getNumeroPratos() {
			  return this.numeroPratos;
		  }
		  public void setNumeroPratos(int np) {
		   this.numeroPratos = np;
		  }
		  //*******tipo******
		  public String getTipo() {
			  return this.tipo;
		  }
		  public void setTipo(String t) {
			  this.tipo = t;
		  }
		  //*******numeroCozinha*****
		  public int getNumeroCozinheiros() {
			  return this.numeroCozinheiros;
		  }
		  public void setNumeroCozinheiros(int nc) {
			  this.numeroCozinheiros = nc;
		  }
		  //*********tempoPreparo*******
		  public int getTempoPreparo() {
			  return this.tempoPreparo;
		  }
		  public void setTempoPreparo(int tp) {
			  this.tempoPreparo = tp;
		  }
		  //********horaDeAbertura******
		  public int getHoraDeAbertura() {
			  return this.horaDeAbertura;
		  }
		  public void setHoraDeAbertura(int ha) {
			  this.horaDeAbertura = ha;
		  }
		  //********horaDeFechamento********
		  public int getHoraDeFechamento() {
			  return this.horaDeFechamento;
		  }
		  public void setHoradeFechamento(int hf) {
			  this.horaDeFechamento = hf;
		  }
		  //***********pratoPrincipal*****
		  public String getPratoPrincipal() {
			  return this.pratoPrincipal;
		  }
		  public void setPratoPricipal(String pp) {
			  this.pratoPrincipal = pp;
		  }
		  
		  
		  
		  
		  
}
