/*Linked List Operations*/
#include<iostream.h>
#include<conio.h>
#include<process.h>
#include<stdio.h>

class dlist
{
int roll;
dlist *llink;
dlist *rlink;
	public:
		void create();
		void disp();
		void insb();
		void insa();
		void del(int key);
		void rev();		
};
dlist *first=NULL;
void dlist::create()
{
	dlist*temp=new dlist;
	cout<<"Enter roll no."<<endl;
	cin>>temp->roll;
	temp->llink=temp->rlink=NULL;
	if(first==NULL)
		first=temp;
	else
	{
		for(dlist *curr=first;curr->rlink!=NULL;curr=curr->rlink);
		curr->rlink=temp;
		temp->llink=curr;
	}
}

void dlist::disp()
{
	if(first==NULL)
		cout<<"List is empty"<<endl;
	else
	{
		for(dlist *curr=first;curr!=NULL;curr=curr->rlink)
			cout<<curr->roll<<"\t";
	}
}

void dlist::insb()
{
	dlist *prev,*curr;
	dlist *temp=new dlist;
	int key;
	cout<<"Enter the element to be inserted"<<endl;
	cin>>temp->roll;
	cout<<"Enter the roll b4 which it is to be inserted"<<endl;
	cin>>key;
	for(curr=first,prev=first;curr!=NULL&&curr->roll!=key;prev=curr,curr=curr->rlink);
	if(curr!=NULL)
	{
		if(curr==first)
		{
			temp->rlink=first;
			first->llink=temp;
			first=temp;
		}
		else
		{
			prev->rlink=temp;
			temp->llink=prev;
			temp->rlink=curr;
			curr->llink=temp;
		}
	}
	else
		cout<<"NOT PRESENT!"<<endl;
}

void dlist::insa()
{
	dlist *next,*curr;
	dlist *temp=new dlist;
	int key;
	cout<<"Enter the element to be inserted"<<endl;
	cin>>temp->roll;
	cout<<"Enter the roll after which it is to be inserted"<<endl;
	cin>>key;
	for(curr=first,next=first->rlink;curr!=NULL&&curr->roll!=key;curr=curr->rlink,next=curr->rlink);
	if(curr!=NULL)
	{
		if(curr->rlink==NULL)
		{
			curr->rlink=temp;
			temp->llink=curr;
			temp->rlink=NULL;
		}
		else
		{
			curr->rlink=temp;
			temp->llink=curr;
			temp->rlink=next;
			next->llink=temp;
		}
	}
	else
		cout<<"NOT PRESENT!"<<endl;
}

void dlist::del(int key)
{
	dlist *curr;
	for(curr=first;curr!=NULL&&curr->roll!=key;curr=curr->rlink);
	if(curr!=NULL)
	{
		if(curr==first)
		{
			first=curr->rlink;
			first->llink=NULL;			
			delete curr;
		}
		else
		{
			curr->llink->rlink=curr->rlink;
			curr->rlink->llink=curr->llink;
			delete curr;
		}
	}
	else
		cout<<"NOT PRESENT"<<endl;
}

void dlist::rev()
{
	dlist *temp=NULL;
	dlist *curr=first->rlink;
	first->rlink=NULL;	
	while(curr!=NULL)
	{
		temp=curr->rlink;
		first->llink=curr;
		curr->rlink=first;
		first=curr;
		curr=temp;
	}
	first->llink=NULL;
}

void main()
{
int n,ch;
dlist s;
do
{
clrscr();
cout<<"Select the Operation\n";
cout<<"1.Create a list\n2.Insert an element before another element\n";
cout<<"3.Insert an element after another element\n4.Delete a given element\n";
cout<<"5.Traverse the list\n6.Reverse the list\n7.EXIT!\n";
cin>>ch;
switch(ch)
 {
  case 1: s.create();
	  getch();
	  break;
  case 2 :	        s.insb();
			getch();
			break;
  case 3 :              s.insa();
			getch();
			break;
  case 4 :              int k;
			cout<<"Enter element to be deleted\n";
			cin>>k;
			s.del(k);
			getch();
			break;
  case 5 :  s.disp();
			getch();
			break;
  case 6 :  s.rev();
			getch();
			break;
  case 7 :  exit(0);
  default : cout<<"Enter valid option\n";
  }
 }while(ch!=10);
 }
