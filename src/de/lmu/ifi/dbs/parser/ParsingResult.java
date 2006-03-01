package de.lmu.ifi.dbs.parser;

import de.lmu.ifi.dbs.data.DatabaseObject;

import java.util.List;

/**
 * Provides a list of database objects and labels associated with these objects.
 *
 * @author Elke Achtert (<a href="mailto:achtert@dbs.ifi.lmu.de">achtert@dbs.ifi.lmu.de</a>)
 */
public class ParsingResult<O extends DatabaseObject> {
  /**
   * The list of database objects and labels associated with these objects.
   */
  private final List<ObjectAndLabels<O>> objectAndLabelList;

  /**
   * Provides a list of database objects and labels associated with these objects.
   *
   * @param objectAndLabelList the list of database objects and labels associated with these objects
   */
  public ParsingResult(List<ObjectAndLabels<O>> objectAndLabelList) {
    this.objectAndLabelList = objectAndLabelList;
  }

  /**
   * Returns the list of database objects and labels associated with these objects.
   *
   * @return the list of database objects and labels associated with these objects
   */
  public List<ObjectAndLabels<O>> getObjectAndLabelList() {
    return objectAndLabelList;
  }

  /**
   * Returns a string representation of the object.
   *
   * @return a string representation of the object.
   */
  public String toString() {
    return objectAndLabelList.toString();
  }
}
