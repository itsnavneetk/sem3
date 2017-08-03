#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
int n,i,j,a[10],temp=0,small;

cout<<"Enter n "<<endl;
cin>>n;
for(i=0;i<n;i++){
 cin>>a[i];
}

for(i=0;i<n;i++){
  j=i+1;
  temp=a[j];
  for(j ;j>0;j--){
   if(temp < a[j-1])
   {
    a[j] = a[j-1];
    }
    else{
     break;
    }
    a[j] = temp;
   }
}

for(i=0;i<n;i++){
 cout<<a[i]<<" ";
}
 getch();
}
