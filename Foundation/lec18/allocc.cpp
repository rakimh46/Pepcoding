#include<iostream>
#include<vector>
using namespace std;
vector<int> alloc(vector<int>& arr,int i,int data,int count){
if(i==arr.size()){
    vector<int> baseans(count,0);
    return baseans;
}
    if(arr[i]==data){
         count++;
    }
    vector<int> recans=alloc(arr,i+1,data,count);
    if(arr[i]==data){
        recans[count-1]=i;
    }
    return recans;
}
int main(){
    vector<int> arr({5,7,5,8,5,9,10});
    vector<int> m=alloc(arr,0,5,0);
    for(int i=0;i<m.size();i++){
        cout<<m[i]<<" ";
    }
    return 0;
}