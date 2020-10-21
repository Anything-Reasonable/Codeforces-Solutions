                                            # A. Boring Apartments
                                            time limit per test: 1 second
                                            memory limit per test: 256 megabytes
                                            input: standard input
                                            output: standard output
There is a building consisting of 10 000 apartments numbered from 1 to 10 000, inclusive.

Call an apartment boring, if its number consists of the same digit. Examples of boring apartments are 11,2,777,9999 and so on.

Our character is a troublemaker, and he calls the intercoms of all boring apartments, till someone answers the call, in the following order:

First he calls all apartments consisting of digit 1, in increasing order (1,11,111,1111).
Next he calls all apartments consisting of digit 2, in increasing order (2,22,222,2222)
And so on.
The resident of the boring apartment x answers the call, and our character stops calling anyone further.

Our character wants to know how many digits he pressed in total and your task is to help him to count the total number of keypresses.

For example, if the resident of boring apartment 22 answered, then our character called apartments with numbers 1,11,111,1111,2,22 and the total number of digits he pressed is 1+2+3+4+1+2=13.

You have to answer t independent test cases.

### Input
The first line of the input contains one integer t (1≤t≤36) — the number of test cases.

The only line of the test case contains one integer x (1≤x≤9999) — the apartment number of the resident who answered the call. It is guaranteed that x consists of the same digit.

### Output
For each test case, print the answer: how many digits our character pressed in total.

Example
input
4
22
9999
1
777
output
13
90
1
66




                                            # B. Yet Another Bookshelf
                                            time limit per test: 1 second
                                            memory limit per test: 256 megabytes
                                            input: standard input
                                            output: standard output


There is a bookshelf which can fit n books. The i-th position of bookshelf is ai=1 if there is a book on this position and ai=0 otherwise. It is guaranteed that there is at least one book on the bookshelf.

In one move, you can choose some contiguous segment [l;r] consisting of books (i.e. for each i from l to r the condition ai=1 holds) and:

Shift it to the right by 1: move the book at index i to i+1 for all l≤i≤r. This move can be done only if r+1≤n and there is no book at the position r+1.
Shift it to the left by 1: move the book at index i to i−1 for all l≤i≤r. This move can be done only if l−1≥1 and there is no book at the position l−1.
Your task is to find the minimum number of moves required to collect all the books on the shelf as a contiguous (consecutive) segment (i.e. the segment without any gaps).

For example, for a=[0,0,1,0,1] there is a gap between books (a4=0 when a3=1 and a5=1), for a=[1,1,0] there are no gaps between books and for a=[0,0,0] there are also no gaps between books.

You have to answer t independent test cases.

### Input
The first line of the input contains one integer t (1≤t≤200) — the number of test cases. Then t test cases follow.

The first line of the test case contains one integer n (1≤n≤50) — the number of places on a bookshelf. The second line of the test case contains n integers a1,a2,…,an (0≤ai≤1), where ai is 1 if there is a book at this position and 0 otherwise. It is guaranteed that there is at least one book on the bookshelf.

### Output
For each test case, print one integer: the minimum number of moves required to collect all the books on the shelf as a contiguous (consecutive) segment (i.e. the segment without gaps).

Example
input
5
7
0 0 1 0 1 0 1
3
1 0 0
5
1 1 0 0 1
6
1 0 0 0 0 1
5
1 1 0 1 1
output
2
0
2
4
1
Note
In the first test case of the example, you can shift the segment [3;3] to the right and the segment [4;5] to the right. After all moves, the books form the contiguous segment [5;7]. So the answer is 2.

In the second test case of the example, you have nothing to do, all the books on the bookshelf form the contiguous segment already.

In the third test case of the example, you can shift the segment [5;5] to the left and then the segment [4;4] to the left again. After all moves, the books form the contiguous segment [1;3]. So the answer is 2.

In the fourth test case of the example, you can shift the segment [1;1] to the right, the segment [2;2] to the right, the segment [6;6] to the left and then the segment [5;5] to the left. After all moves, the books form the contiguous segment [3;4]. So the answer is 4.

In the fifth test case of the example, you can shift the segment [1;2] to the right. After all moves, the books form the contiguous segment [2;5]. So the answer is 1.

                                                C. Dominant Piranha
                                                time limit per test2 seconds
                                                memory limit per test256 megabytes
                                                inputstandard input
                                                outputstandard output
There are n piranhas with sizes a1,a2,…,an in the aquarium. Piranhas are numbered from left to right in order they live in the aquarium.

Scientists of the Berland State University want to find if there is dominant piranha in the aquarium. The piranha is called dominant if it can eat all the other piranhas in the aquarium (except itself, of course). Other piranhas will do nothing while the dominant piranha will eat them.

Because the aquarium is pretty narrow and long, the piranha can eat only one of the adjacent piranhas during one move. Piranha can do as many moves as it needs (or as it can). More precisely:

The piranha i can eat the piranha i−1 if the piranha i−1 exists and ai−1<ai.
The piranha i can eat the piranha i+1 if the piranha i+1 exists and ai+1<ai.
When the piranha i eats some piranha, its size increases by one (ai becomes ai+1).

Your task is to find any dominant piranha in the aquarium or determine if there are no such piranhas.

Note that you have to find any (exactly one) dominant piranha, you don't have to find all of them.

For example, if a=[5,3,4,4,5], then the third piranha can be dominant. Consider the sequence of its moves:

The piranha eats the second piranha and a becomes [5,5–,4,5] (the underlined piranha is our candidate).
The piranha eats the third piranha and a becomes [5,6–,5].
The piranha eats the first piranha and a becomes [7–,5].
The piranha eats the second piranha and a becomes [8–].
You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤2⋅104) — the number of test cases. Then t test cases follow.

The first line of the test case contains one integer n (2≤n≤3⋅105) — the number of piranhas in the aquarium. The second line of the test case contains n integers a1,a2,…,an (1≤ai≤109), where ai is the size of the i-th piranha.

It is guaranteed that the sum of n does not exceed 3⋅105 (∑n≤3⋅105).

Output
For each test case, print the answer: -1 if there are no dominant piranhas in the aquarium or index of any dominant piranha otherwise. If there are several answers, you can print any.

Example
inputCopy
6
5
5 3 4 4 5
3
1 1 1
5
4 4 3 4 4
5
5 5 4 3 2
3
1 1 2
5
5 4 3 5 5
outputCopy
3
-1
4
3
3
1
Note
The first test case of the example is described in the problem statement.

In the second test case of the example, there are no dominant piranhas in the aquarium.

In the third test case of the example, the fourth piranha can firstly eat the piranha to the left and the aquarium becomes [4,4,5,4], then it can eat any other piranha in the aquarium.

D. Districts Connection
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
There are n districts in the town, the i-th district belongs to the ai-th bandit gang. Initially, no districts are connected to each other.

You are the mayor of the city and want to build n−1 two-way roads to connect all districts (two districts can be connected directly or through other connected districts).

If two districts belonging to the same gang are connected directly with a road, this gang will revolt.

You don't want this so your task is to build n−1 two-way roads in such a way that all districts are reachable from each other (possibly, using intermediate districts) and each pair of directly connected districts belong to different gangs, or determine that it is impossible to build n−1 roads to satisfy all the conditions.

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤500) — the number of test cases. Then t test cases follow.

The first line of the test case contains one integer n (2≤n≤5000) — the number of districts. The second line of the test case contains n integers a1,a2,…,an (1≤ai≤109), where ai is the gang the i-th district belongs to.

It is guaranteed that the sum of n does not exceed 5000 (∑n≤5000).

Output
For each test case, print:

NO on the only line if it is impossible to connect all districts satisfying the conditions from the problem statement.
YES on the first line and n−1 roads on the next n−1 lines. Each road should be presented as a pair of integers xi and yi (1≤xi,yi≤n;xi≠yi), where xi and yi are two districts the i-th road connects.
For each road i, the condition a[xi]≠a[yi] should be satisfied. Also, all districts should be reachable from each other (possibly, using intermediate districts).

Example
inputCopy
4
5
1 2 2 1 3
3
1 1 1
4
1 1000 101 1000
4
1 2 3 4
outputCopy
YES
1 3
3 5
5 4
1 2
NO
YES
1 2
2 3
3 4
YES
1 2
1 3
1 4
The problem statement has recently been changed. View the changes.
×
E. Two Round Dances
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
One day, n people (n is an even number) met on a plaza and made two round dances, each round dance consists of exactly n2 people. Your task is to find the number of ways n people can make two round dances if each round dance consists of exactly n2 people. Each person should belong to exactly one of these two round dances.

Round dance is a dance circle consisting of 1 or more people. Two round dances are indistinguishable (equal) if one can be transformed to another by choosing the first participant. For example, round dances [1,3,4,2], [4,2,1,3] and [2,1,3,4] are indistinguishable.

For example, if n=2 then the number of ways is 1: one round dance consists of the first person and the second one of the second person.

For example, if n=4 then the number of ways is 3. Possible options:

one round dance — [1,2], another — [3,4];
one round dance — [2,4], another — [3,1];
one round dance — [4,1], another — [3,2].
Your task is to find the number of ways n people can make two round dances if each round dance consists of exactly n2 people.

Input
The input contains one integer n (2≤n≤20), n is an even number.

Output
Print one integer — the number of ways to make two round dances. It is guaranteed that the answer fits in the 64-bit integer data type.

Examples
inputCopy
2
outputCopy
1
inputCopy
4
outputCopy
3
inputCopy
8
outputCopy
1260
inputCopy
20
outputCopy
12164510040883200
F. Zero Remainder Sum
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
You are given a matrix a of size n×m consisting of integers.

You can choose no more than ⌊m2⌋ elements in each row. Your task is to choose these elements in such a way that their sum is divisible by k and this sum is the maximum.

In other words, you can choose no more than a half (rounded down) of elements in each row, you have to find the maximum sum of these elements divisible by k.

Note that you can choose zero elements (and the sum of such set is 0).

Input
The first line of the input contains three integers n, m and k (1≤n,m,k≤70) — the number of rows in the matrix, the number of columns in the matrix and the value of k. The next n lines contain m elements each, where the j-th element of the i-th row is ai,j (1≤ai,j≤70).

Output
Print one integer — the maximum sum divisible by k you can obtain.

Examples
inputCopy
3 4 3
1 2 3 4
5 2 2 2
7 1 1 4
outputCopy
24
inputCopy
5 5 4
1 2 4 2 1
3 5 1 2 4
1 5 7 1 2
3 8 7 1 2
8 4 7 1 6
outputCopy
56
Note
In the first example, the optimal answer is 2 and 4 in the first row, 5 and 2 in the second row and 7 and 4 in the third row. The total sum is 2+4+5+2+7+4=24.

G. Reducing Delivery Cost
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
You are a mayor of Berlyatov. There are n districts and m two-way roads between them. The i-th road connects districts xi and yi. The cost of travelling along this road is wi. There is some path between each pair of districts, so the city is connected.

There are k delivery routes in Berlyatov. The i-th route is going from the district ai to the district bi. There is one courier on each route and the courier will always choose the cheapest (minimum by total cost) path from the district ai to the district bi to deliver products.

The route can go from the district to itself, some couriers routes can coincide (and you have to count them independently).

You can make at most one road to have cost zero (i.e. you choose at most one road and change its cost with 0).

Let d(x,y) be the cheapest cost of travel between districts x and y.

Your task is to find the minimum total courier routes cost you can achieve, if you optimally select the some road and change its cost with 0. In other words, you have to find the minimum possible value of ∑i=1kd(ai,bi) after applying the operation described above optimally.

Input
The first line of the input contains three integers n, m and k (2≤n≤1000; n−1≤m≤min(1000,n(n−1)2); 1≤k≤1000) — the number of districts, the number of roads and the number of courier routes.

The next m lines describe roads. The i-th road is given as three integers xi, yi and wi (1≤xi,yi≤n; xi≠yi; 1≤wi≤1000), where xi and yi are districts the i-th road connects and wi is its cost. It is guaranteed that there is some path between each pair of districts, so the city is connected. It is also guaranteed that there is at most one road between each pair of districts.

The next k lines describe courier routes. The i-th route is given as two integers ai and bi (1≤ai,bi≤n) — the districts of the i-th route. The route can go from the district to itself, some couriers routes can coincide (and you have to count them independently).

Output
Print one integer — the minimum total courier routes cost you can achieve (i.e. the minimum value ∑i=1kd(ai,bi), where d(x,y) is the cheapest cost of travel between districts x and y) if you can make some (at most one) road cost zero.

Examples
inputCopy
6 5 2
1 2 5
2 3 7
2 4 4
4 5 2
4 6 8
1 6
5 3
outputCopy
22
inputCopy
5 5 4
1 2 5
2 3 4
1 4 3
4 3 7
3 5 2
1 5
1 3
3 3
1 5
outputCopy
13
Note
The picture corresponding to the first example:



There, you can choose either the road (2,4) or the road (4,6). Both options lead to the total cost 22.

The picture corresponding to the second example:



There, you can choose the road (3,4). This leads to the total cost 13.