#include<iostream>

using namespace std;
int main(){
    int i,j,n;
 
    cout<<"Input= ";
    cin>>n;
    for(i=n;i>=1;i--)
    {
        for(j=i;j<n;j++)
        {
            cout<<" ";
        }
 
        for(j=1; j<=(2*i-1); j++)
        {
            if(j==1 || j==(2*i-1))
            {
                cout<<"*";
            }
            else
            {
                cout<<" ";
            }
        }
 
        cout<<"\n";
    }
    
    for(i=2;i<=n;i++)
    {
        for(j=i;j<n;j++)
        {
            cout<<" ";
        }
 
        for(j=1; j<=(2*i-1); j++)
        {
            if(j==1 || j==(2*i-1))
            {
                cout<<"*";
            }
            else
            {
                cout<<" ";
            }
        }
 
        cout<<"\n";
    }
    
    }