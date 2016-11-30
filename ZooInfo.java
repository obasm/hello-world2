/**
 * ZooInfo.java
 * Author: Makli Obas
 * Written: Aug-2016
 * Function: To show that In Single-Thread Executor, the results are guaranteed to be executed
 *           in the order in which they are added to the executor service
 * 
 * Programs written Inspired from the book:
 * OCP Oracle certified Professional Java SE 8 Programmer 2 by Sybex
 * Page 335, 336
 */
package javapgm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		System.out.println("Begin");
		executorService.execute(() -> System.out
				.println("Printing zoo inventory"));
		executorService.execute(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Printing record: " + i);
			}
		});

		System.out.println("End");
		executorService.shutdown();
	}
}
