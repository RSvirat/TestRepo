package com.su;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.su.model.Movie;

public class App {

	public static void main(String args[]) {
		String a[] = new String[] {"apple","banana","orange","apple","banana","apple"};
		List<String> list = Arrays.asList(a);
		Set<String> items = new HashSet<>();
		Set<String> item = list.stream().filter(n -> items.add(n)).collect(Collectors.toSet());
		Set<String> uniqueItem = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(e -> e.getKey())
				.collect(Collectors.toSet());
		Map<String, Long> duplicateCount = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(item);
		System.out.println(uniqueItem);
		System.out.println(duplicateCount); 
	}
}