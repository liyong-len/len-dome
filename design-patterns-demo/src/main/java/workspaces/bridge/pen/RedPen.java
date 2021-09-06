package workspaces.bridge.pen;

/**
 * @author liyong
 * @version 1.0
 * @className RedPen
 * @description RedPen
 * @date 2021/7/26 16:00
 */
public class RedPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("红色的笔画：" + ",Radius:" + radius + ",X:" + x + ",Y:" + y);
    }
}
