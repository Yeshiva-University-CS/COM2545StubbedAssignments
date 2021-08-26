package edu.yu.introtoalgs;

public class IntersectRectangles {

  /** This constant represents the fact that two rectangles don't intersect.
   *
   * @see #intersectRectangle
   * @warn you may not modify this constant in any way
   */
  public final static Rectangle NO_INTERSECTION =
    new Rectangle(0, 0, -1, -1);

  /** An immutable class that represents a 2D Rectangle.
   *
   * @warn you may not modify the instance variables in any way, you are
   * encouraged to add to the current set of variables and methods as you feel
   * necesssary.
   */
  public static class Rectangle {
    // safe to make instance variables public because they are final, now no
    // need to make getters
    public final int x;
    public final int y;
    public final int width;
    public final int height;

    /** Constructor: see the requirements doc for the precise semantics.
     *
     * @warn you may not modify the currently defined semantics in any way, you
     * may add more code if you so choose.
     */
    public Rectangle
      (final int x, final int y, final int width, final int height)
    {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
    }
  }

  /** If the two rectangles intersect, returns the rectangle formed by their
   * intersection; otherwise, returns the NO_INTERSECTION Rectangle constant.
   *
   * @param r1 one rectangle
   * @param r2 the other rectangle
   * @param a rectangle representing the intersection of the input parameters
   * if they intersect, NO_INTERSECTION otherwise.  See the requirements doc
   * for precise definition of "rectangle intersection"
   * @throws IllegalArgumentException if either parameter is null.
   */
  public static Rectangle intersect (final Rectangle r1, final Rectangle r2)
  {
    return null;
    // supply a more useful implementation!
  }

} // class

