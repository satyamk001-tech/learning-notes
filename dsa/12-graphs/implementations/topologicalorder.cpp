#include <iostream>
#include <vector>
using namespace std;

int main() {

    int nodes = 8;

    vector<vector<int>> Graph_Matrix =
    {{0,0,0,1,0,0,0,0},{0,0,0,1,0,0,0,0},{0,0,0,1,0,0,0,0},{0,0,0,1,1,1,0,0},
     {0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0}};
    cout<<"   ";
    for(int i=0;i<nodes;i++){
        cout<<(i+1)<<" ";
    }
    cout<<endl;
    

    for(int i = 0; i < nodes; i++){
        for(int j = 0; j < nodes; j++){
            cout << Graph_Matrix[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}