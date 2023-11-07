package com.greatlearning.lab3.question1;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {
		String input = "([[{}]])";
		System.out.println(isBalancedBracket(input));
		

	}
	
	public static boolean isBalancedBracket(String input) {
		
		if(input == null || input.isBlank()) {
			System.out.println("Empty input String");
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		Set<Character> acceptedChars = new HashSet<Character>();
		acceptedChars.add('(');
		
		for(char ch : input.toCharArray()) {
			if(!acceptedChars.contains(ch)) {
				System.out.println("Invalid Character in input string");
				return false;
			}
			if(ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
			switch(ch) {
			case '}':
				if(stack.pop() != '{' ) {
					return false;
				}
				break;
			case ']':
				if(stack.pop() != '[' ) {
					return false;
				}
				break;
			case ')':
				if(stack.pop() != '(' ) {
					return false;
				}
				break;
							
		}
		
	}
		return stack.isEmpty();

  }
}