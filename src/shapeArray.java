public class shapeArray
{
    // main method
    
	public static void main(String[] args) {

    //  and test all below methods

	shape[] shapeArray = new shape[3];

	shapeArray[0] = new Rectangle(5.5, 6.8);

	shapeArray[1] = new Circle(5.0);

	shapeArray[2] = new Triangle(8.0, 9.5, 6.9);

	for(int i=0;i<3;i++)

	System.out.println(shapeArray[i].toString());

	}
}


//////////////////////////////////

// abstract class named Shape

abstract class shape {

public abstract double area();

public abstract double perimeter();

}

/////////////////////////////////////

//create a class named Rectangle that extends Shape class

class Rectangle extends shape {

private double length;

private double width;

public Rectangle(double length, double width) {

this.length = length;

this.width = width;

}

@Override

public double area() {

return length * width;

}

@Override

public double perimeter() {

return 2*(length + width);

}

public String toString() {

return "Area : "+area()+" ,Perimeter :"+perimeter();

}

}

/////////////////////////////////////

//create a class named Circle that extends Shape class

class Circle extends shape {

private double radius;

public Circle(double radius) {

this.radius = radius;

}

@Override

public double area() {

return Math.PI * radius * radius;

}

@Override

public double perimeter() {

return 2 * Math.PI * radius;

}

public String toString() {

return "Area : "+area()+" ,Perimeter :"+perimeter();

}
}

/////////////////////////////////////

//create a class named Triangle that extends Shape class


class Triangle extends shape {

private double length1;

private double length2;

private double length3;

public Triangle(double length1, double length2, double length3) {

this.length1 = length1;

this.length2 = length2;

this.length3 = length2;

}

@Override

public double perimeter() {

return length1 + length2 + length3;

}

@Override

public double area() {

double p = (perimeter() / 2);

return Math.sqrt(p * ((p-length1) * (p - length2) * (p - length3)));

}

public String toString() {

return "Area : "+area()+" ,Perimeter :"+perimeter();

}

}