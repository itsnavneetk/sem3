#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
int a[10][10],b[10][10],i,j,m,n,c[10][10];
cout<<"Enter m and n"<<endl;
cin>>m>>n;
cout<<"Enter first matrix";
for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  cin>>a[i][j];
 }
}
cout<<"Enter second matrix";
for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  cin>>b[i][j];
 }
}
cout<<"Entered matrix are "<<endl;
for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  cout<<a[i][j]<<" ";
 }
 cout<<endl;
}
cout<<" "<<endl;
for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  cout<<b[i][j]<<" ";
 }
 cout<<endl;
}
for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  c[i][j] =(a[i][j]>b[i][j])?a[i][j]:b[i][j];
 }
}

cout<<"resultant matrix is "<<endl;
for(i=0;i<m;i++){
 for(j=0;j<n;j++){
  cout<<c[i][j]<<" ";
 }
 cout<<endl;
}


getch();
}