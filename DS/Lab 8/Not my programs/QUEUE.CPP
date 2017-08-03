#include<iostream.h>
#include<conio.h>
#include<process.h>

class slist
{
	int data;
	slist *link;
	public:
	void ins();
	void del();
	void disp();
};
slist *first=NULL;
void slist::ins()
{
	slist *temp=new slist;
	cout<<"Enter the value"<<endl;
	cin>>temp->data;
	temp->link=NULL;
	if(first==NULL)
	{
		first=temp;
	}
	else
	{
		for(slist *curr=first;curr->link!=NULL;curr=curr->link);
		curr->link=temp;
	}
}
void slist::del()
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
	cout<<" 1. Insert\n 2. Delete\n 3. Display\n 4. Exit\n \n Enter your choice?\n";
	cin>>ch;
	switch(ch)
	{
		case 1:
			s.ins();
			break;
		case 2:
			s.del();
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