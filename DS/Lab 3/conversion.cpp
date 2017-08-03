#include<iostream>

using namespace std;
#define SIZE 10
class Stack{
    int top;
    int s[SIZE];
public:
      Stack(){
      top=-1;
      }
      void push(int x);
      int pop();
      void disp();
      void check();
      void binary(int n);
      void hex();
      void oct();
};
void Stack::push(int item){
if(top==SIZE-1)
{
cout<<"stack overflow";
}
else{
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
}else
/* for( int i=top;i>=0;i--)
{
    if(s[i]<10){
        cout<<s[i];
    }
    else{

    }
}
} */
for( int i=top;i>=0;i--)
{
    if(s[i]<10){
    cout<<s[i];
    }
    else{
     switch (s[top]){
case 10: cout<<"A " ;
	  break;
case 11: cout<<"B ";
	 break;
case 12: cout<<"C ";
	 break;
case 13: cout<<"D ";
	 break;
	 case 14: cout<<"E ";
	 break;
	 case 15: cout<<"F ";
	 break;
     }
}
}
}
int main()
{

Stack obj;
int ans,n,temp,push;

while(1)
 { cout<<" Enter the operation no. \n 1)Enter no. \n 2) pop \n 3) display \n 4) change into binary \n 5) change into hexa \n 6) change into oct \n any other character for exit \n";
   cin>>ans;
   cout<<endl;
   if(ans==1)
   {
cin>>n;
}
   else if(ans==2)
   {obj.pop();}
   else if(ans==3)
   {obj.disp();}
   else if(ans==4)
   {
    temp = n;
    int digit;
    while(temp>0){
    digit = temp %2;
    temp = temp /2;

     obj.push(digit);
    }
    obj.disp();
   }
   else if(ans==5)
   {
       temp = n;
    int digit;
    while(temp>0){
    digit = temp %8;
    temp = temp /8;

     obj.push(digit);
    }
    obj.disp();

   }
   else if(ans==6)
   {
    temp = n;
    int digit;
    while(temp>0){
    digit = temp %16;
    temp = temp /16;

     obj.push(digit);
    }
    obj.disp();

   }
   else
  {
      return(0);
}
 }

}
