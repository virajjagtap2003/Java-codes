import java.util.*;
class Prime{
        public static void main(String[] args){
                int n=10;
                int count=0;
		ArrayList<Integer> list =new ArrayList<>();
                for(int no=1;no<=n;no++){
                        for(int i=1;i<=no;i++){
                                if(no%i==0){
                                        count++;
                                }
                        }
                        if(count==2){
                               list.add(no);
                        }

                        count=0;
                }
		for(int i=0;i<list.size()-1;i++){
			System.out.print(list.get(i)+",");
		}
		System.out.print(list.get(list.size()-1));


        }
}
