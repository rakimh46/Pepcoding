#include<iostream>
#include<vector>
using namespace std;
void print(vector<int>& arr, int i){
     if(i==arr.size()){
            return;
        }
        
        print(arr,i+1);
        cout<<arr[n]<<endl;        
}
int main(){   
    vector<int> arr{2,7,8,9};
    print(arr,0);
    return 0;
}