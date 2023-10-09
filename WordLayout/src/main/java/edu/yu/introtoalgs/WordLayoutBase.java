package edu.yu.introtoalgs;

/** Defines the API for the WordLayout assignment: see the requirements
 * document for more information.
 *
 * Students MAY NOT change, or add to, the APIs below.  My test code will
 * only invoke the API defined below.
 *
 * @author Avraham Leff
 */

import java.util.List;
import java.util.Random;

public abstract class WordLayoutBase {

  /** Defines the API for Location.  Students may NOT add a constructor
   * signature or otherwise modify the API.  Students may choose to extend this
   * class in their implementation, but my test code will only invoke methods
   * that are are implicitly or explicitly defined by the API below.
   *
   * NOTE: although I will not be explicitly creating instances of this class
   * (no WordLayout API to do so), you will be returning instances of this
   * class through the WordLayout API.  Consider the implications carefully.
   *
   * @see WordLayoutBase#locations
   */
  public static class LocationBase {
		public LocationBase(int row, int column) {
      assert row >= 0 : "row must be >= 0: "+row;
      assert column >= 0 : "column must be >= 0: "+column;      
			this.row = row;
			this.column = column;
		}

    // this method override may NOT be changed in student implementation
    @Override
    public String toString() {
      return "("+row+","+column+")";
    }
    
    // deliberately public for convenience, safe to do so because "final".
		public final int row, column;
  } // class LocationBase


  /** This is mostly a class that I'm providing for your convenience to guide
   * you in your encapsulation of the WordLayout Grid.  That said, keep in mind
   * that you will be returning instances of this class in your solution.
   *
   * Students may NOT change the constructor signature and implementation nor
   * may they change the toString() implementation.
   *
   * @see WordLayoutBase#getGrid
   */
  public static class Grid {
    Grid(final int rows, final int columns) {
      this.rows = rows;
      this.columns = columns;
      grid = new char[rows][columns];

      // initialize grid with random letters
      Random random = new Random();
      for (int row = 0; row < rows; row++) {
        for (int column = 0; column < columns; column++) {
          char randomLetter = (char) (random.nextInt(ALPHABET_LENGTH) + FIRST_LETTER);
          grid[row][column] = randomLetter;
        }
      }
    } // constructor
    
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(System.lineSeparator());
      for (int column=0; column<columns; column++) {
        sb.append (column);
        sb.append (' ');
      }
      sb.append(System.lineSeparator());

      for (char[] rowArray : grid) {
        for (char c: rowArray) {
          sb.append(c);
          sb.append(' ');
        }
        sb.append(System.lineSeparator());
      }
      return sb.toString();
    }


    private final char ALPHABET_LENGTH = 26;
    private final char FIRST_LETTER = 'A';
    private final int rows, columns;
    // @fixme? deliberately not private for easier internal access
    public final char[][] grid;
  }   // static class Grid

  /** Creates a grid with the specified number of rows and columns such that
   * every one of the supplied words are successfully layed out on the grid.
   * Conceptually, a Grid instance is created (with random letters assigned to
   * all Grid locations), and then overlayed with the list of words to create a
   * valid layout.  The rules for a valid layout are specified in the
   * requirements document.
   *
   * @param nRows number of rows in 0..n-1 representation, must be a
   * non-negative integer.
   * @param nColumns number of columns in 0..n-1 representation, must be a
   * non-negative integer.
   * @param words a non-null, non-empty list of words.  Client maintains ownership.
   * @throws IllegalArgumentException if it's impossible to layout the words in
   * the specified grid or if the supplied parameters violate the specified
   * requirements.
   */
  public WordLayoutBase (final int nRows, final int nColumns, final List<String> words) {
    // no-op implementation, supply content in your WordLayout implementation
  }
  
  /** Returns the grid locations that specify how a word is layed out on the
   * grid.  The locations must be sorted in ascending row coordinate, breaking
   * ties if necessary, by sorting in ascending column coordinate.
   *
   * @return List of locations that specify how the word is layed out on the
   * grid.
   * @throws IllegalArgumentException if the word is not an element of the List
   * supplied in the constructor.
   */
  public abstract List<LocationBase> locations(final String word);

  /** Returns the Grid after it has been filled in with all words
   *
   * @returns Grid instance.
   */
  public abstract Grid getGrid();

} // class WordLayoutBase
