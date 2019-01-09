package com.inxedu.os;

import org.apache.commons.codec.binary.Hex;

public class Test1
{

}

interface CallBack {

    public void callBack();
}

class Teach implements CallBack{

    private Student s;
    public Teach(Student s){
        this.s = s;
    }

    public void askQuestion(){
        System.out.println("老师问问题");
        s.question(this);
    }

    @Override
    public void callBack() {

        System.out.println("这是回调方法，问题回答完毕");
        //s.question(this);
    }
}
class Student{

    public void question(CallBack c){
        System.out.println("学生回答问题。。。");
        c.callBack();
    }
    public static void main(String[] args) {
        Student student = new Student();
        Teach teach = new Teach(student);
        teach.askQuestion();

    }
}
