import java.util.HashMap;

/**
 * @author culv3r
 *
 * @param <K>
 * @param <V>
 * 
 * DualHashMap maintains dually unique key and values and allows for reverse lookup.
 */
public class DualHashMap<K, V> implements DualMap<K,V> {

	private HashMap<K,V> keys;
	private HashMap<V,K> values;
	
	/**
	 * Constructor for DualHashMap. Initializes generic types for hashmaps.
	 */
	public DualHashMap(){
		keys = new HashMap<K,V>();
		values = new HashMap<V,K>();
	}
	
	/* (non-Javadoc)
	 * @see DualMap#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void put(K key, V value) {		
		
		if (keys.containsKey(key)){
			remove(key, get(key));
		}
		
		if (keys.containsValue(value)){
			remove(reverseGet(value), value);
		}
		
		keys.put(key, value);
		values.put(value, key);

	}

	/* (non-Javadoc)
	 * @see DualMap#remove(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void remove(K key, V value) {
		keys.remove(key,value);
		values.remove(value,key);
	}

	/* (non-Javadoc)
	 * @see DualMap#get(java.lang.Object)
	 */
	@Override
	public V get(K key) {
		return keys.get(key);
	}

	/* (non-Javadoc)
	 * @see DualMap#reverseGet(java.lang.Object)
	 */
	@Override
	public K reverseGet(V value) {
		return values.get(value);
	}

}
