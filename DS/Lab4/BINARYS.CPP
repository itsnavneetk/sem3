#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

int l,h,mid,key,pos,i,a[10],n;
cout<<"Enter size of array"<<endl;
cin>>n;
cout<<"Enter an sorted array"<<endl;

for(i=0; i<n; i++){
 cin>>a[i];
}
cout<<"Enter the element to be searched"<<endl;
cin>>key;
h=n-1;
l=0;
for(i=0;i<=h;i++){
 mid=(l+h)/2;
    if(a[mid]==key){
     cout<<"found at "<<mid+1;
     break;
    }
     if(key>a[mid]){
     l=mid+1;
    }
     if(key<a[mid]){
     h=mid-1;
    }
}
getch();
}


