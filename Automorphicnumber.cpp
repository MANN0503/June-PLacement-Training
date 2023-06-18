#include<iostream>
using namespace std;

int main() {
	int n = 19;
	int square = n*n;
	
	int lastdigit = square%10;
	
	if(lastdigit == n) {
		cout<<("Automorphic number");
	} else {
		cout<<("Not automorphic number");
	}
}
