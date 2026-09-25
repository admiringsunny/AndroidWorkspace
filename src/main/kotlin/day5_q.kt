/*
What do you mean by ArrayList is non-synchronized in nature.
When we say ArrayList
	is non-synchronized,
	it means it is not thread-safe.
If multiple threads access an ArrayList
at the same time
and at least one thread modifies it (adds, removes, or updates elements),
the internal state can become corrupted.
This can lead to race conditions, unexpected behavior, or exceptions like ConcurrentModificationException.
Because ArrayList avoids the performance overhead of synchronizing its methods,
it is faster and is the preferred choice for single-threaded operations.

Difference between List and ArrayList
List is an interface, while ArrayList is an implementation class of that interface.
List defines what a collection can do (a contract specifying ordered collection operations like add, remove, get), whereas ArrayList dictates how it is done under the hood using a dynamically resizing array.

Why the indexing start from 0 for an array list
In ArrayList—and zero-indexed languages in general—an index is not a element count; it is a memory offset.
Because an ArrayList is backed by a contiguous block of memory, the index represents how many element positions to shift forward from the starting memory address. The first element resides directly at the start of the array, so its offset distance from the base address is 0.


What is the mechanism of working with a hashset ? Internal working of hashset ?
Internally, a HashSet does not manage its own array. Instead, it is backed by a HashMap instance.
When you add an element to a HashSet, it stores that element as a key in the underlying HashMap, while associating it with a dummy placeholder value. Because HashMap keys must be unique, HashSet achieves its key property: guaranteeing unique elements with O(1) average time complexity for basic operations like add, remove, and contains."



 */