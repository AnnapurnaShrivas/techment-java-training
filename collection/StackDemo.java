package com.techment.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s1 =new Stack();
		s1.push(1);
		s1.add(2); /// add and push both call use from jdk 1.2
		s1.add(3);
		s1.push(4);
		
		System.out.println("After Push = "+ s1);
		
		s1.pop();
		System.out.println("after removal = "+s1);
		
		System.out.println("top element = "+s1.peek());
		
		s1.pop();
		System.out.println("after removal = "+s1);
		

	}

}
