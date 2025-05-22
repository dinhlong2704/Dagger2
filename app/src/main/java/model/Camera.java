package model;

import android.util.Log;

public class Camera {
    int pixels;
    //giả sử không thể inject trực tiếp qua constructor (do là thư viện bên thứ ba)
    public Camera(int pixels) {
        this.pixels = pixels;
        Log.i("MyMobile", "Camera: created with " + pixels + " megapixels");
    }
}
