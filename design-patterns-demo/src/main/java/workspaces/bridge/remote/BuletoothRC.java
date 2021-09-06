package workspaces.bridge.remote;

import com.len.blog.workspaces.bridge.device.DeviceInterface;

/**
 * @author liyong
 * @version 1.0
 * @className BuletoothRC
 * @description BuletoothRC
 * @date 2021/7/26 17:14
 */
public class BuletoothRC extends RemoteControlAbstract {


    public BuletoothRC(DeviceInterface deviceInterface) {
        super(deviceInterface);
        System.out.println("连接蓝牙.....");
    }
}
