package day06;

public class Person {

        String name;
        private int age;

        public void show(){
            System.out.println("我叫：" + name + ", 年龄 ：" + age );
        }

        public void setAge(int num){
            if (num < 0 && num > 120) {
                System.out.println("年龄数字不合理错误");
            }else
                age = num;
        }

        public int getAge(){
            return age;
        }
    }
