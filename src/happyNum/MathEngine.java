package happyNum;

public class MathEngine {
	
	Integer total;
	Integer number;
	Integer hundredsDigit;
	Integer tensDigit;
	Integer onesDigit;
	Integer thousandsDigit;
	Integer onesSquare;
	Integer tensSquare;
	Integer hundredsSquare;
	Integer thousandsSquare;
	
	
	
	public int newNum(){
		for(number = 0; number<1000; number++){
		
			
			thousandsDigit = (number % 10000 - number % 1000)/1000;
			hundredsDigit = (number % 1000 - number % 100)/100;
			tensDigit= (number % 100 - number % 10)/10;
			onesDigit = number % 10 - number % 1;
					
			onesSquare = (onesDigit*onesDigit);
			tensSquare = (tensDigit * tensDigit);
			hundredsSquare = (hundredsDigit * hundredsDigit);
			thousandsSquare = (thousandsDigit * thousandsDigit);
			
			total = onesSquare + tensSquare + hundredsSquare + thousandsSquare;
			System.out.println(total);
			}
		return total;}
}
		
		
		