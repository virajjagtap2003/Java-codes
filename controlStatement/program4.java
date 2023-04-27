//given the temp of a person in farahenhit
//print wether the person has high normal or low temp
//>98.6  high
//98.0<= and <=98.6   normal
//<98.0    low

class Temp{
	public static void main(String[] args){
		float temp=98.2f;

		if(temp>98.6f)
			System.out.println("High Temp");
		else if(temp<98.0f)

			System.out.println("Low Temp");
		else
			System.out.println("Normal Temp");

				
	}
}
