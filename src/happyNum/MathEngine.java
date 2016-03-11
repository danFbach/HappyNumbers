package happyNum;

import java.util.*;


public class MathEngine {
	
	List<Integer> numbers = new ArrayList<>();
	
	Integer total;
	Integer number1 = 1;
	Integer number2 = 1;
	Integer one = 1;
	Integer stop = 0;
	Integer hundredsDigit;
	Integer tensDigit;
	Integer onesDigit;
	Integer thousandsDigit;
	Integer tenThousandsDigit;
	Integer onesSquare;
	Integer tensSquare;
	Integer hundredsSquare;
	Integer thousandsSquare;
	Integer tenThousandsSquare;
	
	
	public int newNum(){
		for(number1 = 1; number1<200; number1++);
				return number2;
	}
//	public int math(){
//		thousandsDigit = (number2 % 10000 - number2 % 1000)/1000;
//		hundredsDigit = (number2 % 1000 - number2 % 100)/100;
//		tensDigit= (number2 % 100 - number2 % 10)/10;
//		onesDigit = number2 % 10 - number2 % 1;
//				
//		onesSquare = (onesDigit*onesDigit);
//		tensSquare = (tensDigit * tensDigit);
//		hundredsSquare = (hundredsDigit * hundredsDigit);
//		thousandsSquare = (thousandsDigit * thousandsDigit);
//		
//		total = onesSquare + tensSquare + hundredsSquare + thousandsSquare;
//		System.out.println(total);
//		numbers.add(total);
//		number2 = total;
//		numbers.contains(total);
//		
//		return number2;
//		}
	public int math2(){
		tenThousandsDigit = (number1 % 100000 - number1 % 10000)/10000;
		thousandsDigit = (number1 % 10000 - number1 % 1000)/1000;
		hundredsDigit = (number1 % 1000 - number1 % 100)/100;
		tensDigit= (number1 % 100 - number1 % 10)/10;
		onesDigit = number1 % 10 - number1 % 1;
				
		onesSquare = (onesDigit*onesDigit);
		tensSquare = (tensDigit * tensDigit);
		hundredsSquare = (hundredsDigit * hundredsDigit);
		thousandsSquare = (thousandsDigit * thousandsDigit);	
		tenThousandsSquare = (tenThousandsDigit * tenThousandsDigit);		
		total = onesSquare + tensSquare + hundredsSquare + thousandsSquare + tenThousandsSquare;
		numbers.add(total);
		if(numbers.contains(one))
		{
		System.out.println(number1 + " is a Happy Number.");
		numbers.clear();
		number1 += 1;
		return number1;
		}
//		else if(numbers.contains(total))
//		{
//		System.out.println(numbers);	
//		System.out.println(number1 + " is a Sad Number.");
//		numbers.clear();
//		number1 += 1;
//		return number1;
//		}
		else{
		number1 += 1;
		number2 = total;
		return number1;}
	}
	}
		
		
		