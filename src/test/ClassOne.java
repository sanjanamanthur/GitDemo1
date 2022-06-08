package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassOne {
	// @Test
	public void Demo() {
		ArrayList<String> names = new ArrayList();
		names.add("Sanjana");
		names.add("Sanju");
		names.add("munna");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("S")) {
				count++;
			}
		}
		System.out.println(count);
	}

	//@Test
	public void JavaStreams() {
		ArrayList<String> names = new ArrayList();
		names.add("Sanjana");
		names.add("Sanju");
		names.add("munna");
		names.add("Anil");
		long count = names.stream().filter(s -> s.startsWith("S")).count();
		System.out.println(count);
		// direactly creating a stream
		
		Stream.of("Tony", "John", "peter").filter(s->
		{
			s.startsWith("S");
			return true;
		}).count();
		
		//print all names with more than 4 char
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
	}
	
	//@Test
	public void streamMap() {
		//print names of length>4 by converting them to Uppercase
		Stream.of("Tony", "John", "peter", "Tom").filter(s->s.length()>3).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream.of("Tony", "John", "peter", "Tom").filter(s->s.length()>3).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream.of("Zo","pat", "Tony", "John", "peter", "Tom").sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	//@Test
	public void CombineList ()
	{
		
		ArrayList<String> names = new ArrayList();
		names.add("Sanjana");
		names.add("Sanju");
		names.add("munna");
		names.add("Anil");
		
		ArrayList<String> names1 = new ArrayList();
		names.add("Cherry");
		names.add("Ranesh");
		names.add("Viggi");
		names.add("Varsha");
		//Merging two Lists
		
		Stream<String> newstream=Stream.concat(names.stream(), names1.stream());
		//newstream.forEach(s->System.out.println(s));
		boolean result=	newstream.anyMatch(s->s.equalsIgnoreCase("Vigkgi"));
		System.out.println(result);
		Assert.assertTrue(result); //failed test
	}
	
	@Test
	public void CollectAndCreateList() {
		List<String> newList=Stream.of("Tony", "John", "peter", "Tom").filter(s->s.length()>3).map(s->s.toUpperCase()).collect(Collectors.toList());

		List<Integer> num=Arrays.asList(3,4,5,3,5,3,8,9);
		num.stream().distinct().forEach(s->System.out.println(s));  //to get unique elements
		List<Integer> indexnum=num.stream().distinct().sorted().collect(Collectors.toList());  //to get num at specific index
		System.out.println(indexnum.get(3));
		
	}
	
	
}
