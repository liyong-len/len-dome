package workspaces.bridge.shap;

import com.len.blog.workspaces.bridge.pen.DrawAPI;

/**
 * @author liyong
 * @version 1.0
 * @className Rectang
 * @description Rectang
 * @date 2021/7/26 16:19
 */

public class Rectang extends ShapeAbstract {
    private int x, y;

    public Rectang(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.draw(0, this.x, this.y);
    }
}
