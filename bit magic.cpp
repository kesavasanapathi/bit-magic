  
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int num,pos;
	cin>>num;
	cin>>pos;
	if(num & ((pos-1)<<1))
	{
		cout<<"given position is set";
	}
	else
	{
		cout<<"no";
	}
	return 0;
}
