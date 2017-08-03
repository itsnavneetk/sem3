#include<iostream>
using namespace std;
#define SIZE=10
#define SIZE1=4
class Mstacks{
    int s[SIZE];
    int top[SIZE1];
    int boundary[SIZE1];
public:
    void push();
    void pop();
    void disp();
    Mstacks(){
     top=boundary=-1;
    }
};

void Mstacks::push(){
    if()
}
void Mstacks::pop(){

}
void Mstacks::disp(){

}

int main()
{
    Mstacks obj;
    int i,j,n;
    cout<<"Enter no. of stacks ";
    cin>>n;
        for(i=1 ; i < n ; i++)
     {
            obj.top[i] = obj.boundary[i] = ((SIZE/n)*i)-1;
     }
     obj.boundary[n] = SIZE-1;
 int ans;
while(1)
 { cout<<" Enter the operation no. \n 1) push \n 2) pop \n 3) display \n 4) check palindrome \n any other character for exit \n";
   cin>>ans;
   cout<<endl;
   if(ans==1)
   {obj.push();}
   else if(ans==2)
   {obj.pop();}
   else if(ans==3)
   {obj.disp();}
   else if(ans==4)
   {
       obj.check();
   }
   else
  {
      return(0);
}
 }


}
