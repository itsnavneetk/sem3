#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
int a[10],key,pos,i,found,n;
cout<<"Enter size of array"<<endl;
cin>>n;
cout<<"Enter an array"<<endl;

for(i=0; i<n; i++){
 cin>>a[i];
}
cout<<"Enter the element to be searched"<<endl;
cin>>key;
for(i=0; i<n; i++){
 if(a[i]==key){
   found=1;
   pos = i;
   break;
 }
}
if(found==1){
 cout<<"element found at "<<pos+1;
}
else{
 cout<<"element not found";
}
getch();
}
