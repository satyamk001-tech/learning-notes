#include <iostream>
#include <vector>
using namespace std;

int main() {
    int nodes = 6;   // nodes: 0,1,2,3,4,5
    int edges;

    cout << "Enter number of edges: ";
    cin >> edges;

    vector<vector<int>> adj(nodes);

    cout << "Enter edges (u v):\n";
    for(int i = 0; i < edges; i++) {
        int u, v;
        cin >> u >> v;

        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    cout << "\nAdjacency List:\n";
    for(int i = 0; i < nodes; i++) {
        cout << i << " -> ";
        for(int neighbour : adj[i]) {
            cout << neighbour << " ";
        }
        cout << endl;
    }

    return 0;
}
