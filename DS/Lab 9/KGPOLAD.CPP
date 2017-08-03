#include<iostream.h>
#include<conio.h>
class node
{
 int exp,coeff;
 node *link;
 public:

 node *create();
 void display(node*);
 node *add(node*,node*);
 node *mult(node*,node*);
};

node* node::add(node*p,node*q)
{
 node *n1;
 node *n2;

 node *ans=new node;

 node *h=ans;

 for(n1=p,n2=q;n1!=NULL&&n2!=NULL;)
 {
  ans->link=new node;
  ans=ans->link;
  if(n1->exp==n2->exp)
  {
   ans->coeff=n1->coeff+n2->coeff;
   ans->exp=n1->exp;
   n1=n1->link;
   n2=n2->link;
  }
  else if(n1->exp>n2->exp)
  {ans->coeff=n1->coeff;
   ans->exp=n1->exp;
   n1=n1->link;
  }
  else
  {ans->coeff=n2->coeff;
   ans->exp=n2->exp;
   n2=n2->link;
  }
 }
 if(n1!=NULL)
 {for(;n1!=NULL;n1=n1->link)
  {ans->link=new node;
   ans=ans->link;
   ans->coeff=n1->coeff;
   ans->exp=n1->exp;
  }
 }
 else if(n2!=NULL)
 {for(;n2!=NULL;n2=n2->link)
  {ans->link=new node;
   ans=ans->link;
   ans->coeff=n2->coeff;
   ans->exp=n2->exp;
  }
 }
 ans->link=NULL;
 return h->link;
}


node* node::create()
{node *temp=new node;
 node *first=temp;
 int n=1;
 do{
	 cout<<"Enter Exponent and Coefficient"<<endl;
	 cin>>temp->exp>>temp->coeff;
	 cout<<"Enter 1 to continue and 0 to exit"<<endl;
	 cin>>n;
	 if(n!=0)
	 { temp->link=new node;
	   temp=temp->link;
	 }
   }while(n);
 temp->link=NULL;
 return first;
}

node* node::mult(node*p,node*q)
{
 node*n,*m,*tot=NULL;

 for(n=p;n!=NULL;n=n->link)
 {node*prod=new node;
  node*h=prod;
  for(m=q;m!=NULL;m=m->link)
   {prod->link=new node;
    prod=prod->link;
    prod->exp=(n->exp)+(m->exp);
    prod->coeff=(n->coeff)*(m->coeff);
   }
  prod->link=NULL;
  tot=add(tot,h->link);
  delete h;
  delete prod;
 }
 return tot;
}

void node::display(node*h)
{
 node *temp=h;
 cout<<temp->coeff<<"x^"<<temp->exp;
 while(temp->link!=NULL)
 {
  temp=temp->link;
  cout<<'+'<<temp->coeff<<"x^"<<temp->exp;
 }
 cout<<endl;
}

void main()
{
 clrscr();
 node *p1,*p2,*ans;

 cout<<"Enter 1st Polynomial"<<endl;
 p1=p1->create();
 clrscr();

 cout<<"\nEnter 2nd Polynomial"<<endl;
 p2=p2->create();
 clrscr();

 cout<<"First polynomial = ";
 p1->display(p1);
 cout<<"\nSecond polynomial = ";
 p2->display(p2);
 cout<<"\nSum:";
 ans=ans->add(p1,p2);
 ans->display(ans);

 cout<<"\nProduct:";
 ans=ans->mult(p1,p2);
 ans->display(ans);

 getch();
}
