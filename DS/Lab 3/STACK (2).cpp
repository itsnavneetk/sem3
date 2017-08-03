#include<iostream>

using namespace std;
#define SIZE 10
class Stack{
   int s[SIZE],top;
   public:
      Stack(){
      top=-1;
      }
      void push();
      int pop();
      void disp();
};
void Stack::push(){
int item;
if(top==SIZE-1)
{
cout<<"stack overflow";
}
else{
cout<<"Enter the element to enter ";
cin>>item;
top = top+1;
s[top]=item;
}
}
int Stack::pop(){
if(top==-1)
{
cout<<"stack underflow";
return -1;
}
else{
return s[top--];
}
}
void Stack::disp()
{
int i;
if(top==-1)
{
cout<<"Empty stack";
}else{
cout<<"Stack : \n";
for(i=0;i<=top;i++)
cout<<s[i];
}
}

int main()
{

Stack obj;
int ans;
while(1)
 { cout<<" Enter the operation no. \n 1) push \n 2) pop \n 3) display \n 4) exit \n";
   cin>>ans;
   if(ans==1)
   {obj.push();}
   else if(ans==2)
   {obj.pop();}
   else if(ans==3)
   {obj.disp();}
   else
  {
      return(0);
}
 }

}

