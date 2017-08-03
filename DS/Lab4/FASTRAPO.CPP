#include<iostream>
using namespace std;
class sparse
{
	int row;
	int col;
	int val;

	public:
	void create (int a[][10],sparse *,int m,int n);
	void ftranspose (sparse * ,sparse * );
	void disp(sparse *,sparse *);
};

void sparse::create(int a[][10], sparse *s,int m,int n)
{
int k=1;
s[0].row=m;
s[0].col=n;
	for(int i=0;i<m;i++)
	{
	for(int j=0;j<n;j++)
	{
	if(a[i][j]!=0)
		{
		s[k].row=i;
		s[k].col=j;
		s[k].val=a[i][j];
		k++;
		}
	}
	}
	cout<<k;
	s[0].val=k-1;


}

void sparse :: ftranspose(sparse *s ,sparse *t)
{
int nonz[20];
int startpos[20],i,j;

int numcols=s[0].col;
int numterms=s[0].val;
t[0].row=numcols;
t[0].col=s[0].row;
t[0].val=numterms;
if(numterms>0)
{
for(i=0;i<s[0].col;i++)
	nonz[i]=0;

for(i=1;i<=s[0].val;i++)
	nonz[s[i].col]++;

for(i=1;i<s[0].col;i++)
	startpos[i] = startpos[i-1] + nonz[i-1];

for(i=0;i<s[0].row;i++)
	{
	j=startpos[s[i].col]++;
	t[j].row=s[i].col;
	t[j].col=s[i].row;
	t[j].val=s[i].val;
	}

}
}



void sparse :: disp(sparse *s,sparse *t)
{
cout<<"FastTranspose of given matrix is:\n";
	for(int i=0;i<=s[0].val;i++)
	{
	cout<<t[i].row<<" "<<t[i].col<<" "<<t[i].val<<"\n";
	}


}




int main()
{

int a[10][10],i,j,row,col;
sparse s[20],t[20];
cout<<"Enter the dimension of matrix:\n";
cout<<"r:";
cin>>row;
cout<<"c:";
cin>>col;
cout<<"Enter the elements row wise of matrix a\n";
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
		{
		cin>>a[i][j];
		}
	}

s[0].create(a,s,row,col);
s[0].ftranspose(s,s);
t[0].disp(s,t);

}

