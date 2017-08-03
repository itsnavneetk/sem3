#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
int a[10][10],temp[10][10]={0,0},i,j,m,n;
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

for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  temp[j][i] = a[i][j];
 }
 cout<<endl;
}

for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  cout<<temp[i][j]<<" ";
 }
 cout<<endl;
}


getch();
}