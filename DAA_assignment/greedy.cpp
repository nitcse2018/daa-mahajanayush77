//Prim's algorithm to generate min spanning tree of a graph
// uses greedy approach

#include <iostream>
#include <vector>
#include <queue>

using namespace std;

const int MAX = 99999999;

typedef pair<long long, int> v;
//pair to store distance from source and the node

bool marked[MAX];
//to keep a track of visited nodes

vector <v> adj[MAX];

long long prim(int x)
{
    priority_queue<v, vector<v>, greater<v> > Q;
    //priority queue with vector as underlying container

    int y;
    long long minimumCost = 0;
    v p;
    Q.push(make_pair(0, x));
    while(!Q.empty())
    {
        p = Q.top();
        Q.pop();
        x = p.second;
        // Checking for cycle
        if(marked[x] == true)
            continue;
        minimumCost += p.first;
        marked[x] = true;
        for(int i = 0;i < adj[x].size();++i)
        {
            y = adj[x][i].second;
            if(marked[y] == false)
                Q.push(adj[x][i]);
        }
    }
    return minimumCost;
}

int main()
{
    int nodes, edges, x, y;
    long long weight, minimumCost;
    cin >> nodes >> edges;
    for(int i = 0;i < edges;++i)
    {
        cin >> x >> y >> weight;
        adj[x].push_back(make_pair(weight, y));
        adj[y].push_back(make_pair(weight, x));
    }
    // Selecting 1 as the starting node
    minimumCost = prim(1);
    cout << minimumCost << endl;
    return 0;
}