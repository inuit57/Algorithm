#include<iostream>

using namespace std; 

int main(){

    int a , b ; 
    a=b= 0; 
    char last_winner = 'D'; 
    int arr[10] = {0};

    for ( int i = 0 ; i< 10; i++){
        cin >> arr[i] ;  // A값 입력받기. 
    }

    for ( int i = 0 ; i< 10; i++){
        int b_num ; 
        cin >> b_num ; 
        
        if( b_num == arr[i]){ // Draw
            b++; 
            a++; 
        }
        else if ( b_num > arr[i]){ // B win
            b+=3;
            last_winner = 'B'; 
        }
        else{ /// A win.
            a+=3; 
            last_winner = 'A'; 
        }
    }


    cout << a << ' ' << b << endl; 

    if (a > b) {
        cout << "A"; 
    }else if (a < b) {
        cout << "B"; 
    }else{
        cout << last_winner; 
    }

    
    
}