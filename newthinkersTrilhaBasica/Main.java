package newthinkersTrilhaBasica;

public class Main {

	public static void main(String[] args) {
	    Cozinha cozMin = new Cozinha();
	    Cozinha cozChi = new Cozinha();
	    Cozinha cozIta = new Cozinha();
	    //*******Ingrediente e funcionario da cozinha Mineira******
	    Ingrediente ind1  = new Ingrediente("feijão", "18/09/2021");
	    Ingrediente ind2  = new Ingrediente("farinha", "19/09/2021");
	    Ingrediente ind3  = new Ingrediente("Arroz", "11/09/2021");
	    Ingrediente ind4  = new Ingrediente("carne de porco", "11/09/2021");
	    Ingrediente ind5  = new Ingrediente("linguiça", "11/09/2021");
	      Funcionario fun01 = new Funcionario("Fun01-min", "Chefe");
	      Funcionario fun02 = new Funcionario("Fun02-min", "Sous chef");
	      Funcionario fun03 = new Funcionario("Fun03-min", "Aboyeur.");
	      Funcionario fun04 = new Funcionario("Fun04-min", "Boulanger");
	      //************Ingrediente e funcionario da cozinha chineza*******
	        Ingrediente ingrechi01 = new Ingrediente("Champignon", "19/08/2021");
	        Ingrediente ingrechi02 = new Ingrediente("Brócolis", "19/08/2021");
            Ingrediente ingrechi03 = new Ingrediente("Macarrão", "29/08/2021");
	        Ingrediente ingrechi04 = new Ingrediente("carne", "18/08/2021");
		      Funcionario fun01chi = new Funcionario("Fun01-chi", "Chefe");
		      Funcionario fun02chi = new Funcionario("Fun01-chi", "sous chef");
		      Funcionario fun03chi = new Funcionario("Fun01-chi", "Aboyer");
		           //******ingrediente e funcionario da cozinha Italiana
		        Ingrediente ingreita01 = new Ingrediente("Molho", "19/08/2021");
		        Ingrediente ingreita02 = new Ingrediente("macarrão", "01/08/2021");
	            Ingrediente ingreita03 = new Ingrediente("carne", "05/08/2021");
			      Funcionario fun01ita = new Funcionario("Fun01-ita", "Chefe");
			      Funcionario fun02ita = new Funcionario("Fun01-ita", "sous chef");


	    
	    cozMin.setHoraDeAbertura(14);
	    cozMin.setHoradeFechamento(20);
	    cozMin.setPratoPricipal("Feijoada");
	         cozMin.ingrediente = new Ingrediente[5];
             cozMin.ingrediente[0] = ind1;
             cozMin.ingrediente[1] = ind2;
             cozMin.ingrediente[2] = ind3;
             cozMin.ingrediente[3] = ind4;
             cozMin.ingrediente[4] = ind5;
             cozMin.funcionarios = new Funcionario[4];
             cozMin.funcionarios[0] = fun01;
             cozMin.funcionarios[1] = fun02;
             cozMin.funcionarios[2] = fun03;
             cozMin.funcionarios[3] = fun04;
                
             
             cozChi.setHoraDeAbertura(10);
             cozChi.setHoradeFechamento(21);
             cozChi.setPratoPricipal("Yakissoba");
             cozChi.ingrediente = new Ingrediente[4];
                cozChi.ingrediente[0] = ingrechi01;
                cozChi.ingrediente[1] = ingrechi02;
                cozChi.ingrediente[2] = ingrechi03;
                cozChi.ingrediente[3] = ingrechi04;
                cozChi.funcionarios = new Funcionario[3];
                cozChi.funcionarios[0] = fun01chi;
                cozChi.funcionarios[1] = fun02chi;
                cozChi.funcionarios[2] = fun03chi;
                
               
            cozIta.setHoraDeAbertura(13);
            cozIta.setHoradeFechamento(22);
            cozIta.setPratoPricipal("Yakissoba");
            cozIta.ingrediente = new Ingrediente[3];
                 cozIta.ingrediente[0] = ingreita01;
                 cozIta.ingrediente[1] = ingreita02;
                 cozIta.ingrediente[2] = ingreita03;
                 cozIta.funcionarios = new Funcionario[2];
                 cozIta.funcionarios[0] = fun01ita;
                 cozIta.funcionarios[1] = fun02ita;

            cozMin.statusCozinha();
   			System.out.println("----------");
            cozIta.statusCozinha();
   			System.out.println("----------- ");
            cozChi.statusCozinha();


             



	}

}
