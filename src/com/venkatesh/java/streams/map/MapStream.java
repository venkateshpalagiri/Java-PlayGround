package com.venkatesh.java.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
	
	public void mapStreamForInt() {
		List<Integer> number=Arrays.asList(5,6,3,8);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("Arrays as List: "+number);
		System.out.println("Stream list: "+square);
		
		List<Integer> numAdditon=number.stream().map(x->x+10).collect(Collectors.toList());
		System.out.println("Additon using Streams: "+numAdditon);
	
	}
	
	public void mapStreamForString() {
		List<String> names= new ArrayList<>();
		names.add("john");
		names.add("felix");
		names.add("bill");
		
		List<String> nameStreamed=names.stream().map(x->x.concat("LAST_NAME")).collect(Collectors.toList());
		List<String> nameStreamed2=names.stream().map(x->x.replace('l', 'i')).collect(Collectors.toList());
		System.out.println("Concat names: "+nameStreamed);
		System.out.println("relplace names: "+nameStreamed2);

		
	}

}
