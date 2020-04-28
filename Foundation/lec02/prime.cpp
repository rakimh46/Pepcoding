#include<iostream>

using namespace std;
int main(){
    int i=0;
    cout<<"enter a number= ";
    cin>>i;
    bool isprime=true;
 for(int n=2; n<i; n++){
     if(i%n==0){
     isprime=false;
     break;
     }
 }
 if(isprime==true){
     cout<<"prime";
     
 }
 else{
cout<<"not prime";

 }
return 0;
}