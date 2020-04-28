#include<iostream>

using namespace std;
int main(){
    int n;
  cout<<"input= ";  
  cin>>n;
   int st=1, sp=n/2;
  
  
   for(int cr=1; cr<=n; cr++)
   {
      for(int csp=1;csp<=sp;csp++)
      {
        cout<<" ";

      }
      for(int cs=1;cs<=st;cs++)
      {
        cout<<"*";

      }
      if(cr<=n/2){
      sp--;
      st+=2;}
      else{
          sp++;
          st -=2;
      }
      cout<<endl;
   

  }
  
   
}
 