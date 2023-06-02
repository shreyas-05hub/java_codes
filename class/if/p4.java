//Given the temperature of a person in fareneit
//print whether the person has high,normal,low temp
//>98.6  ==>high
//98.0<= and <=98.6   ==> normal
//<98.0  ==>low

class Temp{
	public static void main(String[] args){
	
		double x =98.1;

		if(x>98.6){
			System.out.println("High");
		}else if(98.0<=x && x<=98.6){
			System.out.println("Normal");
		}else{
			System.out.println("Low");
		}
	}
}
