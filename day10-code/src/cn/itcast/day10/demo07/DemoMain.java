package cn.itcast.day10.demo07;

public class DemoMain {
    // 创建一个笔记本电脑
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标
        // 首先进行向上转型
        USB usbMouse =new Mouse();
        // 参数是USB类型，我正好传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard();


        computer.powerOff();
    }
}

