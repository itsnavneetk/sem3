#include<iostream>
#include<conio.h>
using namespace std;

class Linked{
    int val;
    Linked *next;
public:
    Linked(){

    }
    void insertB();
    void deleteP();
    void print();
};
Linked *head=NULL;
Linked *tail=NULL;

void Linked::insertB(){
    Linked *temp=new Linked;
    temp->next=NULL;
    cout<<"VALUE : "<<endl;
    cin>>temp->val;
    if(head!=NULL && tail!=NULL){
        tail->next=temp;
        tail=temp;
    }
    else{
        tail=head=temp;
    }

}

void Linked::print(){
    Linked *f=head;
    if(f==NULL){
        cout<<"Empty list"<<endl;
    }
    while(f!=NULL){
        cout<<f->val<<" -> ";
        f=f->next;

    }
    return;
}




int main(){
    Linked ll;
    while(1){
        cout<<"1.Insert 2.Print 3.Delete 4.Exit"<<endl;
        int ch;
        cin>>ch;
        switch(ch){
            case 1:ll.insertB();
                    break;
            case 2:ll.print();
                    break;
            //case 3:ll.deleteE();
              //      break;
            default: return 0;
        }
    }
    getch();
}
