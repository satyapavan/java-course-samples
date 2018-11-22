template<int Depth, int A, typename B>
struct K17 { 
static const int x =
K17 <Depth+1, 0, K17<Depth,A,B> >::x
+ K17 <Depth+1, 1, K17<Depth,A,B> >::x
+ K17 <Depth+1, 2, K17<Depth,A,B> >::x
+ K17 <Depth+1, 3, K17<Depth,A,B> >::x
+ K17 <Depth+1, 4, K17<Depth,A,B> >::x;
};
template <int A, typename B>
struct K17 <16,A,B> { static const int x = 1;
};
static const int z = K17 <0,0,int>::x;
int main()
{
}
