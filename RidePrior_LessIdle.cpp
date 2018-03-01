#include<iostream>
#include<set>
using namespace std;
struct ride{
    int index;
    int a,b,x,y,s,f,l,ls;
};
struct car{
    int index;
    int lastx
}
int main(){
    int R,C,F,B,N,T;
    cin >> R >> C >> F >> B >> N >> T;
    ride rides[N];
    set<ride*>* sr = new set<ride*>();
    for(int i = 0; i < N; ++i) {
        rides[i].index = i;
        cin >> rides[i].a >> rides[i].b >> rides[i].x >> rides[i].y >> rides[i].s >> rides[i].f;
        rides[i].l = abs(rides[i].a - rides[i].x) + abs(rides[i].b - rides[i].y);
        rides[i].ls = rides[i].f - rides[i].l;
        sr->insert(&rides[i]);
    }
    for(int t = 0; t <= T; t++) {
        // Remove expired rides
        set<ride*>* tmp = new set<ride*>();
        for(auto& i : *sr) {
            
        }
        delete(sr);
        sr = tmp;
    }
}