#include<iostream>
using namespace std;
int anyBaseToDecial(int n,int sb){
    int ans=0;
    int pow=1;
    while(n!=0){
        int rem=n%10;
        n/=10;
        ans=ans+rem*pow;
        pow=pow*sb;
    }
    return ans;
}

 int deciToAnyBase(int n,int db){
        int ans=0;
        int pow=1;
        while(n!=0){
            int rem=n%db;
            n=n/db;
            ans=rem*pow+ans;
            pow=pow*10;
        }
        return ans;
    }

int anyBaseToAnyBase(int n,int sb,int db){
    int a=anyBaseToDecial(n,sb);
    int finalans=deciToAnyBase(a,db);
    return finalans;
}

int main(){
    
    int f=anyBaseToAnyBase(10101,2,8);

    cout<<f;

return 0;
}
