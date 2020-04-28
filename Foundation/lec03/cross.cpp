#include<iostream>

using namespace std;
int main(){
    int n;
  cout<<"input= ";  
  cin>>n;

   
  for(int cr=1; cr<=n; cr++){
     for(int csp=1;csp<=n;csp++){
        if(cr==csp || csp==(n-cr+1)){
        
        cout<<" *";
     }
     else{
         cout<<" ";
     }
     }
   
   


     cout<<endl;
  }
    
}

  
