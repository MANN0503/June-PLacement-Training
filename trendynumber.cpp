#include<iostream>
using namespace std;

int main(){
	int a;
	cin>>a;
	
	if(a>=100 && a<=999) {
		int middledigit = (a % 100)/10;
	
		if(middledigit % 3 == 0) {
			cout<<("Trendy number");
		} else {
			cout<<("Not a trendy number");
		} 
	} else {
		cout<<("Number not valid");
	}
	
}
