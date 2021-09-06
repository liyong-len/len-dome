package workspaces.adapter;

/**
 * @author liyong
 * @version 1.0
 * @className TestMian
 * @description TestMian
 * @date 2021/7/26 11:13
 */
public class TestMain {

    public static void main(String[] args) {

        Train train = new TrainAdapter(new Car("路面"));
        train.run();
    }
}
