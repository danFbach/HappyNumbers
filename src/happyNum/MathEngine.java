package happyNum;

import java.util.*;


public class MathEngine {
	
	List<Integer> numbers = new ArrayList<>();
	
	Integer total = 1;
	Integer number1 = 1;
	Integer number2;
	Integer number3 = 0;
	Integer one = 1;
	Integer stop = 1;
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
	
	
	
	public void math1(Integer number1)
	{numbers.clear();
		number2 = number1;
		while(stop == 1){
			number3 = number2;
		if(numbers.contains(1)){
			System.out.println(number1 + " is a happy number.");
			number1 += 1;
			numbers.clear();
			break;}
		else if (numbers.contains(number3)){
//			System.out.println(number1);
			number1 += 1;
			numbers.clear();
			break;
		}
		else{
			numbers.add(number3);
		thousandsDigit = (number2 % 10000 - number2 % 1000)/1000;
		hundredsDigit = (number2 % 1000 - number2 % 100)/100;
		tensDigit= (number2 % 100 - number2 % 10)/10;
		onesDigit = number2 % 10 - number2 % 1;
				
		onesSquare = (onesDigit*onesDigit);
		tensSquare = (tensDigit * tensDigit);
		hundredsSquare = (hundredsDigit * hundredsDigit);
		thousandsSquare = (thousandsDigit * thousandsDigit);
		
		total = onesSquare + tensSquare + hundredsSquare + thousandsSquare;;
		number2 = total;
		}		
//		System.out.println(total);
//		System.out.println(numbers);
		}
	}
}
		
		
		
//	public int math2(){
//		tenThousandsDigit = (number2 % 100000 - number2 % 10000)/10000;
//		thousandsDigit = (number2 % 10000 - number2 % 1000)/1000;
//		hundredsDigit = (number2 % 1000 - number2 % 100)/100;
//		tensDigit= (number2 % 100 - number2 % 10)/10;
//		onesDigit = number2 % 10 - number2 % 1;
//				
//		onesSquare = (onesDigit*onesDigit);
//		tensSquare = (tensDigit * tensDigit);
//		hundredsSquare = (hundredsDigit * hundredsDigit);
//		thousandsSquare = (thousandsDigit * thousandsDigit);	
//		tenThousandsSquare = (tenThousandsDigit * tenThousandsDigit);		
//		total = onesSquare + tensSquare + hundredsSquare + thousandsSquare + tenThousandsSquare;
//		numbers.add(total);
//		if(numbers.contains(one))
//		{
//		System.out.println(number1 + " is a Happy Number.");
//		numbers.clear();
//		number1 += 1;
//		System.out.println(numbers);
//		return number1;
//		}
//		else if(numbers.contains(total))
//		{
//		System.out.println(numbers);	
//		System.out.println(number1 + " is a Sad Number.");
//		numbers.clear();
//		number1 += 1;
//		return number1;
//		}
//		else{
//		number1 += 1;
//		number2 = total;
//		System.out.println(number1);
//		System.out.println(numbers);
//		return number1;}
//	}
//	}
//		
//		
