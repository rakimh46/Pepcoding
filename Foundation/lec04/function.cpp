#include<iostream>
using namespace std;
int fact(int x){                                   //int function use for return value
   int ans=1;
   for(int i=1; i<=x; i++){
       ans=ans*i;
   }             
   return ans;                                  //and void function use for only display
}

int main(){

int n=fact(5);

cout<<n;

}

