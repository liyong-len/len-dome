package workspaces.bridge.shap;/**
 * @className Circle
 * @description Circle
 * @author liyong
 * @date 2021/7/26 16:16
 * @version 1.0
 */

import com.len.blog.workspaces.bridge.pen.DrawAPI;

/**
 * @author liyong
 * @date 2021/07/26  16:16
 */
public class Circle extends ShapeAbstract {
    private int radius;

    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(this.radius, 0, 0);
    }
}
