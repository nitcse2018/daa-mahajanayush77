#include<iostream>
#include<algorithm>
using namespace std;
 
 
int parent[10001];
 
struct edge{
    int a;
    int b;
    int w;
};
 
bool myCompare(edge a,edge b)
{
    if(a.w<b.w)
    return true;
    return false;
}
 
 //implementation of disjoint sets
int find(int a)
{
    if(parent[a]==-1)
    return a;
    return parent[a]=find(parent[a]);
}
 
void Union(int a,int b)
{
    parent[a]=b;
}

edge x[100001];
 
int main()
{
 
    long long int n,m,i;
    cin>>n>>m;
    for(i=1;i<=n;i++)
    parent[i]=-1;
     
    
    for(i=0;i<m;i++)
    {
        cout<<"Enter edges as from a vertex a to vertex b and then give its weight"<<endl;
        cin>>x[i].a>>x[i].b>>x[i].w;
    }
    int sum=0;
    //sorting the edges according to weights
    sort(x,x+m,myCompare);
 
      for(i=0;i<m;i++)
    {
      int  a=find(x[i].a);
      int  b=find(x[i].b);
 
       if(a!=b)
       {
           sum+=x[i].w;
           Union(a,b);
       }
    }
 
    cout<<sum;
 
 
 
    return 0;
}