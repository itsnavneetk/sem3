#include<iostream>

using namespace std;
void bubsort(int[]);
void selsort(int[]);
void inssort(int[]);
void inputar(int[]);
void display(int[]);


int main()
{

	int arr[5];

	inputar(arr);

	cout<<"\t\t\t***INSERTION SORT***\n";
	display(arr);
	inssort(arr);
	cout<<"\n**************************************\n";
	display(arr);


	inputar(arr);

	cout<<"\t\t\t***BUBBLE SORT***\n";
	display(arr);
	bubsort(arr);
	cout<<"\n**************************************\n";
	display(arr);


	inputar(arr);

	cout<<"\t\t\t***SELECTION SORT***\n";
	display(arr);
	selsort(arr);
	cout<<"\n**************************************\n";
	display(arr);

}

void inputar(int ar[5])
{
 cout<<"Enter Array::\n";
 for(int i=0;i<5;i++)
	cin>>ar[i];
 cout<<endl;
}

void display(int ar[5])
{
 cout<<"Array Entered:\n";
 for(int i=0;i<5;i++)
	cout<<ar[i]<<endl;
}

void inssort(int ar[5])
{
 for(int i=1;i<5;i++)
  {
     int temp=ar[i];
     int j=i-1;
     while(temp<ar[j]&&j>=0)
      {
	 ar[j+1]=ar[j];
	 j--;
      }
     ar[j+1]=temp;
  }
}


void selsort(int ar[5])
{
  for(int i=0;i<5;i++)
    for(int j=i+1;i<5;i++)
	if(ar[i]>ar[j])
	{
	 int temp=ar[i];
	 ar[i]=ar[j];
	 ar[j]=temp;
	}
}

void bubsort(int ar[5])
{
  for(int i=0;i<(5)-1;i++)
    for(int j=0;j<(5)-i-1;j++)
	if(ar[j]>ar[j+1])
	{
	 int temp=ar[j];
	 ar[j]=ar[j+1];
	 ar[j+1]=temp;
	}
}
