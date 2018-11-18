package corejava;



public class Armstrong1 {
public static void main(String[] args) {
	int number;
	for(number=100;number<=999;number++){
	int temp=number;

	int remainder,sum=0;
	while(temp > 0){
	   remainder = temp%10;
	   temp = temp/10;
	   sum = sum +( remainder*remainder*remainder );
	 
	   
	}  if(number == sum){
		System.out.println("armstrong number=" +sum);
	}
}
}
}
