package queue_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
* Introduction
Why heaps?
Heap as a container gives you fast insertion of any element as well as reads and deletion of either the minimum-most or maximum-most element. Also it does not provide random access to any other element in the heap
Where to use?
Based on this advantage, some major use cases for heaps are BFS, Djikstra, Current median of stream of elements
Initialising

// 1. max heap -> for popping largest element
	priority_queue<int> pq;     // replace int with any other type or a struct based on need
// 2. min heap -> for popping minimum element
	priority_queue<int, vector<int>, greater<int>> pq;
// 3. custom heaps in case of custom ordering (here we are creating min heap based on second property)
	struct comp {
		bool operator()(pair<int, int> a, pair<int, int> b) {
			return a.second > b.second;
		}
	};
	priority_queue<int, vector<int>, comp> pq;
// 4. If you already have an array and want to initialise using it
	priority_queue<int, vector<int>, greater<int>> pq(a.begin(), a.end());
This last operation takes O(n) time where n is size of array a.

Important operations

pq.push(10);           // adds element to heap
int cur = pq.top();    // returns top element, does NOT pop though
pq.pop()               // pops top element, does NOT return the value of top element though
pq.size()              // return size of heap
pq.empty()             // returns true if heap is empty else false
Always make sure that heap is not empty prior to top() and pop() methods
Time - push() and pop() takes O(logn) time, the other three require O(1) time.

*
*
* */
/*
    Approach
Once we are aware of how to use the priority queue and the above facts the approach is straightforward as the question instructs us what to do. We need the two largest elements at each step for our operation, since heaps give the fastest access to the extremes its our go to here. The pseudo-code is as follows -

	Initialise heap using the array (use 4th option above)
	Keep smashing as long as there is 2 or more stones (use size() method)
		Pick the two largest and remove them from heap (use top() and pop())
		if their difference is positive add new stone to our heap (use push())

	If there is a stone remaining in heap return it or else return 0 (use empty() and top())


 */

/*
*   Heap is a specialized tree-based data structure that is essentially almost complete binary tree. There are so many operations possible with max and min heaps like -

insert(), delete(), update(), findMinElement(), findMaxElement(), etc

And time complexity depends on the operation you perform on the heap.

Heap Sort has O(nlog n) time complexities for all the cases ( best case, average case, and worst case).

Let us understand the reason why. The height of a complete binary tree containing n elements is log n

In the worst case scenario, we will need to move an element from the root to the leaf node making a multiple of log(n) comparisons and swaps.

During the build_max_heap stage, we do that for n/2 elements so the worst case complexity of the build_heap step is n/2xlog n ~ nlog n.

During the sorting step, we exchange the root element with the last element and heapify the root element. For each element, this again takes log n worst time because we might have to bring the element all the way from the root to the leaf. Since we repeat this n times, the heap_sort step is also nlog n.

Also since the build_max_heap and heap_sort steps are executed one after another, the algorithmic complexity is not multiplied and it remains in the order of nlog n.
* */
public class LastStoneWeight {
    //Optimized approach Complexity - Time: O(nlogn), Space: O(n)
    public static int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int s : stones){
            pq.add(s);
        }
        while (pq.size() > 1){
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            if(stone1 > stone2){
                pq.add(stone1 - stone2);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
    //Brute force approach complexity - time - O(2nlogn) space - O(n)
    public static int lastStoneWeight1(int[] stones){
        if (stones.length == 1){
            return stones[0];
        }
        Arrays.sort(stones);
        int y = stones.length -1;
        int x = stones.length -2;
        while (x >= 0){
            if(stones[x] == stones[y]){
                stones[x] = 0;
                stones[y] = 0;
            }else{
                stones[y] -= stones[x];
                stones[x] = 0;
            }
            Arrays.sort(stones);
            if(stones[x] == 0) {
                break;
            }
        }
        return stones[y];
    }
    public static void main(String[] args) {
        int[] a = new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeight(a));
        System.out.println(lastStoneWeight1(a));
    }
}
