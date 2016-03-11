package happyNum;

public class EvaluateNumber {
	Integer stop = 0;
	
	public void answer(){
	MathEngine run = new MathEngine();
	HappySadCheck runCheck = new HappySadCheck();
	Integer number1 = 1;

	while(number1 < 53){
		
			run.math1(number1);

			number1 += 1;
	}
	}		
}

