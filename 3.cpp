#include<iostream>

using namespace std; 

int main(){
    int a, tmp = 0 , sum  = 0 ; 

    cin >> a ; 

    for (int i = 1; i <= a/2; i++ ){
        if(a%i == 0){
            if (tmp == 0) {
                tmp = i; //최초로 들어가는 경우.
            }
            else{ //이미 들어간 게 있는 경우.
                cout << tmp << " + "; //다음 녀석을 tmp에 넣는다. 
                tmp = i ; 
            }
            //cout << i << " + "; 
            sum += i; 
        }
    }

    // if ( sum != tmp) {
        cout << tmp << " = " << sum ; 
    // }
    // else{
    //     cout << tmp << " = " << sum ; 
    // }
}
