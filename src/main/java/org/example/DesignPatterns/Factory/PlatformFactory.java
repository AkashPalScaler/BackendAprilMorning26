package org.example.DesignPatterns.Factory;

public class PlatformFactory {
     static Platform getPlatform(String platform){
        if(platform == "IOS"){
            return new IOSPlatform();
        }else if (platform == "Android"){
            return new AndroidPlatform();
        }else{
            throw new RuntimeException("Invalid platform name");
        }
    }
}
