import java.io.*;
public class AbstractFactoryPatternExample {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Choose the any one bank where you want to take loan:\n1 SBI\n2 HDFC\n3 ICICI\n");
		String bankName = null;
		switch(br.readLine())
		{
			case "1" :
				bankName = "SBI";
				break;
			case "2" :
				bankName = "HDFC";
				break;
			case "3" :
				bankName = "ICICI";
				break;
			default:
				System.out.println("wrong input");
				System.exit(0);
		}
		
		System.out.println("Select the type of loan:\n1 Home loan\n2 Business Loan\n3 Education Loan\n");
		String loanName = null;
		switch(br.readLine())
		{
			case "1" :
				loanName = "home";
				break;
			case "2" :
				loanName = "business";
				break;
			case "3" :
				loanName = "education";
				break;
			default:
				System.out.println("wrong input");
				System.exit(0);
		}
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);
		
		System.out.println("\nEnter the rate of Interest for "+b.getBankName()+" :");
		double rate = Double.parseDouble(br.readLine());
		
		System.out.println("\nEnter the loan amount you want to take");
		double loanAmount = Double.parseDouble(br.readLine());
		
		System.out.println("\nEnter the number of year, you want to pay loan");
		int years = Integer.parseInt(br.readLine());
		
		System.out.println("Yor are taking loan from "+b.getBankName());
		AbstractFactory LoanFactory = FactoryCreator.getFactory("Loan");
		Loan  l = LoanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);
	}
}
