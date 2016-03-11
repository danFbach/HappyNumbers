package happyNum;

public class EvaluateNumber 
{	
	public void answer()
	{
		MathEngine run = new MathEngine(); 		//brings the MathEngine function, math1, into this class.
		Integer number1 = 1;
		while(number1 < 10001) 					//allows the functions to run to 10,000
		{			
			run.math1(number1); 				//calls math1 with the argument number1
			number1 += 1;						//adds one to number1 to increase the integer of the working number
		}
	}		
}

