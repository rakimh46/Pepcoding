import java.util.*;
class kadane{
public static void kadane(int[] arr) {
    //cs=current start
    //os=overall start
    //ce=current end
    //oe=overall end
    //cmax=current maximum
    //omax=overall maximum
    int cs=0,os=0,ce=0,oe=0,cmax=0,omax=0;
    while(ce<arr.length){
       if(cmax>0){
           cmax +=arr[ce];
       }else{
           cs=ce;
           cmax=arr[ce];
       }
       if(omax<cmax){
           omax=cmax;
           os=cs; oe=ce;
       } 
    ce++;
    } 
    for(int i=os;i<=os;i++){
        System.out.print(arr[i]+" ");
    } 
    System.out.print("sum="+omax);
}
public static void main(String[] args) {
    int[] arr={3,5,-1,-7,8,4,2,-6,10};
    kadane(arr);
} 
}