#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
int i,j,a[10],n,temp=0;
cout<<"Enter size of array"<<endl;
cin>>n;
for(i=0;i<n;i++){
cin>>a[i];
}
for(j=0;j<n;j++){
for(i=j+1;i<n;i++){
 if(a[j]>a[i]){
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
