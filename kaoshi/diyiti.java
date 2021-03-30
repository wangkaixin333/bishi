#include <iostream>
using namespace std;
        /* run this program using the console pauser or add your own getch, system("pause") or input loop */

        int main(int argc, char** argv) {
        int m,n,i,j=0;
        double sum=0;
        double a[105][105];
        double b[105][105];
        cin>>m>>n;
        for(i=1;i<=m;i++){
        for(j=1;j<=n;j++){
        cin>>a[i][j];
        b[i][j]=a[i][j];
        }
        }
        for(i=1;i<=m;i++){
        for(j=1;j<=n;j++){
        if(i!=1 && j!=1 && i!=m && j!=n){
        sum=(a[i][j]+a[i-1][j]+a[i+1][j]+a[i][j+1]+a[i][j-1])/5;
        sum=int(sum+0.5);
        b[i][j]=sum;
        }
        }
        }
        for(i=1;i<=m;i++){
        for(j=1;j<=n;j++){
        cout<<b[i][j]<<" ";
        if(j==n){
        printf("\n");
        }
        }
        }

        return 0;
        }
