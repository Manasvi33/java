class Cal
{
int b,h;
float final pi=3.14f;
int r;
float area;
double area;

public void tri()
{
	area=0.5*b*h;
}

public void cir()
{
	area=3.14*r*r;
}
}

class Pr5a
{
	Cal c = new Cal();
	c.b=10;
	c.h=10;
	c.tri();
System.out.println("Area of triangle:" c.area);
	c.r=14;
	c.cir();
System.out.println("Area of circle:" c.area);
}	