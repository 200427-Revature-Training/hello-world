package com.revature.main;

/**
 * Java is a memory managed language.  This is as opposed to some lower level 
 * languages like C or C++, which are not memory managed. When a variable created
 * memory is automatically allocated.  When variables fall completely out of scope
 * (they are no longer accessible from any accessible scope) then they become 
 * available for garbage collection. Garbage Collection is a JVM process that 
 * deallocated memory from an application that is available for garbage collection.
 * 
 * Generally, you do not have control over the GC process, Java will run it when
 * it decides to be run. You can request GC to run by calling System.gc(). Generally,
 * this will result in GC running, but it is not guaranteed by the Java API and
 * you're likely to lose efficiency by doing it.  Don't do it, let Java manage
 * its memory.
 *
 * GC is a mostly opaque operation that you don't see happening and shouldn't
 * try to involve yourself with.  GC running may result in higher CPU usage
 * temporarily.
 * 
 * To demonstrate GC running, we will override the object classes finalize() function.
 * This function is a function that *may* be called when GC collects the object. 
 * Finalize is not always reliable and you should probably avoid using it for any 
 * business need.
 */
public class GarbageCollection {
	public static void main(String[] args) {
		for(int i = 0; i < 100_000_000; i++) {
			new Garbage();
		}
	}
}

class Garbage {
	static int collectionCount = 0;
	int myInt = 27;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected: " + ++collectionCount);
		super.finalize();
	}
}

