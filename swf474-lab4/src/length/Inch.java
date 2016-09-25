package length;

/**
 * @author Daniel Larsen
 * The Inch class is a subclass of Length and stores lengths in the unit of
 * inches.
 *
 */
public class Inch extends Length{
	//one inch = 0.0254 Meters
	public static final double METERS_PER_INCH = 0.0254;
	/**
	 * @param length
	 * Constructor
	 */
	public Inch (double length){
		super(length);
		
	}

	/* (non-Javadoc)
	 * @see length.Length#add(length.Length)
	 */
	@Override
	public void add(Length other) {
		double add = this.toMeters() + other.toMeters();
		add = add/METERS_PER_INCH;
		this.setLength(add);
		
	}

	/* (non-Javadoc)
	 * @see length.Length#getUnit()
	 */
	@Override
	public String getUnit() {
		if (this.getLength()==1.0)
			return "inch";
		return "inches";
	}

	/* (non-Javadoc)
	 * @see length.Length#toMeters()
	 */
	@Override
	public double toMeters() {
		double i = this.getLength();
		i = i * METERS_PER_INCH;
		return i;
	}

}
