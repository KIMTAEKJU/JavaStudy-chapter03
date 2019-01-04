package chapter03;

public class Rect 
{
	private int width, height;
	
	public Rect(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height * width;
		//result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rect other = (Rect) obj;
//		if (height != other.height)
//			return false;
//		if (width != other.width)
//			return false;
		
		if (height * width != other.height * other.width)
			return false;
		return true;
	}
	
	
}