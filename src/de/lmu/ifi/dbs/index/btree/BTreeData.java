package de.lmu.ifi.dbs.index.btree;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/**
 * The class Data represents a data object in a BTree. A data object is pair consisting of a key
 * and a corresponding value.
 *
 * @author Elke Achtert (<a href="mailto:achtert@dbs.ifi.lmu.de">achtert@dbs.ifi.lmu.de</a>)
 */
public class BTreeData<K extends Comparable<K> & Serializable, V extends Serializable> implements Externalizable {
  /**
   * The underlying object.
   */
  V value;

  /**
   * The key of this data object.
   */
  K key;

  /**
   * Creates a new Data object.
   */
  public BTreeData() {
  }

  /**
   * Creates a new Data object.
   *
   * @param key   the key of this data object
   * @param value the underlying object
   */
  public BTreeData(K key, V value) {
    this.key = key;
    this.value = value;
  }

  /**
   * Returns a string representation of this data object.
   *
   * @return a string representation of this data object.
   */
  public String toString() {
    return "" + key;// + " (" + value + ")";
  }

  /**
   * The object implements the writeExternal method to save its contents
   * by calling the methods of DataOutput for its primitive values or
   * calling the writeObject method of ObjectOutput for objects, strings,
   * and arrays.
   *
   * @param out the stream to write the object to
   * @throws java.io.IOException Includes any I/O exceptions that may occur
   * @serialData Overriding methods should use this tag to describe
   * the data layout of this Externalizable object.
   * List the sequence of element types and, if possible,
   * relate the element to a public/protected field and/or
   * method of this Externalizable class.
   */
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(value);
    out.writeObject(key);
  }

  /**
   * The object implements the readExternal method to restore its
   * contents by calling the methods of DataInput for primitive
   * types and readObject for objects, strings and arrays.  The
   * readExternal method must read the values in the same sequence
   * and with the same types as were written by writeExternal.
   *
   * @param in the stream to read data from in order to restore the object
   * @throws java.io.IOException    if I/O errors occur
   * @throws ClassNotFoundException If the class for an object being
   *                                restored cannot be found.
   */
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    value = (V) in.readObject();
    key = (K) in.readObject();
  }
}
