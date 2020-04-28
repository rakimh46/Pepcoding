#include<iostream>
#include<vector>
using namespace std;
void input(vector<int>& arr){
      for(int i=0;i<arr.size();i++){
           cin>>arr[i];
      }
} 
void display(vector<int>& arr){
    cout<<"arr= { ";
         for(int i=0;i<arr.size();i++){
           cout<<arr[i]<<" ";
         }
         cout<<"}";
         cout<<endl;
}
int main(){
   int size;
   cout<<"size=";
   cin>>size;
   vector<int> arr(size,0);
   input(arr);
   display(arr); 
   return 0;
}