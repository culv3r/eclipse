package length;

/**
 * @author Daniel Larsen
 * The Meter class is a subclass of Length and is the chosen metric by which
 * the rest of the length objects are converted.
 */
public class Meter extends Length {

	/**
	 * @param length
	 * Constructor, creates Meter object.
	 */
	public Meter(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see length.Length#add(length.Length)
	 */
	@Override
	public void add(Length other) {
		double add = this.getLength() + other.toMeters();
		this.setLength(add);
	}

	/* (non-Javadoc)
	 * @see length.Length#getUnit()
	 */
	@Override
	public String getUnit() {
		if (this.getLength()==1.0)
			return "meter";
		return "meters";
	}

	/* (non-Javadoc)
	 * @see length.Length#toMeters()
	 */
	@Override
	public double toMeters() {
		return this.getLength();
	}

	
}
