package workspaces.bridge;

import com.len.blog.workspaces.bridge.pen.BulePen;
import com.len.blog.workspaces.bridge.pen.RedPen;
import com.len.blog.workspaces.bridge.shap.Circle;
import com.len.blog.workspaces.bridge.shap.Rectang;
import com.len.blog.workspaces.bridge.shap.ShapeAbstract;

/**
 * @author liyong
 * @version 1.0
 * @className BridgeMain
 * @description BridgeMain
 * @date 2021/7/26 16:21
 */
public class BridgeMain {
    public static void main(String[] args) {
        ShapeAbstract circle = new Circle(5, new RedPen());
        ShapeAbstract rectang = new Rectang(5, 6, new BulePen());
        circle.draw();
        System.out.println("_____________________________________");
        rectang.draw();
    }
}
