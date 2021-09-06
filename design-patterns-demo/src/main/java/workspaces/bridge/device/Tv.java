package workspaces.bridge.device;/**
 * @className Tv
 * @description Tv
 * @author liyong
 * @date 2021/7/26 16:52
 * @version 1.0
 */

/**
 * @author liyong
 * @date 2021/07/26  16:52
 */
public class Tv implements DeviceInterface {
    private boolean power;
    private int volume;
    private int channel;

    @Override
    public void enable() {
        this.power = true;
        System.out.println("Tv:开机");
    }

    @Override
    public void disable() {
        this.power = false;
        System.out.println("Tv:关机");
    }

    @Override
    public boolean powerStatus() {
        return this.power;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int num) {
        this.volume += num;
        System.out.println("音量为：" + this.volume);
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int num) {
        this.channel += num;
        System.out.println("频道号：" + this.channel);
    }
}
