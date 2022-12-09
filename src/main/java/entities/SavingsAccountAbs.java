package entities;

public class SavingsAccountAbs extends AccountAbstrata{
	//Sobrescreve métodos da classe abstrata AccountAbstrata que não pode ser instanciada
	//Atributos
	private Double interestRate;
	
	//Construtores
	public SavingsAccountAbs() {
		super();
	}

	public SavingsAccountAbs(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
    
	//Getters and Setters
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	//Outros métodos
	public void updateBalance() {
		balance += balance * interestRate;
	}

	//Sobreposição do método withdraw para não cobrar taxa da retirada da poupança
	@Override
	public void withdraw (double amount) {
		balance -= amount;
	}	
	
}

