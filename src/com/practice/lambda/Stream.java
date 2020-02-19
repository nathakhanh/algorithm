package com.practice.lambda;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	
	public static void main(String[] args) {
		List<Long> list = Arrays.asList(1l,2l,3l);
		long count = list.stream().distinct().count();
		System.out.println(count);
		
		List<String> list2 = Arrays.asList("a","b", "c");
		boolean isExist = list2.stream().anyMatch(each -> each.contains("a"));
		System.out.println(isExist);
		List<String> list3 = list2.stream().filter(each -> each.contains("b")).collect(Collectors.toList());
		System.out.println(list3);
		
		List<String> uris = Arrays.asList("path1");
		List<Path> path_uris = uris.stream().map(each -> Paths.get(each)).collect(Collectors.toList());
		System.out.println(path_uris);
		
		List<List<String>> uris2 = Arrays.asList(Arrays.asList("path1"), Arrays.asList("path2"));
		List<String> paths = uris2.stream().flatMap(each -> each.stream().filter(path -> path.contains("1"))).collect(Collectors.toList());
		System.out.println(paths);
		
		uris2.stream().flatMap(each -> each.stream().filter(path -> path.contains("1"))).forEach(each -> System.out.println(each));
		
		String[] inputs = {"tom", "joe", "mat"};
		String[] outputs = Arrays.stream(inputs).filter(each -> each.contains("oe")).toArray(String[]::new);
		System.out.println(outputs);
		
		Integer[] n = {1,2,3,4,5};
		Integer[] result = Arrays.stream(n).map(each -> each * 2).toArray(Integer[]::new);
		
		int[] result2 = Arrays.stream(n).mapToInt(each -> each * 2).toArray();
		System.out.println(result2);
		
		
		
	}
}
