class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		if (bank == null){
			return null;
		}
		if (bank.equalsIgnoreCase("SBI")){
			return new SBI();
		}
		else if (bank.equalsIgnoreCase("HDFC")){
			return new HDFC();
		}
		else if (bank.equalsIgnoreCase("ICICI")){
			return new ICICI();
		}
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}

}
