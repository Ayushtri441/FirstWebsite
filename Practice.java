import java.util.*;
class Practice{
    static boolean x =false;
    static boolean x(){
        return true || false || false;
    }
    static boolean test(int a,int b){
        if(a>10){
            
            return true;
        }
        if(b<0){
            x=true;
            return false;
        }
        System.out.println(x+" "+a+" "+b);
        return test(a+1,b-1) || test(a-1,b-1) ;
    }
    static void fun(int[] arr,int n,int leap){
        System.out.println(n);
        if(n>arr.length-1){
            x=true;
            System.out.println(n+""+ x);
            return;
        }
        if(n<0 || arr[n]==1){
            System.out.println("No");
            x=false;
            return;
        }
       // arr[n]=1;
       
        fun(arr,n+leap,leap);
        fun(arr,n+1,leap);
        fun(arr,n-1,leap);
        if (x==true) return;
    }
    public static void main(String[] args){
        int[] arr ={0,0,0,0,0};
        int leap = 3;
        //for(int i=0;i<arr.length;i++){

        //}
       fun(arr,0,leap);    
   //   System.out.println(x());
        //System.out.println(test(1,2));

    }
}