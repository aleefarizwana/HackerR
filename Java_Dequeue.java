Question 12: Java Dequeue

Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 

https://www.hackerrank.com/challenges/java-dequeue/problem

import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque <Integer>deque = new ArrayDeque<>();
            HashSet<Integer> hs= new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max=0;
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            
            for(int i = 0 ; i < n ; i++){
                deque.add(nums[i]);
                if(deque.size()>m){
                    int removed = deque.removeFirst();
                    if(!deque.contains(removed)){
                        hs.remove(removed);
                    }
                }
                hs.add(nums[i]);
                if(hs.size()>max){
                    max = hs.size();
                }
            }
            System.out.println(max);
        }
                
  }



// In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).
// Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. 

