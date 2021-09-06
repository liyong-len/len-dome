package workspaces.bridge;

import com.len.blog.workspaces.bridge.device.Tv;
import com.len.blog.workspaces.bridge.remote.BuletoothRC;
import com.len.blog.workspaces.bridge.remote.RemoteControlAbstract;
import com.len.blog.workspaces.bridge.remote.TraditionRc;

/**
 * @author liyong
 * @version 1.0
 * @className DeviceMain
 * @description DeviceMain
 * @date 2021/7/26 17:18
 */

public class DeviceMain {

    public static void main(String[] args) {
        RemoteControlAbstract buletoothRC = new BuletoothRC(new Tv());
        buletoothRC.power();
        buletoothRC.addChannel(1);
        buletoothRC.reduceChannel(1);
        buletoothRC.reduceChannel(1);
        TraditionRc traditionRc = new TraditionRc(new Tv());
        traditionRc.power();
        traditionRc.addChannel(1);
        traditionRc.reduceChannel(1);
        traditionRc.reduceChannel(1);
    }

}
