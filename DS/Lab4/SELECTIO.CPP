#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
int n,i,j,a[10],small,temp=0,pos=0;

cout<<"Enter n "<<endl;
cin>>n;
for(i=0;i<n;i++){
 cin>>a[i];
}

 for(i=0;i<n;i++){
  small = a[i];
  pos =i;
  for(j=i+1;j<n;j++){
   if(small>a[j]){
    pos = j;
    temp = a[i];
    a[i] = a[j];
    a[j] = temp;

   }
  }
 }
 for(i=0;i<n;i++){
 cout<<a[i]<<" ";
}

getch();
 }