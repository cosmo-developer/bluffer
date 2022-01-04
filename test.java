
void main() {
	string jener="Yes mas";
	println(containsXandY(jener));
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

int[] reverse(int[] arr) {
	int sz = arr.length;
	int[] toReturn = new int[sz];
	int i = 0;
	int n = 2;
	while (i < sz) {
		n = arr[sz-i-1];
		toReturn[i] = n;
		i = i + 1;
	}
	return toReturn;
}

void printArray(int[] arr) {
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


string vunerable(){
	
	return "Video is blocked!";
}