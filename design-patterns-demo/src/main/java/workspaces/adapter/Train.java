package workspaces.adapter;

import lombok.Data;

/**
 * @author liyong
 * @version 1.0
 * @className Train
 * @description Train
 * @date 2021/7/26 11:03
 */
@Data
public class Train implements TransportationInterface {
    private String drivingType;

    @Override
    public void run() {
        System.out.println("火车跑起来了");
    }
}
