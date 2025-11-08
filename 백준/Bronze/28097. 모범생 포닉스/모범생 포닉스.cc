#include<bits/stdc++.h>
using namespace std;
int n,ret,temp;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		ret+=temp;
	}
	if(n>1){
		ret+=(n-1)*8;
	}
	cout<<ret/24<<' '<<ret%24;
}