#include<iostream>
using namespace std;

int octalsub(int n1,int n2){
       
    int ans=0;
           int pow=1;  
    while(n1!=0, n2!=0)
       {
           
           int rem1=n1%10; n1/=10;
           int rem2=n2%10; n2/=10;
           int rem=(rem1+8)-rem2;
           ans=ans+rem*pow;
           pow=10*pow;  
       }
      return ans;
}
int main(){
    
      int f=octalsub(666,555);
      
    cout<<f;
    
    
    }


