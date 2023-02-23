//package lizp.template;

import processing.core.PApplet;
import processing.core.PFont;
import processing.data.Table;

public class MagicType extends PApplet {
    processing.data.Table table;

    public static void main(String[] args) {
        MagicType mt = new MagicType();
//        PApplet.runSketch(new String[]{"IDE-use", "hello"}, mt);
        PApplet.main("MagicType");
    }

    //    @Override
    public  int width = 2500;  //2560x1440
    public  int height = 1250;
    //globle var
    int x = width/2;
    int y = height/2;
    int speed = 5;


    @Override
    public void settings() {
        size(width,height);

//        fullScreen(); //默认当前显示屏全屏
//        多屏 当电脑连接有多个显示器（例如投影）时，如何指定在某个屏幕上显示。
//        fullScreen(display);  //display = 显示屏序号
//        跨屏 等同于把多个屏幕拼接在一起当成一个加宽的屏幕使用。macOS 系统要关掉“显示器具有单独的 Spaces”，在「系统偏好设置」 -> 「Mission Control」里设置。
//        fullScreen(SPAN);

    }

    @Override
    public void draw() {
        PFont mono;
        mono = createFont("courbd.ttf", 60);
        background(0);
        textFont(mono);

        background(0);
        smooth();
        noStroke();
        frameRate(5);
        textAlign(CENTER);
        rectMode(CENTER);
        ellipseMode(CENTER);

        fill(0, 208, 312, 104);
        rect(x,y,25,25,2);
        fill(0, 408, 612, 104);
        text("word", x+100, y+100);


    }

    @Override
    public void keyPressed() {      // 键盘按压事件
        if (key == CODED) {
            if (keyCode == UP) {
                y = y - speed;
            }
            if (keyCode == DOWN) {
                y = y + speed;
            }
            if (keyCode == LEFT) {
                x = x - speed;
            }
            if (keyCode == RIGHT) {
                x = x + speed;
            }
        }
    }

    @Override
    public void keyTyped() {      //键盘敲击事件
    }

}
//*/
/*/多个按键触发测试
 IntList pkeys = new IntList(); //这个是用来堆栈的可变长度int型列表
        void setup(){
        size(400,300);
        background(255);
        }
        void draw(){
        printkey();
        //println(pkeys);
        }

        void keyPressed() {
        //当有新键被按下时在栈顶加入该键值
        if(!pkeys.hasValue(int(key)))
        pkeys.append(int(key));
        }

        void keyReleased() {
        for(int i=pkeys.size()-1; i>=0; i--){
        if(pkeys.get(i) == int(key)){
        pkeys.remove(i); //当有键被释放时，到栈中找到该键值，从栈中去掉它
        }
        }
        }

        void printkey(){
        if(pkeys.size()>0){ //当栈的高度不为零时输出栈顶的键值
        print(char(pkeys.get(pkeys.size()-1)));
        }
        }
//*/