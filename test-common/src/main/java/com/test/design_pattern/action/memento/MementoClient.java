package com.test.design_pattern.action.memento;

/**
 * Created by wanggy on 2017/10/27.
 *
 * 备忘录模式优点：
         提供了一种状态恢复的实现机制，使得用户可以方便地回到一个特定的历史步骤，当新的状态无效或者存在问题时，可以使用暂时存储起来的备忘录将状态复原。
         实现了对信息的封装，一个备忘录对象是一种原发器对象状态的表示，不会被其他代码所改动。备忘录保存了原发器的状态，采用列表、堆栈等集合来存储备忘录对象可以实现多次撤销操作。

    备忘录模式缺点：
         资源消耗过大，如果需要保存的原发器类的成员变量太多，就不可避免需要占用大量的存储空间，每保存一次对象的状态都需要消耗一定的系统资源。


 */
public class MementoClient {
    public static void main(String[] args) {
        RobotPositionCaretaker caretaker = new RobotPositionCaretaker();
        RobotPosition robot = new RobotPosition("Android", 0, 0);
        robot.drawScreen();
        caretaker.setMemento(robot.save());

        robot.setPos(0, 1);
        robot.drawScreen();
        caretaker.setMemento(robot.save());

        robot.setPos(5, 5);
        robot.drawScreen();

        //back on step
        robot.restore(caretaker.getMemento());
        robot.drawScreen();
        caretaker.setMemento(robot.save());
    }
}
