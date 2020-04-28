#include<iostream>
using namespace std;
int fact(int x){                                   //int function use for return value
   int ans=1;
   for(int i=1; i<=x; i++){
       ans=ans*1;
   }             
   return ans;                                  //and void function use for only display
}

void main(){
    int n=5,r=2;
    int nfact=fact(n);
    int rfact=fact(r);
    int nmrfact=fact(n-r);
    cout<<(nfact/(nmrfact*rfact))<<endl;

}
