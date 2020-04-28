#include<iostream>
#include<vector>
using namespace std;
vector<string> subseq(string ques){
    if(ques.size()==0){
        vector<string> base;
        base.push_back("");
        return base;
    }
    char ch=ques[0];
    string roq=ques.substr(1);
    vector<string> recAns= subseq(roq);
    vector<string> myAns;
        for(int i=0;i<recAns.size();i++){
            myAns.push_back(ch + recAns[i]);
            }
        for(int i=0;i<recAns.size();i++){
            myAns.push_back(recAns[i]);
        }
    return myAns;
}


int main(){
   vector<string> ans=subseq("abcd");
   for(int i=0;i<ans.size();i++){
       cout<<ans[i]<<endl;
   }
return 0;
}