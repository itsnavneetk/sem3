#include<iostream>

using namespace std;
#define SIZE 10
class Stack{
   int s[10],item,top;
   public:
      Stack(){
      top=-1;
      }
      void push();
      int pop();
      void disp();
};
void Stack::push(){
if(top==SIZE-1)
{
cout<<"stack overflow";
return;
}
top = top+1;
s[top]=item;
}
int Stack::pop(){
if(top==-1)
{
cout<<"stack underflow";
return -1;
}
return s[top--];
}
void Stack::disp()
{
int i;
if(top==-1)
{
cout<<"Empty stack";
return;
}
cout<<"Stack : \n";
for(i=0;i<=top;i++)
cout<<s[i];
}

int main()
{

Stack s1;
int x;
cout<<"push in stack \n";
cin>>x;
s1.push();
s1.disp();
cout<<endl;
cout<<"pop \n";
s1.pop();
cout<<endl;
s1.disp();

}


