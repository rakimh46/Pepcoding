#include<iostream>

using namespace std;
int main(){

    int a,b,c;
    cout<<"enter 1st no.=";
    cin>>a;
    cout<<"enter 2nd no.=";
    cin>>b;
    cout<<"enter 3rd no.=";
    cin>>c;
    if(a>b && a>c){
        cout<<a<<" is larger";
        }
     else if(b>a && b>c)
    { cout<<b<<" is larger";
    }
    else
    { cout<<c<<"is larger";   
    }
    

   return 0;

}