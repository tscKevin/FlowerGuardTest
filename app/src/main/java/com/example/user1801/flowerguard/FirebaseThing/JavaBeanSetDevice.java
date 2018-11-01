package com.example.user1801.flowerguard.firebaseThing;

public class JavaBeanSetDevice {
    String deviceName;
    String deviceKey;
    String module;
    String owner;
    String firebaseUid;

    public JavaBeanSetDevice() {
        super();
    }

    public JavaBeanSetDevice(String deviceName, String deviceKey, String module, String owner, String firebaseUid) {
        this.deviceName = deviceName;
        this.deviceKey = deviceKey;
        this.module = module;
        this.owner = owner;
        this.firebaseUid = firebaseUid;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
