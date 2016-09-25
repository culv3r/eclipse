package length;

/**
 * @author Daniel Larsen
 * The Yard class is a subclass of Length and stores lengths in the unit of
 * yards.
 *
 */
public class Yard extends Length{
	//One yard = 0.9144 meters
	public static final double METERS_PER_YARD = 0.9144;
	
	/**
	 * @param length
	 * constructor
	 */
	public Yard(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see length.Length#add(length.Length)
	 */
	@Override
	public void add(Length other) {
		double add = this.toMeters() + other.toMeters();
		add = add/METERS_PER_YARD;
		this.setLength(add);
		
	}

	/* (non-Javadoc)
	 * @see length.Length#getUnit()
	 */
	@Override
	public String getUnit() {
		if (this.getLength()==1.0)
			return "yard";
		return "yards";
	}

	/* (non-Javadoc)
	 * @see length.Length#toMeters()
	 */
	@Override
	public double toMeters() {
		double i = this.getLength();
		i = i * METERS_PER_YARD;
		return i;
	}

	
}
