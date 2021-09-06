package workspaces.bridge.pen;

/**
 * @author liyong
 * @version 1.0
 * @className BulePen
 * @description BulePen
 * @date 2021/7/26 16:00
 */

public class BulePen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("蓝色的笔画：" + ",Radius:" + radius + ",X:" + x + ",Y:" + y);
    }
}
