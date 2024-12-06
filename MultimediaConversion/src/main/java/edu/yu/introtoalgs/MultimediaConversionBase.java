package edu.yu.introtoalgs;

/** The API for the MultimediaConversion problem (see the requirements document
 * for background and details).
 *
 * API usage note: after creating an instance, clients invoke add() N times to
 * specify the available conversion procedures and their duration.  Clients
 * then invoke convert() to specify the desired output formats to which the
 * source format must be converted.  The invocation of convert() returns the
 * duration information for the specified output formats.
 */

import java.util.*;

public abstract class MultimediaConversionBase {

  /** Constructor: client passes the multimedia source format: the one that
   * needs to be converted to other formats
   *
   * @param sourceFormat the multimedia source format, can't be empty
   * @throws IllegalArgumentException as appropriate.
   */
  public MultimediaConversionBase(final String sourceFormat) {
    // no-op in base class
  }

  /** Add a unit of multimedia conversion information: format1 can be converted
   * to format2 (and vice versa) with the process taking the specified
   * duration.  An exception must be thrown if the client attempts to add an
   * conversion specification that has previously been added (even if the
   * duration differs from the previous specification).
   *
   * @param format1 Name of the format1 multimedia format, can't be empty
   * @param format2 Name of the format2 multimedia format, can't be empty
   * @param duration the time (in ms) required to do the format conversion,
   * can't be negative.
   * @throws IllegalArgumentException as appropriate.
   */
  public abstract void add(String format1,  String format2, double duration);

  /** Convert the source format into as many as the specified output formats as
   * possible.  The rules for the conversion are specified in the requirements
   * document.
   *
   * @param outputFormats one or more output formats, each of which must have
   * been been specified as a format in a previously invoked add() invocation.
   * The source format cannot be one of the specified output formats, nor can
   * the outputFormats contain duplicate formats.
   * @return a mapping of each of the specified output formats to the minimal
   * duration required to convert the source format to the output format.  (See
   * the definition of "minimal duration" in the requirements document.) If the
   * source format cannot be converted to an output format, associate the
   * output format with Double.NaN.
   *
   * NOTE: the conversion process can be done through one or more intemediary
   * conversion formats.
   * @throws IllegalArgumentException if the preconditions are violated.
   */
  public abstract Map<String, Double> convert(String... outputFormats);
} // abstract base class  
