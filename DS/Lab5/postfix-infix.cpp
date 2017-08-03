#include <iostream>
#include<stdlib.h>
#include<stdio.h>
#include<ctype.h>
#include<string.h>
#define max 10
using namespace std;
class stack{
private: int top;
         char s[100][100];
public:  stack()
         {
             top=-1;
         }
         void push(char* x)
         {
             if(top==max-1)
             {
                 cout<<"Overflow!";
                 return;
             }
             top++;
             strcpy(s[top],x);
         }
         void pop()
         {
             if(top==-1)
             {
                 cout<<"Underflow!";
                 return;
             }
             top--;
         }
         char* stop()
         {
             return s[top];
         }
         void print()
         {
             for(int i=0;i<=top;i++)
             {
                 cout<<s[i]<<endl;
             }
         }
         bool IsEmpty()
         {
             if(top==-1)
             {
                 return true;
             }
             return false;
         }
         int size()
         {
             if(top==-1)
             {
                 return 0;
             }
             return top+1;
         }
};
int main ()
{
    stack s;
    char postfix[100];
    cout<<"Enter postfix expression:";
    cin>>postfix;
    int i=0;
    char res[100];
    char e1[2];
    char op1[100],op2[100];
    while(postfix[i]!='\0')
    {
        e1[0]=postfix[i];
        e1[1]='\0';
        if(isalnum(postfix[i]))
        {
            s.push(e1);
        }
        else
        {
            strcpy(op2,s.stop());
            s.pop();
            strcpy(op1,s.stop());
            s.pop();
            strcpy(res,"(");
            strcat(res,op1);
            strcat(res,e1);
            strcat(res,op2);
            strcat(res,")");
            s.push(res);
        }
        i++;
    }
    if(s.size()==1)
    {
        cout<<s.stop()<<endl;
        s.pop();
    }
    else
    {
        cout<<"Invalid expression!";
    }
    return 0;
}
