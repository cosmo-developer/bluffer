
void main() {
	int[] a = new int[10];
	int i = 0;
	int n = 2; 
	while (i < a.length) {
		a[i] = n;
		println(n);
		n = 2*n;
		i = i + 1;
	} 
	
	int[] rev = reverse(a);
	printArray(rev);
	
	float[] f = {9.3,8.8,17.5,1.0,2.1,3.2, 4.4};
	println(f[0]);   
	/**
	float max = findMax(f);
	
	println(max);   
	selectionSort(f);
	println(f[f.length-1]);
	**/
	//Redefinition occur in f because previousely defined as float[] f array
    float f1 = 2.34;
	float ff = 2.0;
	float fff = mult(f1,5,ff);
	println(fff);
	
	/**Define these also
	fff  = max(f,ff);  
	println(fff); **/
	/**Define this also countA
    string s = "All students got the highest grade A!";
	int res = countA(s);
	println(res);
	**/
	char[] charArr = {'a','b','c','d','e','f'};
	print("Before replace charArr at index 1:");
	println(charArr[1]);
	charArr = replace(charArr,'b','B');
	print("After replacement charArr at index 1:");
	println(charArr[1]);
	
	
	string xy = "Xerxes said Yes!";
	bool ok = containsXandY(xy);
	println(ok); 
}

char[] replace(char[] charArr,char b,char B){
	int i=0;
	while (i<charArr.length){
		if (charArr[i]==b){
			charArr[i]=B;
			print("Found");
		}
		i=i+1;
	}
	print("Method end Here\n");
	return charArr;
}

bool containsXandY(string str) {
    if ( contains(str,'X') ) {
       if ( contains(str,'Y') ) 
          return true;
    }
    return false;
}

bool contains(string str, char ch) {
    int i=0;
    while (i<str.length) {
       char p = str[i];
       if (p == ch) 
          return true;
       i = i+1;
    }
    return false;
}

float mult(float a, int n, float b) {
   return a * b;
}

int[] reverse(int[] arr) {
	int sz = arr.length;
	int[] toReturn = new int[sz];
	int i = 0;
	int n = 2;
	while (i < sz) {
		//Redefinition of n in while loop previousely declared in method 
		//int n = arr[sz-i-1];
		//New code
		n=arr[sz-i-1];
		toReturn[i] = n;
		i = i + 1;
	}
	return toReturn;
}

void printArray(int[] arr) {
	print(arr[0]);
	int i = 0;
	while(i<arr.length) {
		int n = arr[i];
		print(" ");
		print(n);
		i = i + 1;
	}
	println(" ");
}

bool flip(bool b) {
    if (b) return false;
    else return true;
}