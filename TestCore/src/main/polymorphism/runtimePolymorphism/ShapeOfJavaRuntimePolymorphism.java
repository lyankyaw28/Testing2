package main.polymorphism.runtimePolymorphism;

class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw(int i) {
		System.out.println("drawing rectangle..."+i);
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class ShapeOfJavaRuntimePolymorphism {
	public static void main(String args[]) {
		Shape s;
		s = new Rectangle();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}
