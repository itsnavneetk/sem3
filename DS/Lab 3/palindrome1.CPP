#include<iostream>
#include<conio.h>
#include<stdio.h>
#include"strfunc.cpp"
using namespace std;

class stack
{
 char ch;
 int top;

 public:
	char s[20];
	int size;
	stack()
	{
	 top=-1;
	}

	void push(int);
	char pop();
	void display();
};

void stack::push(int size)
{
 cout<<"Enter a string - ";
 for(int i=0;i<size;i++)
 {
  if(top==size-1)
  cout<<"Stack Overflow!";
  else
  {
   ch=getche();
   s[++top]=ch;
  }
 s[size]='\0';

 }
}

char stack::pop()
{
 char ret=s[top];
 top--;
 return ret;
}

void stack::display()
{
 cout<<endl;
 for(int i=0;i<=top;i++)
 cout<<s[i];
}


int main()
{

 stack S1;
 int size;
 cout<<"Enter size of the string - ";
 cin>>size;

 S1.push(size);
 S1.display();

 char b[20];

 for(int i=0;i<size;i++)
 {
  b[i]=S1.pop();
 }
 b[size]='\0';

 if(sCompare(S1.s,b)==0)
 cout<<" is a PALINDROME!";
 else
 cout<<" is NOT A PALINDROME!";

}

