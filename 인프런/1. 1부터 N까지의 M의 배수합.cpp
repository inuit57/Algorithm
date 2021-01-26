#include<stdio.h>

int main(){

    int i,n,m; 
    int res = 0 ;
    scanf("%d%d", &n, &m); 

    for(i = 1 ; i*m<= n ; i++ ){

        if ( i* m <= n){
            res += i*m; 
        }
        else{
            break; 
        }
    }

    printf("%d", res); 

    return 0; 
}
