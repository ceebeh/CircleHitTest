package circlehittest;

public class PreciseCircleHitTest extends CircleHitTest {
	/*/
	 * @throws IllegalArgumentException | circle == null
	 * @throws IllegalArgumentException | point == null
	 * 
	 * @post | result == (
	 *       |     Math.pow(point.x - circle.center.x, 2) +
	 *       |     Math.pow(point.y - circle.center.y, 2) <
	 *       |     Math.pow(circle.radius, 2)
	 *       | )
	 */
	@Override
	public boolean containsPoint(Circle circle, Point point) {
		if (circle == null)
			throw new IllegalArgumentException("`circle` is null");
		if (point == null)
			throw new IllegalArgumentException("`point` is null");
		
		int x = point.x - circle.center.x;
		int y = point.y - circle.center.y;
		return x * x + y * y < circle.radius * circle.radius;
	}
}
