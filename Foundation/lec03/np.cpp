#include<iostream>

using namespace std;
int main(){
    int n;
  cout<<"input= ";  
  cin>>n;
   int st=n, sp=0;
   for(int cr=1; cr<=n; cr++)
   {
      for(int cp=1;cp<=sp;cp++)
      {
        cout<<" ";

      }
      for(int cs=1;cs<=st;cs++)
      {
        cout<<"*";

      }
      sp++;
      st--;
      cout<<"\n";
   }
 }