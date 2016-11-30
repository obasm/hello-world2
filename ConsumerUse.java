package javapgm;

import java.util.stream.Stream;
import java.util.function.Consumer; 

class ConsumerUse {   
    public static void main(String []args) {
	Stream<String> strings = Stream.of("hello", "world"); 
        Consumer<String> printString = System.out::println;	
	strings.forEach(printString);
    }
}