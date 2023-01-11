public class Rectangle extends Shape
{
	private int height;
	private int width;

	public int getHeight()
	{
		return this.height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getWidth()
	{
		return this.width;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getArea()
	{
		return this.height * this.width;
	}

	public int getPerimeter()
	{
		return 2 * this.height + 2 * this.width;
	}

	public Rectangle(int height, int width)
	{
		this.height = height;
		this.width = width;
	}
}