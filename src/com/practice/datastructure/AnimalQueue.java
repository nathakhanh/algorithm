package com.practice.datastructure;

import java.util.LinkedList;

public class AnimalQueue {
	LinkedList<Dog> dogs = new LinkedList<>();
	LinkedList<Cat> cats = new LinkedList<>();
	private int order;
	
	public void enqueue(Animal animal) {
		animal.setOrder(order);
		order++;
		if (animal instanceof Dog) {
			dogs.add((Dog) animal);
		} else if (animal instanceof Cat) {
			cats.add((Cat) animal);
		}
	}
	
	public Animal dequeueAny() {
		if (dogs.size() == 0 && cats.size() == 0) {
			return null;
		} else if (dogs.size() == 0) {
			return dequeueCat();
		} else if (cats.size() == 0) {
			return dequeueDog();
		} else {
			Dog dog = dogs.peek();
			Cat cat = cats.peek();
			if(dog.isOlderThan(cat)) {
				return dogs.poll();
			} else {
				return cats.poll();
			}
		}
	}
	
	public Dog dequeueDog() {
		return dogs.poll();
	}
	
	public Cat dequeueCat() {
		return cats.poll();
	}
}
