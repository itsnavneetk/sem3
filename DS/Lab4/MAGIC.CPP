#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
int a[10][10],i,j,m,n,sum=0;
cout<<"Enter m and n"<<endl;
cin>>m>>n;
cout<<"Enter matrix";
for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  cin>>a[i][j];
 }
}
cout<<"entered matrix "<<endl;
for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  cout<<a[i][j]<<" ";
 }
 cout<<endl;
}


getch();
}