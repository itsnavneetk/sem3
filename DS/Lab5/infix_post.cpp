#include<iostream>
#define MAX=10;
using namespace std;

class stack{
    public:
    int top,n=20;
    char st_arr[50],infix[50],pfix[50];
    Stack(){
        top=-1;
    }
    void push(char x);
    char pop();
    void disp();
    //conversions
    void read();
    int isempty();
    void contopfix();
    int prec(char sym);
};

    void stack::push(char x){
        if(top==n-1){
            cout<<"overflow";
            return;
        }
            top=top+1;
            st_arr[top]=x;
    }
    char stack::pop(){
        if(top==-1){
            cout<<"underflow";
            return '#';
        }
        else{
            return(st_arr[top--]);
        }
    }
    void stack::disp(){
        for(int i=0;i<n;i++){
            cout<<st_arr[i];
        }
    }


void stack::read(){
    cout<<"ENTER infix expn : ";
    cin>>infix;
}

int stack::isempty(){
    if(top==-1){
        return -1;
    }
    else{
        return 0;
    }
}
void stack::contopfix(){
    int l,precedence,p;
    char e1,e2;
    p=0;
    for(int i =0;infix[i]!='\0';i++){
        e1 = infix[i];
        switch(e1)
        {
        case '(':
            push(e1);
            break;
        case ')':
            while((e2=pop())!='('){
                    pfix[p++]=e2;
                  }
            break;
        case '+':
        case '-':
        case '*':
        case '/': if(!isempty()){
                        precedence = prec(e1);
                        e2 = pop();
                        while(precedence<=prec(e2)){
                            pfix[p++]=e2;
                            if(!isempty()){
                                e2 = pop();
                                }
                            else{
                                break;
                                }
                        }
                            if(precedence>prec(e2)){
                                push(e2);
                            }
                   }
                            push(e1);
                            break;
        default: pfix[p++]=e1;
                 break;
                        }
                }
                while(!isempty())
                    pfix[p++]=pop();
                    pfix[p]='\0';
                    cout<<"pfix : "<<pfix<<endl;

}
int stack::prec(char symbol){
    switch(symbol){
    case'/':
    case'*':
        return 3;
    case'+':
    case'-':
        return 2;

    case '(':
        return 0;

    default:
        return -1;
    }
}


int main(){
    char ch='y';
    stack s;
    while(ch=='y'){
        s.read();
        s.contopfix();
        cout<<"continue press y ";
        cin>>ch;
    }

}
