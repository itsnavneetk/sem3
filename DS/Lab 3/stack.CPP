#include<iostream>
#include<conio.h>
using namespace std;

class stack
{
 int s[5], top, el;

 public:

	int size;

	stack()
	{
	 top=-1;
	}

	void push(int);
	void pop();
	void display();

};


void stack::push(int size)
{
 for(int i=0;i<size;i++)
 {
  if(top==size-1)
	cout<<"Stack Overflow!";
  else
  {
   cout<<"Enter Element - ";
   cin>>el;
   s[++top]=el;
  }
 }
}

void stack::pop()
{
 if(top==-1)
  cout<<"\nStack Underflow!";
 else
 {
  cout<<"\nPopping Last Element!";
  top--;
 }
}

void stack::display()
{
 cout<<endl;
 for(int i=0;i<=top;i++)
 cout<<s[i]<<' ';
}


void main()
{
 clrscr();

 stack S1;
 int size;
 cout<<"Enter size of the stack - ";
 cin>>size;

 S1.push(size);
 S1.display();

 while(size!=0)
 {
 cout<<"Hit any key to pop!";
 if(!kbhit())
 {
 
  S1.pop();
  S1.display();
 }
 size--;
 }

 
}