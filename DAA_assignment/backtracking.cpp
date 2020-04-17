//program to generate all possible permutations of a string using bactracking and recursion
#include <iostream>
#include <string>
using namespace std;

void permutation(string s,int l,int r){

    if(l==r){
        cout<< " "<<s<<endl;
    }
    else
    {
        for(int i=l;i<=r;i++){

            swap(s[i],s[l]);
            permutation(s,l+1,r);
            swap(s[l],s[i]);

        }
    }
    
}

int main(){
      string s;
      cin>>s;
      permutation(s,0,s.size()-1);

    return 0;
}