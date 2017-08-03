#include<iostream>
using namespace std;
#define MAX 20

class stack
{
 public:
  char st_arr[50], infix[50], pfix[50];
  int top;
  stack()
  {
  top=-1;
  }
 void push(char symbol);
 char pop();
 void read();
 int isempty();
 void intopfix();
 int prec(char symbol);
};



void main()
{clrscr();
 char ch ='y';
 stack s;
 while(ch=='y')
 {
  s.read();
  s.intopfix();
  cout<<" wanna continue?";
  cin>>ch;
 }
}


void stack::push( char symbol)
{
 if(top==MAX-1)
 {
  cout<<"stack full";
  return;
 }
 st_arr[++top] = symbol;
}

char stack::pop()
{
 if(top==-1)
 {
  return'#';
 }
 else
  return (st_arr[top--]);
}

void stack::read()
{
 cout<<" enter the infix expression";
 cin>>infix;
}


int stack::isempty()
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

void stack::intopfix()
{
 int l, precedence , p;
 char e1, e2;
 p=0;
 for(int i=0; infix[i]!='\0'; i++)
 {
  e1= infix[i];
  switch(e1)
  {
   case '(' : push(e1);
	      break;
    case ')' : while ((e2 = pop())!='(')
		 pfix[p++] = e1;
	       break;
    case '+' :
    case '-' :
    case '*' :
    case '/' :  if(!isempty())
		{ precedence = prec(e1);
		  e2 = pop();

		  while ( precedence <= prec(e2))

		  {  pfix[p++] = e2;
		     if(!isempty())
			  e2=pop();
		     else
		     break;
		     }
		  if(precedence > prec(e2))
		       {push(e2);}
		       }
		   push(e1);
		   break;
	default: pfix[p++]=e1;
		    break;
		    }}

   while(!isempty())
  pfix[p++] = pop();
 pfix[p]='\0';
 cout<<"postfix expression is"<<pfix<<endl; }

int stack::prec(char symbol)
{ switch(symbol)
 { case '/':
   case '*': return 3;
   case '+':
   case '-': return 2 ;
   case '(': return 0;
   default: return -1;
   }}




