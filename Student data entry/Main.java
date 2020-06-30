#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student st;
   cin.get(st.name, 100);
   cin>>st.roll;
   cin>>st.marks;
   cout<<"\nStudent Details";
   cout<<"\nName: "<<st.name;
   cout<<"\nRoll: "<<st.roll;
   cout<<"\nMarks: "<<st.marks;
}