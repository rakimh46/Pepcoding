#include<iostream>

using namespace std;
int main(){
    int n;
  cout<<"input= ";  
  cin>>n;
  int count=1;
for(int cr=1; cr<=n; cr++){
     for(int cs=1;cs<=cr;cs++){
        cout<<count<<" ";
        count++;
     }
     cout<<endl;
}

}