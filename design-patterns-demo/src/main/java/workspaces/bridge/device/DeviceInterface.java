package workspaces.bridge.device;

/**
 * @author liyong
 * @version 1.0
 * @className DeviceInterface
 * @description DeviceInterface
 * @date 2021/7/26 16:48
 */

public interface DeviceInterface {

    void enable();

    void disable();

    boolean powerStatus();

    int getVolume();

    void setVolume(int num);

    int getChannel();

    void setChannel(int num);
}
