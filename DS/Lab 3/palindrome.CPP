#include<iostream>
#include<conio.h>
#include<stdio.h>
#include"strfunc.cpp"

using namespace std;
class stack
{
 int s[10], top;

 public:

	stack()
	{
	 top=-1;
	}

	void push(char);
	char pop();
	void display();

};


void stack::push(char a)
{
 if(top==9)
	cout<<"Stack Overflow!";
 else s[++top]=a;
}


char stack::pop()
{
 if(top==-1)
  {
  cout<<"\nStack Underflow!";
  return -1;
  }

 else
 {
  int temp=top;
  top--;
  return s[temp];
 }
}



int main()
{


 stack S1;

 char str[10],b[10];
 cout<<"Enter a string - ";
 gets(str);

int i;
 for(i=0;str[i]!='\0';i++)
 S1.push(str[i]);


 for(i=0;str[i]!='\0';i++)
 b[i]=S1.pop();


 b[i]='\0';


 if(sCompare(str,b)==0)
 cout<<"\tPALINDROME!";
 else
 cout<<"\tNOT A PALINDROME!";


}
