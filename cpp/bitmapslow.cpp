/**
*
* Daniel Lemire, February 2012, http://lemire.me/
*
* Suppose that you want to copy an array over
* another, except for some exceptions. 
* What is faster?
*
* 
*/


#include <iostream>
#include <vector>
#include <cstdlib>
#include <cstring>
#include <sys/stat.h>
#include <sys/time.h>
#include <sys/types.h>

using namespace std;

typedef unsigned int uint;




class ZTimer
{
public:
    struct timeval t1, t2;
public:
    ZTimer() :  t1(), t2() { gettimeofday(&t1,0); t2 = t1; }
    void reset() {gettimeofday(&t1,0); t2 = t1;}
    int elapsed() { return ((t2.tv_sec - t1.tv_sec) * 1000) + ((t2.tv_usec - t1.
tv_usec) / 1000); }
    int split() { gettimeofday(&t2,0); return elapsed(); }
};

/**
* This copies the data from begin to end, except at some locations
* given by exceptionpos where it must use the values from
* exceptionval. We write to "out".
*/ 
__attribute__ ((noinline)) void patchedcopy(const uint * const  __restrict__ begin, 
		const uint * const  end, 
		const  uint * __restrict__ exceptionval, 
		const vector<uint> & exceptionpos, 
	uint * __restrict__ out) {
	uint * __restrict__ tmpout = out;
	for(const uint *  __restrict__ i = begin; i<end;++i) {
		*(tmpout++) = *i;
	}
	for(vector<uint>::const_iterator pos = exceptionpos.begin(); pos!= exceptionpos.end();++pos) {
		*(out + *pos) = *(exceptionval++);
	}
}



/**
* This copies the data from begin to end, except at some locations
* given by exceptionbitmap where it must use the values from
* exceptionval. We write to "out".
*/
__attribute__ ((noinline)) void bitmapcopy(const uint * const  __restrict__ begin, 
		const uint * const  end, 
		const  uint * __restrict__ exceptionval, 
		const vector<uint> & exceptionbitmap, 
	uint * __restrict__ out) {
	vector<uint>::const_iterator j = exceptionbitmap.begin();
	for(const uint *  __restrict__ i = begin; i<end;++i) {
		for(uint k = 0; k<32;++k,++i)
			*(out++) = ((*j) & (1U<<k))? *(exceptionval++) : *i;
		++j;
	}
}


vector<uint> generateArray(uint N) {
	vector<uint> ans(N);
	for(uint k = 0; k<N;++k)
	  ans[k] = rand();
	return ans;
}

pair<vector<uint>, vector<uint> > generateExceptLocations(uint N, uint density) {
	vector<uint> positions;
	vector<uint> bitmap(N/32);
	for(uint k = 0; k<N;k+= density) {
		positions.push_back(k);
		bitmap[k/32] &= (1<<(k%32));
	}
	return pair<vector<uint>, vector<uint> >(positions,bitmap);
}
int main() {
	uint N = 1000000*32;//1024*1024*100;
	uint density = 100;
	vector<uint> data = generateArray(N);
	vector<uint> out(N);
	ZTimer z;

	vector<uint> exceptionvals = generateArray(N);// more than we need
	cout <<" density(%)\t time with patching \t time with bitmaps"<<endl;
	for(uint density = 1; density<50; density+=5) {
		pair<vector<uint>, vector<uint> > exceptionpos = generateExceptLocations( N, density); 
	
		cout<<100.0/density<<"\t\t\t";

		
		z.reset();
		patchedcopy(& data[0], 
		(& data[0]) + N,
		&  exceptionvals[0],
		exceptionpos.first,
		&out[0]);
		cout<<z.split()<<"\t\t\t";

		z.reset();
		bitmapcopy(& data[0], 
		(& data[0]) + N,
		&  exceptionvals[0],
		exceptionpos.second,
		&out[0]);	
		cout<<z.split()<<"\t";

		
		cout<<endl;
	}
	return 0;
}