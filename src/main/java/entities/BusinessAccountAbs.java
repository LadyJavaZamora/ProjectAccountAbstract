package entities;

public class BusinessAccountAbs extends AccountAbstrata {
	//Sobrescreve métodos da classe abstrata AccountAbstrata que não pode ser instanciada
	//Atributos
	  private Double loanLimit;
	  
	//Construtores
	  public BusinessAccountAbs() {
		 super(); //Executa o construtor padrao da superclasse, caso tenha alguma logica implementada 
	  }

	public BusinessAccountAbs (Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
    
	//Getters and Setters
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	  	 	
	//Outros métodos
	public void loan(Double amount) {
		//Regra de negocio: ao conceder emprestimo, cobra 10.0
		if (amount <= loanLimit) {
		   balance = amount - 10.0;
		}
	}
	
	//Sobreposição do método withdraw para  cobrar 2.0 a mais na taxa da retirada da poupança
	@Override
	 public void withdraw (double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	 }

}
