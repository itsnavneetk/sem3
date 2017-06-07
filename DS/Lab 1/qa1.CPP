#include<iostream4>
using namespace std;

int main()
{

 int a[3][3],b[3][3];
 int c[3][3];
 int i,j;
 cout<<"Enter Matrix A\n";

 for(i=0;i<3;i++)
 for(j=0;j<3;j++)
  cin>>a[i][j];


 cout<<"Enter Matrix B\n";

 for(i=0;i<3;i++)
 for(j=0;j<3;j++)
  cin>>b[i][j];

 cout<<"Matrix C:\n";

 for(i=0;i<3;i++)
 for(j=0;j<3;j++)
 {
  if(a[i][j]>=b[i][j])
  c[i][j]=a[i][j];

  else
  c[i][j]=b[i][j];
 }

 for(i=0;i<3;i++)
 {
  cout<<endl;
  for(j=0;j<3;j++)
   {
    cout<<c[i][j]<<' ';
   }
 }


}