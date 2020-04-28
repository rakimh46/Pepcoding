#include<iostream>
#include<vector>
using namespace std;

int lastocc(vector<int>& arr,int i,int data,int loc){
    if(i==arr.size()){
        return loc;
    }
       if(arr[i]==data){
          loc=i;               
       }     
       int recans=lastocc(arr,i+1,data,loc);  
       return recans; 
}

int main(){
    vector<int> arr{2,7,5,8,5,9,10};
    cout<<lastocc(arr,0,5,-1);
    return 0;
}