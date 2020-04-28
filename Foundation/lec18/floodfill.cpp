#include<iostream>
#include<vector>
using namespace std;
vector<string> floodfill(vector<vector<int>>& arr,int i, int j){
     if(i==arr.size()-1 && j==arr[0].size()-1){
         vector<string> base;
         base.push_back("");
        return base;
     }
     vector<string> myAns;
     arr[i][j]=1;
    //up
    if(i-1>=0 && arr[i-1][j]!=1){
        vector<string> recans=floodfill(arr,i-1,j);
        for(int k=0;k<recans.size();k++){
            myAns.push_back("u"+recans[k]);
        }
    }
    //left
    if(j-1>=0 && arr[i][j-1]!=1){
        vector<string> recans=floodfill(arr,i,j-1);
        for(int k=0;k<recans.size();k++){
            myAns.push_back("l"+recans[k]);
        }
    }
    //down
    if(i+1<arr.size() && arr[i+1][j]!=1){
        vector<string> recans=floodfill(arr,i+1,j);
        for(int k=0;k<recans.size();k++){
            myAns.push_back("d"+recans[k]);
        }
    }
    //right
    if(j+1<arr[0].size() && arr[i][j+1]!=1){
        vector<string> recans=floodfill(arr,i,j+1);
        for(int k=0;k<recans.size();k++){
            myAns.push_back("r"+recans[k]);
        }
    }
    arr[i][j]=0;
    return myAns;
}
int main(){
    vector<vector<int>> arr {{0,0,0,0,0,0},
                              {0,1,0,1,0,0},
                              {0,0,0,0,0,0},
                              {0,0,1,0,1,0},
                              {1,0,0,0,0,0},
                              {0,0,0,0,0,0}};                          
    vector<string> ans=floodfill(arr,0,0);
    
    for(int i=0;i<ans.size();i++){
       cout<<ans[i]<<endl;
   }
   cout<<ans.size();
return 0;
}