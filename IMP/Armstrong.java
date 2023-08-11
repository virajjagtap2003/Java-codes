// check number is armstrong or not

class Armstrong{
        public static void main(String[] args){
                int no=153;
                int temp=no;
                int ans=no;
                int count=0;
                while(no!=0){
                        count++;
                        no=no/10;
                }
                int sum=0;
                while(temp!=0){
                        int rem=temp%10;
                        int mul=1;

                        for(int i=0;i<count;i++){
                                mul=mul*rem;
                        }
                        sum=sum+mul;
                        mul=1;

                        temp=temp/10;
                }
                if(ans==sum){
                        System.out.println("Arms");
                }else{
                        System.out.println("not");
                }
        }
}
