#include <iostream>
#include <vector>
using namespace std;
vector<string> floodfill(vector<vector<int>>& arr, int i, int j){
if(i==arr.size()-1 && j==arr[0].size()-1){
    vector<string> base;
    base.push_back("");
    return base;
}
arr[i][j]=1;
    vector<string> myans;
    if(i-1>0 && arr[i-1][j]==0){
        vector<string> recans = floodfill(arr,i-1,j);
        for(i=0; i<recans.size(); i++){
            myans.push_back("u"+recans[i]);
        }
}
if(j-1>0 && arr[i][j-1]==0){
        vector<string> recans = floodfill(arr,i,j-1);
        for(i=0; i<recans.size(); i++){
            myans.push_back("l"+recans[i]);
        }
}
if(i+1<arr.size() && arr[i+1][j]==0){
        vector<string> recans = floodfill(arr,i+1,j);
        for(i=0; i<recans.size(); i++){
            myans.push_back("d"+recans[i]);
        }
}
if(j+1<arr[0].size() && arr[i][j+1]==0){
        vector<string> recans = floodfill(arr,i,j+1);
        for(i=0; i<recans.size(); i++){
            myans.push_back("r"+recans[i]);
        }
} arr[i][j]=0;
return myans;
}
int main(){
    vector<vector<int>> arr={{0,0,0,0,0,0},
                     {0,1,0,1,0,0},
                     {0,0,0,0,0,0},
                     {0,0,1,0,1,0},
                     {1,0,0,0,0,0},
                     {0,0,0,0,0,0}};

vector<string> ans= floodfill(arr,0,0);
    for(int i=0; i<ans.size(); i++){
        cout<<ans[i]<<endl;
        
    }
    cout<<ans.size();
}