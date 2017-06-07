//String Functions

#include<iostream>
#include<conio.h>
#include<stdio.h>
#include"strfunc.cpp"
using namespace std;

int main()
{


 char str1[20],str2[20];

 cout<<"Enter first string - ";
 gets(str1);

 cout<<"Enter second string - ";
 gets(str2);


 cout<<"\n\n\t\t\t***String Menu***\n\n";
 cout<<"What would you like to do?";
 cout<<"\n1) Display length of strings entered.";
 cout<<"\n2) Concatenate the strings.";
 cout<<"\n3) Compare the strings.";
 cout<<"\n4) Insert a substring in String 1.";
 cout<<"\n5) Insert a substring in String 2.";
 cout<<"\n6) Delete a substring.";

 cout<<"\n\nEnter choice - ";
 char ch=getche();
 cout<<endl;

 if(ch=='1')
 {
  cout<<"\nLength of String 1 = "<<sLength(str1);
  cout<<"\nLength of String 2 = "<<sLength(str2);
 }

 else if(ch=='2')
 {
  sConcat(str1,str2);
  cout<<"\nString 1 concatenated with String 2!";
  cout<<"\nString 1 = "<<str1;
 }

 else if(ch=='3')
 {
  int a=sCompare(str1,str2);
  if(a<0) cout<<"\nString 1 is smaller.";
  else if(a>0) cout<<"\nString 2 is smaller.";
  else cout<<"\nStrings equal!";
 }

 else if(ch=='4')
 {
  char sub[20];
  cout<<"Enter Substring - ";
  gets(sub);

  int pos;
  cout<<"Enter position of insertion - ";
  cin>>pos;

  insSubstring(str1,sub,pos);

  cout<<"Substring now is - "<<str1;
 }

 else if(ch=='5')
 {
  char sub[20];
  cout<<"Enter Substring - ";
  gets(sub);

  int pos;
  cout<<"Enter position of insertion - ";
  cin>>pos;

  insSubstring(str2,sub,pos);

  cout<<"Substring now is - "<<str2;
 }
/*
 else if(ch=='6')
 {
  char a[20];
  cout<<"Enter substring to be deleted from String 1 - ";
  gets(a);
  delSubstring(str1,a);
 }
*/




 }
