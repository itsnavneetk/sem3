#include<iostream.h>
#include<conio.h>
#include<process.h>
#include<ctype.h>
#define MAX 20

class postfix_eval
{
 public:
  int st[50],top,item;
  char pfix[50];
  postfix_eval()
  {
  top=-1;
  }
 void push(int number);
 int pop();
 void read();
 int isempty();
 int calpfix();
 int operation(int op1, int op2, char opera);

};



void main()
{clrscr();
 char ch ='y';
 postfix_eval s;
 while(ch=='y')
 {
  s.read();
 cout<<"answer is"<<s.calpfix();
  cout<<" wanna continue?";
  cin>>ch;
 }
}


void postfix_eval::push(int number)
{
 if(top==MAX-1)
 {
  cout<<"stack full";
  return;
 }
 st[++top] = number;
}

int postfix_eval::pop()
{
 if(top==-1)
 {
  return 0;
 }
 else
  return (st[top--]);
}

void postfix_eval::read()
{
 cout<<" enter the postfix expression";
 cin>>pfix;
}


int postfix_eval::isempty()
{
 if(top==-1)
 {
  return -1;
 }
 else
 {
  return 0;
 }
}

int postfix_eval::calpfix()
{ int index=0, op1, op2;
  while(pfix[index]!='\0')
  { if (isdigit(pfix[index]))
       push(pfix[index]-'0');
       else
       { op2= pop();
	 op1 = pop();
	 int res = operation(op1,op2,pfix[index]);
	 push(res);
       }
	 index++ ;
	 }
	 return pop();
	 }


int postfix_eval::operation( int op1, int op2, char opera)
{switch(opera)
  {
    case '+' : return op1+op2;
	       break;
    case '-' : return op1-op2;
	       break;
    case '*' : return op1*op2;
	       break;
    case '/' : return op1/op2;
	       break;
}           }