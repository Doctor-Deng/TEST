package day03;
/*
1. 定义类 Test6
2. 定义 main方法
3. 定义字符串遍历 str,赋值为J
4. 使用for循环,初始化变量i = 0,如果i<5进入循环,步进表达式i++
5. for循环内部,嵌套定义变量key ,赋值为i%3;
6. 定义switch语句 ,表达式为key.
7. case 为0时,str拼接字符'a',i++后,break
8. case 为2时,str拼接字符'V'
9. 循环结束后,输出str
 */
public class Test06 {
    public static void main(String[] args){
        //定义字符串遍历str，并赋值为J
        String str = "j";
        //使用for循环，定义变量i并赋值为0，如果i<5,进入循环。步进表达式为i++
        for (int i = 0; i< 5; i++){
            //for循环内部，嵌套定义变量key，并赋值为 i % 3
            int key = i % 3;
            //定义swtich语句，表达式为key
            switch(key){
                //当key的值为0时，str拼接字符a,i++后，break;
                case 0:
                    str = str + 'a';
                    i++;
                    break;
                    //当key的值为2时，str拼接字符V
                case 2:
                    str = str + 'V';
                    break;
            }
        }
        //循环结束后，输出str的值
        System.out.println("str的值为：" + str);
    }
}