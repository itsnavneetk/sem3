#include<iostream.h>
#include<conio.h>
#include<process.h>

class slist
{
	int data;
	slist *link;
	public:
	void push();
	void pop();
	void disp();
};
slist *first=NULL;
void slist::push()
{
	slist *temp=new slist;
	cout<<"Enter the value"<<endl;
	cin>>temp->data;
	if(first==NULL)
	{
		temp->link=NULL;
		first=temp;
	}
	else
	{
		temp->link=first;
		first=temp;
	}
}
void slist::pop()
{
	if(first==NULL)
		cout<<"List is empty"<<endl;
	else
	{
		slist *t;	
		t=first->link;
		delete first;
		first=t;
	}
}
void slist::disp()
{
	if(first==NULL)
		cout<<"List is empty"<<endl;
	else
	{
		for(slist *curr=first;curr!=NULL;curr=curr->link)
			cout<<curr->data<<"\t";
	}
}

void main()
{
	clrscr();
	slist s;
	int ch;
  do
  {
	cout<<" 1. Push\n 2. Pop\n 3. Display\n 4. Exit\n \n Enter your choice?\n";
	cin>>ch;
	switch(ch)
	{
		case 1:
			s.push();
			break;
		case 2:
			s.pop();
			break;
		case 3:
			s.disp();
			getch();
			break;
		case 4:
			exit(0);
		default:
			cout<<"Enter valid choice!";
	}
  }while(1);
}