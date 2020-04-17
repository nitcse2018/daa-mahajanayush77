// a program to generate all binary strings of length n
// using branch and bound
#include <iostream>
#include <queue>
#include <vector>
using namespace std;

class node{
    public:
       int *a;
       int l;
       vector<node*> child;
       node* parent;
       
       //constructor
       node(node *parent,int l, int N){
            this->parent = parent;
           this->l= l;
           this->a= new int[N];
         
       }
};

void str( node *n,int &N, queue<node*> &q){

    if(n->l == N){
        for(int i=0;i<N;i++){
            cout<< n->a[i];
            if((i+1)%3==0){
                cout<<endl;
            }
        }
    }
    else
    {
        int m=n->l;
        for(int i=0;i<=1;i++){
            node *c = new node(n,m+1,N);
            for(int k=0;k<m;k++){
                c->a[k]= n->a[k];
            }
            c->a[m]=i;
            n->child.push_back(c);
            q.push(c);
        }
    }
    
}

int main(){

    int n;
    cin>>n;
    node *root;
    root= new node(NULL,0,n);

    queue<node *>q;
    q.push(root);
    while(!q.empty()){
        node *b = q.front();
        q.pop();
        str(b,n,q);
    }

    return 0;

}