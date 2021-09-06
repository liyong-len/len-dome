package workspaces.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liyong
 * @version 1.0
 * @className Car
 * @description Car
 * @date 2021/7/26 11:02
 */
@Data
@AllArgsConstructor
public class Car implements TransportationInterface {

    private String drivingType;

    @Override
    public void run() {
        System.out.println("汽车跑起来了");
    }
}
