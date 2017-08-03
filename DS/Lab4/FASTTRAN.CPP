#include <iostream>

using namespace std;

class sparse
{

 public:
   void read(int []);
   void display(int []);
   void ftranspose(int [], int []);
    int r,c,v;
};

void read(sparse a[])
{   int r,c,value;
    cout<<"enter the row length "<<endl;
    cin>>r;
    cout<<"enter the column length "<<endl;
    cin>>c;
    int k=1,item;
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
    {
        cin>>item;
        if(item==0)
            continue;
        else
        a[k].r = i;
        a[k].c = j;
        a[k].v = value;
        k++;
    }

    a[0].v = k-1;
    a[0].r = r;
    a[0].c = c;

}

void display(sparse a[])
   {
       for(int i=0;i<a[0].v;i++)
        cout<<a[i+1].r<<a[i+1].c<<a[i+1].v<<endl;
   }

void ftranspose(sparse a[], sparse b[])
{
    int rterms[20],spos[20];
    int i,j,ncols = a[0].c,nterms = a[0].v;
    b[0].r = ncols;
    b[0].c = a[0].r;
    b[0].v = nterms;
     for(int i=0;i<ncols;i++)
        {
            rterms[i] = 0;
        }
        for(i=1;i<=nterms;i++)
            rterms[a[i].c]++;
        spos[0] = 1;
     for(i=1;i<=ncols;i++)
      spos[i] = spos[i-1] + rterms[i-1];
      for(i=1;i<nterms;i++)
      {
          j = spos[a[j].c]++;
          b[j].r = a[i].c;
          b[j].c = a[i].r;
          b[j].v = a[i].v;
      }
}
/*
#include<iostream>
using namespace std;
class transposeM{
    int m1[20][20],m2[20][20],i,j,row,column,t;
public:
    void read(){
        t=0;
        cout<<"Enter the number of row: \n";
        cin>>row;
        cout<<"enter the number of column: \n";
        cin>>column;

        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                cin>>m1[i][j];

                if(m1[i][j]){
                    t++;
//                  cout<<"first t is:"<<t;
                //if non zero
                            m2[t][0]=i+1;
                            m2[t][1]=j+1;
                            m2[t][2]=m1[i][j];

                }


            }
        }

        m2[0][0]=row;
        m2[0][1]=column;
        m2[0][2]=t;
    }

    void displaysp(){
cout<<"sparse matrix is: \n";
        for(i=0;i<=t;i++){
            for(j=0;j<3;j++){
                cout<<m2[i][j]<<" ";
            }
            cout<<"\n";
        }
    }

    void transpose(){
        int transpose[20][3];

                        transpose[0][0]=m2[0][1];
                        transpose[0][1]=m2[0][0];
                        transpose[0][2]=m2[0][2];
        cout<<"Transpose is: \n";
        int q=1;
        for(i=1;i<=column;i++){
            for(int p=1;p<=t;p++){
                if(m2[p][2]==i){
                    transpose[q][0]=m2[p][1];
                    transpose[q][1]=m2[p][0];
                    transpose[q][2]=m2[p][2];
                    q++;

                }
            }
        }

        for(i=0;i<=column;i++){
            for(j=0;j<3;j++){
                cout<<transpose[i][j]<<" ";
            }
            cout<<"\n";
        }

    }
    void display(){
        for(i=0;i<row;i++){
                for(j=0;j<column;j++){
                    cout<<m1[i][j]<<" ";


                }
                cout<<"\n";
            }

    }
};
int main(int argc,char ** argv){
    transposeM obj;
    obj.read();
    obj.display();
    obj.displaysp();
    obj.transpose();
    return 0;
}
*/
int main()
{ int a[10],b[10];
  sparse s;
  sparse t;
  sparse m;
  s.read(a);
  s.display(a);
  m.ftranspose(s,t);
  t.display(b);


    return 0;
}
