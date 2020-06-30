#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int mat[r][c];
  int row[r],col[c];
  for(int i=0;i<r;i++)
    row[i]=0;
  for(int i=0;i<c;i++)
    col[i]=0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>mat[i][j];
      row[i]=row[i]+mat[i][j];
      col[j]=col[j]+mat[i][j];
    }
  }
    int maxr=0,indr=0;
    int maxc=0,indc=0;
    cout<<"Sum of rows is ";
    for(int i=0;i<r;i++)
    {
      cout<<row[i]<<" ";
      if(row[i]>maxr)
      {
        maxr=row[i];
        indr=i+1;
      }
    }
    cout<<"\nRow "<<indr<<" has maximum sum";
    cout<<"\nSum of columns is ";
    for(int i=0;i<c;i++)
    {
      cout<<col[i]<<" ";
      if(col[i]>maxc)
      {
        maxc=col[i];
        indc=i+1;
      }
    }
    cout<<"\nColumn "<<indc<<" has maximum sum";
}