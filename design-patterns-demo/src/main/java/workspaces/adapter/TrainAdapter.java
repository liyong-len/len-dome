package workspaces.adapter;/**
 * @className TrainAdapter
 * @description TrainAdapter
 * @author liyong
 * @date 2021/7/26 11:06
 * @version 1.0
 */

/**
 * @author liyong
 * @date 2021/07/26  11:06
 */
public class TrainAdapter extends Train {

    private Car car;

    public TrainAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        System.out.println("识别原有行驶方式：" + car.getDrivingType());
        System.out.println("开始适配");
        car.run();
    }
}
