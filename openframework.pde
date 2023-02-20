
//	项目名：
//	作者：
//	日期：
//	注释：

/*
//	配置（初始化，导入库文件，定义变量）
 */



void setup() {
  size(500, 500);		//定义画布大小
  frameRate(60);		//定义帧速率
  smooth();			//定义平滑等级（默认2）
}

/*
//更新数据（更新变量数值）
 */
void update()
{
}

/*
//更新图像（更新画布内容，重新绘画）
 */
void Display()
{
  //background(0);  //刷新画布，填充底色
}


/*
//	循环执行！包含了 【更新数据】 和 【更新图像】
 */
void draw() {

  //更新数据（更新变量数值）
  update();

  //更新图像（更新画布内容，重新绘画）
  Display();
}

void mousePressed() {      //鼠标按压事件
}

void mouseReleased() {    //鼠标松开事件
}

void mouseMoved() {      //鼠标移动事件
}

void mouseDragged() {    //鼠标拖拽事件
}

void mouseClicked() {      //鼠标点击事件
}

void mouseWheel() {      //鼠标滚动事件
}

void keyPressed() {      // 键盘按压事件
}

void keyReleased() {     // 键盘松开事件
}

void keyTyped() {      //键盘敲击事件
}