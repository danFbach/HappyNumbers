package happyNum;
import java.util.*;


public class MathEngine 
{
	
	List<Integer> numbers = new ArrayList<>(); 		//new list named numbers
	
	//general variables
	Integer total = 1;
	Integer number1 = 1;
	Integer number2;
	Integer number3 = 0;
	Integer stop = 1;
	
	//digit variables
	Integer onesDigit;
	Integer tensDigit;
	Integer hundredsDigit;
	Integer thousandsDigit;
	Integer tenThousandsDigit;
	
	//square digit variables
	Integer onesSquare;
	Integer tensSquare;
	Integer hundredsSquare;
	Integer thousandsSquare;
	Integer tenThousandsSquare;
	
	public void math1(Integer number1) 				//number1 is brought in as a parameter, telling the function what number to work on.
	{
		number2 = number1;
		while(true)
		{
			number3 = number2;
			if(numbers.contains(1)) 				//checking for happy numbers
			{
				System.out.println(number1 + " is an ecstatic number.");
				numbers.clear(); 					//clear list after number has been iterated through
				break;
			}
			else if (numbers.contains(number3)) 	//checking for number loops
			{
				numbers.clear();					//clear list after number has been iterated through
				break;
			}
			else
			{
				numbers.add(number3);				//adds numbers to list with a 1-cycle delay				
													//separates numbers into individual digits
				tenThousandsDigit = (number2 % 100000-number2%10000)/10000;
				thousandsDigit = (number2 % 10000 - number2 % 1000)/1000;
				hundredsDigit = (number2 % 1000 - number2 % 100)/100;
				tensDigit= (number2 % 100 - number2 % 10)/10;
				onesDigit = number2 % 10 - number2 % 1;				
													//takes each digit squares them
				onesSquare = (onesDigit*onesDigit);
				tensSquare = (tensDigit * tensDigit);
				hundredsSquare = (hundredsDigit * hundredsDigit);
				thousandsSquare = (thousandsDigit * thousandsDigit);
				tenThousandsSquare = (tenThousandsDigit * tenThousandsDigit);
													//turns all of the squared digits back into a real number
				total = onesSquare + tensSquare + hundredsSquare + thousandsSquare + tenThousandsSquare;
				number2 = total;
			}		
		}
	}
}