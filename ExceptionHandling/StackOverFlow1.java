import java.util.*;
import java.io.*;
class StackOverFlow1{

	 static void fun(int no){
		 System.out.println(no);
		 fun(++no);         // recursive call
	 	
	 }
 	public static void main(String[] args){
		try{
			fun(1);	                       
		}catch(StackOverflowError obj){

			System.out.println("StackOverFlow");
		}
	}
 }
