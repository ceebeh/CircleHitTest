package circlehittest;

public abstract class CircleHitTest {
	/*/
	 * @pre | circle != null
	 * @pre | point != null
	 * 
	 * @post | Math.abs(circle.center.x - point.x) < circle.radius &&
	 *		 | Math.abs(circle.center.y - point.y) < circle.radius ?
	 *       |     Math.pow(point.x - circle.center.x, 2) +
	 *       |     Math.pow(point.y - circle.center.y, 2) <
	 *       |     Math.pow(circle.radius, 2) ?
	 *       |         result == true
	 *       |     :
	 *       |         true
	 *       | :
	 *       |     result == false
	 * @post | Math.abs(circle.center.x - point.x) < circle.radius &&
	 *		 | Math.abs(circle.center.y - point.y) < circle.radius ||
	 *       | result == false
	 * @post | !(
	 *       |     Math.pow(point.x - circle.center.x, 2) +
	 *       |     Math.pow(point.y - circle.center.y, 2) <
	 *       |     Math.pow(circle.radius, 2)
	 *       | ) || result == true
	 */
	public abstract boolean containsPoint(Circle circle, Point point);
}
