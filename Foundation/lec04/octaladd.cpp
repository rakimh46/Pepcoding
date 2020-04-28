#include<iostream>
using namespace std;
int octaladd(int n1, int n2)
        {
          int ans=0;
          int pow=1;
          int carry=0;
          while(n1!=0 || n2!=0 || carry!=0){
            int r1=n1%10; n1/=10;
            int r2=n2%10; n2/=10;
            int rem=r1+r2+carry;
            carry=rem/8;
            ans=pow*rem+ans;
            pow=pow*10;
            
          }
          return ans;
                   }
int main(){
    
      int f=octaladd(357,555);
      
    cout<<f;
    
    
    }
