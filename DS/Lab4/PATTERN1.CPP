#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
int i,n,j;
cin>>n;
for(i=0;i<n;i++){
		for(j=n;j>i;j--,cout << "*");
		cout << endl;
	}
	for(i=0;i<n;i++){
		for(j=0;j<i;cout << " ",j++);
		for(j=i;j<n;cout << "*",j++);
		cout << endl;
	}
 cout<<endl;
getch();
 }