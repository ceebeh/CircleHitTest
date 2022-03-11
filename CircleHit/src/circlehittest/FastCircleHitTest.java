package circlehittest;

public class FastCircleHitTest extends CircleHitTest {
	/*/
	 * @pre | circle != null
	 * @pre | point != null
	 * 
	 * @post | result == (
	 *       |     Math.abs(circle.center.x - point.x) < circle.radius &&
	 *		 |     Math.abs(circle.center.y - point.y) < circle.radius
	 *		 | )
	 */
	@Override
	public boolean containsPoint(Circle circle, Point point) {
		assert circle != null;
		assert point != null;
		
		return Math.abs(circle.center.x - point.x) < circle.radius && Math.abs(circle.center.y - point.y) < circle.radius;
	}
}
