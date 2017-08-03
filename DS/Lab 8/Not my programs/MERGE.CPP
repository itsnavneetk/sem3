#include<iostream.h>
#include<conio.h>

class node
{
	int data;
	node *link;
	node(int a, node *p)
	{
		data=a;
		link=p;
	}
	friend class clist;
};
class clist
{
	node *hnode;
	public:
		clist()
		{
			hnode=new node(-1,NULL);
			hnode->link=hnode;
		}
		void create();
		void disp();
		void merge(clist o);
};
void clist::create()
{
	int n,d;
	cout<<"Enter no. of nodes to be entered";
	cin>>n;
	node *temp=hnode;
	for(int i=0;i<n;i++)
	{
		cout<<"Enter data"<<endl;
		cin>>d;
		temp=temp->link=new node(d,hnode);
	}
}
void clist::disp()
{
	node *curr=hnode->link;
	for(;curr!=hnode;curr=curr->link)
		cout<<curr->data<<"\t";
}
void clist::merge(clist o)
{
	node *curr1=hnode->link;
	for(;curr1->link!=hnode;curr1=curr1->link);
	curr1->link=o.hnode->link;
	while(curr1->link!=o.hnode)
		curr1=curr1->link;
	curr1->link=hnode;
	delete o.hnode;
}

void main()
{
	clrscr();
	clist a,b;
	a.create();
	b.create();
	a.merge(b);
	a.disp();
	getch();
}