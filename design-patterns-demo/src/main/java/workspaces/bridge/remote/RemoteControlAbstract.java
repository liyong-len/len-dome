package workspaces.bridge.remote;

import com.len.blog.workspaces.bridge.device.DeviceInterface;

/**
 * @author liyong
 * @version 1.0
 * @className RemoteControlInterface
 * @description RemoteControlInterface
 * @date 2021/7/26 17:02
 */

public abstract class RemoteControlAbstract {

    protected DeviceInterface device;

    public RemoteControlAbstract(DeviceInterface device) {
        this.device = device;
    }

    public void power() {
        if (device.powerStatus()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void addChannel(int num) {
        device.setChannel(device.getChannel() + 1);
    }

    public void reduceChannel(int num) {
        device.setChannel(device.getChannel() - 1);
    }

    public void addVolume(int num) {
        device.setVolume(device.getVolume() + 1);
    }

    public void reduceVolume(int num) {
        device.setVolume(device.getVolume() - 1);
    }
}
