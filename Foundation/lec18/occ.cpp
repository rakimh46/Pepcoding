#include<iostream>
#include<vector>
using namespace std;
int occ(vector<int>& arr, int n,int r){
    if(n==arr.size()){
         return 0; 
     }
        occ(arr,n+1,r);
        if(arr[n]==r){
        return n;         
        }     
        return -1;       
}
int main(){   
    vector<int> arr{2,7,8,9};
    cout<<occ(arr,0,5);
    return 0;
}