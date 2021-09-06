package workspaces.bridge.shap;

import com.len.blog.workspaces.bridge.pen.DrawAPI;

/**
 * @author liyong
 * @version 1.0
 * @className ShapeAbstract
 * @description ShapeAbstract
 * @date 2021/7/26 16:13
 */

public abstract class ShapeAbstract {
    protected DrawAPI drawAPI;

    protected ShapeAbstract(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
