package length;

/**
 * @author Daniel Larsen
 * The Foot class is a subclass of Length and stores lengths in the unit of
 * feet.
 *
 */
public class Foot extends Length{
	//one foot = 0.3048 meters
	public static final double METERS_PER_FOOT = 0.3048;
	
	/**
	 * @param length
	 * Constructor
	 */
	public Foot(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see length.Length#add(length.Length)
	 */
	@Override
	public void add(Length other) {
		double add = this.toMeters() + other.toMeters();
		add = add/METERS_PER_FOOT;
		this.setLength(add);
		
	}

	/* (non-Javadoc)
	 * @see length.Length#getUnit()
	 */
	@Override
	public String getUnit() {
		if (this.getLength()==1.0)
			return "foot";
		return "feet";
	}

	/* (non-Javadoc)
	 * @see length.Length#toMeters()
	 */
	@Override
	public double toMeters() {
		double i = this.getLength();
		i = i * METERS_PER_FOOT;
		return i;
	}
	

}
