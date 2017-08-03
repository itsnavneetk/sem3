#include<iostream>

using namespace std;
#define SIZE 10
class Stack{
    int top;
    char s[SIZE];
public:
      Stack(){
      top=-1;
      }
      void push();
      int pop();
      void disp();
      void check();
};
void Stack::push(){
char item;
if(top==SIZE-1)
{
cout<<"stack overflow";
}
else{
cout<<"Enter the element \n ";
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
void Stack::check(){
    int i,j,flag=0;
    for(i=0,j=top;i<top/2,j>top/2;i++,j--){
        if(s[i]!=s[j])
        {
            flag=1;
            break;
        }
    }

    if(flag==0){
        cout<<"Palindrome";
    }
    else{
        cout<<"not palindrome";
    }
}
int main()
{

Stack obj;
int ans;
while(1)
 { cout<<" Enter the operation no. \n 1) push \n 2) pop \n 3) display \n 4) check palindrome \n any other character for exit \n";
   cin>>ans;
   cout<<endl;
   if(ans==1)
   {obj.push();}
   else if(ans==2)
   {obj.pop();}
   else if(ans==3)
   {obj.disp();}
   else if(ans==4)
   {
       obj.check();
   }
   else
  {
      return(0);
}
 }

}
