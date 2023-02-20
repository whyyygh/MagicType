//package lizp.template;

import processing.core.PApplet;
import processing.data.Table;

public class MagicType extends PApplet {
    processing.data.Table table;

    public static void main(String[] args) {
        MagicType mt = new MagicType();
        PApplet.runSketch(new String[]{"IDE-use", "hello"}, mt);
    }

    @Override
    public void settings() {
        size(500,500);
//        fullScreen(); //默认当前显示屏全屏
//        多屏 当电脑连接有多个显示器（例如投影）时，如何指定在某个屏幕上显示。
//        fullScreen(display);  //display = 显示屏序号
//        跨屏 等同于把多个屏幕拼接在一起当成一个加宽的屏幕使用。macOS 系统要关掉“显示器具有单独的 Spaces”，在「系统偏好设置」 -> 「Mission Control」里设置。
//        fullScreen(SPAN);

    }

    @Override
    public void draw() {
        background(0);
        smooth();
        noStroke();
        frameRate(10);
        textAlign(CENTER);
        rectMode(CENTER);
        ellipseMode(CENTER);
    }
}