#include<iostream>
using namespace std;

int main() {
	for(int i = 11; i<=19; i++) {
		int firstdigit = i/10;
		int lastdigit = i%10;
		
		int sum = firstdigit + lastdigit;
		int product = firstdigit * lastdigit;
		
		int sum2 = sum + product;
		
		int count = sum2;
		cout<<count<<endl;
		if(sum2 == i) {
			cout<<("Special number")<<endl;
		} else {
			cout<<("Not special number")<<endl;
		}
	
	}
	return 0;
}
