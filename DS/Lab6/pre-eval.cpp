#include<iostream>
#include<cctype>
#include<string.h>
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
 int scan();
 int operation (int a, int b, char x);
};

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


void stack::read(){
    cout<<"Enter prefix ";
    cin>>pfix;
    strrev(pfix);
}
int stack::scan(){
    int i=0,op1,op2;

  while(pfix[i]!='\0'){
    if(isdigit(pfix[i]))
        push(pfix[i]-'0');
        else{
            op1 = pop();
             op2 = pop();
            int res = operation(op1, op2, pfix[i]);
            push(res);
        }
        i++;
}
    return pop();
}

int stack::operation (int op1, int op2, char x){
    switch(x){
        case '+':
                return op1+op2;
	       break;
    case '-' : return op1-op2;
	       break;
    case '*' : return op1*op2;
	       break;
    case '/' : return op1/op2;
	       break;
    }
}

int main()
{
 char ch ='y';
 stack s;
 while(ch=='y')
 {
  s.read();
 cout<<"answer "<<s.scan()<<endl;
  cout<<"continue?";
  cin>>ch;
 }
}
