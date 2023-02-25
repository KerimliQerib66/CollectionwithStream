package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(8);
        numbers.add(6);
        List<String> names=new ArrayList<>();
        names.add("Qarib");
        names.add("Serxan");
        names.add("Murad");
        names.add("Orxan");
        names.add("Xeyal");
        names.add("Ayxan");
        
        
        //allmatch metodu
        boolean status=numbers.stream().allMatch(x-> x%2==0);
        System.out.println(status);
        
        //anymatch metodu
        boolean status1=numbers.stream().anyMatch(x->x==2);
        System.out.println(status1);
        
        //collect ve map metodu
        List<Integer> list=numbers.stream().map(x->x*2+1).collect(Collectors.toList());
        System.out.println(list);
        
        //count metodu
       long i= numbers.stream().count();
	   System.out.println(i);
	   
	   //distinct metodu
	   List<Integer> distinctlist=numbers.stream().distinct().collect(Collectors.toList());
	   System.out.println(distinctlist);
	   
	   //filter metodu
	   List<String> filteredlist=names.stream().filter(x->x.contains("Q")).collect(Collectors.toList());
	   System.out.println(filteredlist);
	   
	   //foreach metodu
	   numbers.stream().forEach(s->System.out.println("foreach s: " + s));
	   names.stream().forEach(System.out::println);
	   
	   
	   //peek metodu
	   numbers.stream().peek(s->System.out.println("peek s :"+s)); //check edir qeyd aparir yazdirmir yeni
	   
	   
	   //limit ve iterate metodu 
	   List<Integer> listit = Stream.iterate(10, x->x+1).filter(x->x>40).limit(5).collect(Collectors.toList());
	   System.out.println(listit);
	   
	   
	   //generate metodu iterate metodunun araliqsiz halidir
	   Random r=new Random();
	   List<Integer> listgen=Stream.generate(()->r.nextInt(100)).limit(12).collect(Collectors.toList());
	   System.out.println(listgen);
	}

}
