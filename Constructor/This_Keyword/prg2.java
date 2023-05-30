class Demo{
	Demo(){  // Demo(Demo this)
		System.out.println("In no argument constructor");
	}

	Demo(int x){   
		System.out.println("In paramterised Constructor");
	}

	Demo(Demo xyz){
		System.out.println("In Parameter Demo");
	}
	
	public static void main(String[] args){
		Demo obj1=new Demo();
		
		Demo obj2=new Demo(10);

		Demo obj3=new Demo(obj1);

		
	}
}

