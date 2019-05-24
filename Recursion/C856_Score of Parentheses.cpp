#include <iostream>

using namespace std;

int scoreOP(string S);
int score(const string& S, int l, int r);

int main()
{
   cout << scoreOP("(()(()()))");
}

int scoreOP(string S){
    return score(S, 0, S.length() - 1);
}

int score(const string& S, int l, int r){
    if (r - l == 1) // "()"
    return 1;
    
    int b = 0;
    for(int i = l; i < r; ++i){
        if(S[i] == '(') ++b;
        if(S[i] == ')') --b;
        if(b == 0) //balanced
            // score("((())(())(())") = score("(())") + score ("(())(())")
            return score(S, l, i) + score(S, i + 1, r);
    }
    // score("(())") = 2 * score("()")
    return 2*score(S, l + 1, r - 1);
}