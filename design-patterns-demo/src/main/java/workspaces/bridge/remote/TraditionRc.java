package workspaces.bridge.remote;/**
 * @className TraditionRc
 * @description TraditionRc
 * @author liyong
 * @date 2021/7/26 17:17
 * @version 1.0
 */

import com.len.blog.workspaces.bridge.device.DeviceInterface;

/**
 * @author liyong
 * @date 2021/07/26  17:17
 */
public class TraditionRc extends RemoteControlAbstract {

    public TraditionRc(DeviceInterface device) {
        super(device);
        System.out.println("放置电池");
    }
}
