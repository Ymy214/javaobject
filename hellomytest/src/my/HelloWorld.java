package my;

public class HelloWorld
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		System.out.println("殷名洋，你好");
//		System.out.println("vjhafdjvh");
//		System.out.println("哈手sgdf动阀手fs动阀角gd色的画风gsd八点十分");
//		System.out.println("我今年" + 19 + "岁了");
//		System.out.println("我今年" + 18 + 1 + "岁了");
//		System.out.println("我今年" + (18 + 1) + "岁了");
//		System.out.println("数值："+12345);
//		System.out.println("平方："+(123*123));
//		System.out.println("立方"+(123*123*123));
		
		
		// 这是一行注释内容
		
//		int a = 123;
//		int year = 2017;
//		int money = 2022;
//		int tel = 1234590;
//		int days_of_2017 = 365;
//		System.out.println("a+year*money-tel/18");
//		System.out.println(a+year*money-tel/18);
//		System.out.println(days_of_2017);
		
		// 这是一行注释
		
		
//		int a = 123;
//		int b = a*a;
//		int c = a*a*a;
//		System.out.println("    a:" + a + "    b:" + b + "    c:" + c);
		
		
		// 这是一行注释
		
//		double d = 123.456;
//		double e = -359;
//		System.out.println("d="+d+"   e="+e);
		
		// 这是一行注释
		
//		String name = "殷名洋";
//		System.out.println("名字："+name);
		
//		String name = "小张";
//		int age = 18;
//		double weight = 67.8;
//		String birthday = "1999-02-14";
//		boolean sex = true;
//		System.out.println(name+age+"岁"+weight+"千克"+birthday+"生日");
//		System.out.println("性别为"+sex);
		
		// 布尔类型
//		boolean f = true;
//		boolean g = false;
//		System.out.println(f);
//		System.out.println(g);
		
		// 整形，浮点型运算结果
//		System.out.println("除法结果为：");
//		System.out.println(14/5);	//结果省去小数部分
//		System.out.println(14.0/5);
//		System.out.println(14/5.0);
//		System.out.println(14.0/5.0);
		
		// 关系操作符
//		int h = 10;
//		int i = 4;
//		boolean result = h < i;
//		System.out.println(result);	//输出false
		
		// 逻辑操作符：或：||，与：&&，非：!
//		boolean j = true;
//		boolean k = false;
//		System.out.println(j&&k);
//		System.out.println(j||k);
//		System.out.println(!j&&!k);
//		System.out.println((3 > 4) && (4> 3));
//		System.out.println(3 > 4 || 4 > 3);
//		System.out.println(!(3 > 4));
		
		// 赋值操作符
//		int l = 10;
//		System.out.println("l="+l);
//		l = l + 1;
//		System.out.println("l="+l);
//		
//		int m = 5;
//		l += m;
//		System.out.println(l);
//		l -= m;
//		System.out.println(l);
//		l *= m;
//		System.out.println(l);
//		l /= m;
//		System.out.println(l);
		
		// 自增操作符
//		int n = 5;
//		n++;
//		System.out.println(n);	// 6
//		++n;
//		System.out.println(n);	// 7
		// 后置自增（后自增）
//		int a;
//		int b = 10;
//		a = b++;
//		System.out.println(a + " " + b);
//		// 前置自增（先自增）
//		a = ++b;
//		System.out.println(a + " " + b);
		
		//a=b++;等同于a=b;b++;(推荐)
		
		// 优先级与类型转换
		//终极解决方案：多用小括号
		
		// 语句与单步调试
//		int a = 10;	// 在此设置断点
//		double b = 12.34;
//		a = (int)(b*b);
//		
//		System.out.println("a=" + a);
		
		
		
		// 求圆柱体的底面积 和 体积
		// S = PI * r * r;
		// V = S * h

//		double radius = 1.2; // 底面半径，在此设置断点
//		double h = 4.4; // 高
//
//		// 求底面积
//		double S = 3.1415 * radius * radius;
//
//		// 求体积
//		double V = S * h;
//
//		System.out.println("底面积为: " + S + ", 体积为: " + V);
		
		// if语句-示例代码1
		// 规定小黄车禁止12岁以下的儿童骑行 
//		int age = 10; // 年龄
//		if (age < 12)
//		{
//			System.out.println("未满12岁，不能骑小黄车");
//			System.out.println("杯具");
//		}
//		System.out.println("done.");
		
		// if-else语句-示例代码2
		// 分数小于60分不及格 
//		int score = 77; // 分数
//		if (score < 60)
//		{
//			System.out.println("不及格!得重考啦！");
//		} else
//		{
//			System.out.println("恭喜，通过了！");
//		}
//		System.out.println("done.");
		
		// if-else-示例代码3
		// 根据(beijing)高考加分政策，计算考生的最终得分(最高20分) 
//		int score = 588; // 考生的基础分
//		boolean lieshizinv = false; // 是否烈士子女 +20
//		boolean taiwan = false;// 是否台湾 + 10
//		boolean jianmeicao = true; // 是否健美操二级 +5
//		boolean minority = true; // 是否少数民族 + 5
//		int add = 0; // 总的加分
//		if (lieshizinv)
//		{
//			add += 20;
//		}
//		if (taiwan)
//		{
//			add += 10;
//		}
//		if (jianmeicao)
//		{
//			add += 5;
//		}
//		if (minority)
//		{
//			add += 5;
//		}
//		// 上限控制
//		if (add > 20)
//		{
//			add = 20;
//		}
//		System.out.println("加分值: " + add);
//		score += add;
//		System.out.println("最终得分: " + score);
		
		// for语句基本用法
//		int total = 0;
//		for (int i =1 ; i<=100 ; i++)
//		{
//			total+=i;
//		}
//		System.out.println("结果为："+total);
		
		// 循环计算1-100的平方和
//		int total = 0;
//		int i;
//		for (i = 1; i <= 100; i++)
//		{
//			total += i * i;
//		}
//		System.out.println("结果为：" + total);
		
		// 循环计算1-100以内能被3整除的数（3 6 9 12 。。。）
//		for (int i = 1; i <= 100; i++)
//		{
//			if (i % 3 == 0)
//			{
//				System.out.println("Got:" + i);
//			}
//		}
		
		//for语句的嵌套
		//实例1
//		int nnn = 12;
//
//		if (nnn % 2 == 0)
//		{
//			// nnn为偶数，从小到大输出
//			for (int i = 1; i <= nnn; i++)
//			{
//				System.out.print(i + " ");
//			}
//		} 
//		else
//		{
//			// nnn为奇数，从大到小输出
//			for (int i = nnn; i > 0; i--)
//			{
//				System.out.print(i + " ");
//			}
//		}
		
		//实例2
//		int N = 5;
//		for (int i = 0; i < N; i++) // 循环变量 i
//		{
//			for (int k = 0; k <= i; k++) // 循环变量 k
//			{
//				System.out.print("*");
//			}
//			System.out.print("\n"); // 输出换行
//		}
		
		// 在线题库
		//272.给定一个数a, 如果为奇数则输出“为奇数"  。如果是偶数则输出“为偶数”
//		int a =123;
//		if (a%2==0)
//		{
//			System.out.println("为偶数");
//		}
//		else
//		{
//			System.out.println("为奇数");
//		}
		
		//273.给定一个数，判断它是否既能被3整除，又能被7整除。
//		int a = 123;
//		if(a%3==0&&a%7==0)
//		{
//			System.out.println("OK");
//		}
//		else
//		{
//			System.out.println("NO");
//		}
		
		//274.给定一个数，判断它是否在70和80之间。
//		int a = 123;
//		if(a>70 && a<80)
//		{
//			System.out.println("YES");
//		}
//		else
//		{
//			System.out.println("NO");
//		}
		
		//275.给定一个数，如果它在 [ 10, 20] 之间 ，或者在 [50-60] 之间，则显示 OK。 否则显示错误。
//		int a = 55;
//		if((a>=10&&a<=20) ||(a>=50&&a<=60) )
//		{
//			System.out.println("OK");
//		}
//		else
//		{
//			System.out.println("错误");
//		}
		
		//276.给定一个值 （可正可负) ，显示它的绝对值
//		int a = -98;
//		if(a<0)
//		{
//			a=-a;
//		}
//			System.out.println(a);
		
		//277.给定3个数 a, b , c ，判断它们是否相等
//		int a =10 , b = 10 , c = 11;
//		if (a==b&&a==c&&b==c)
//		{
//			System.out.println("相等");
//		}
//		else
//		{
//			System.out.println("不相等");
//		}
		
		//281.打印从1到20所有能被4整除的数
//		for (int i = 1; i <= 20; i++)
//		{
//			if (i%4==0)
//			{
//				System.out.println(i);
//			}
//		}
//		System.out.println("done");
		
		//282.打印所有1-20之间能被3带除的数。按从大到小的顺序
//		for(int i = 20; i>=1; i--)
//		{
//			if (i%3==0)
//			{
//				System.out.println(i);
//			}
//		}
		
		//283.给定一个数N,  求 1 + 2 + 3 + ... + N 的和
//		int N = 123;
//		int H = 0;
//		for (int i = 1; i<=N; i++)
//		{
//			H += i;
//		}
//		System.out.println(H);
		
		//284.求100以内的奇数的平方和
//		int H = 0;
//		for (int i = 1; i<=100; i++)
//		{
//			if (i%2!=0)
//			{
//				H+=i*i;
//			}
//		}
//		System.out.println("结果为："+H);
		
		//290.求1到100之间，所有能被3整除的数的立方和
		
		
		
		
		
		
		
		
		//break和continue break适合遇谁终止；continue适合除谁不过
		//实例代码
//		for(int i=1; i<=20;i++) 
//		{ 
//		 
//		if(i %4 ==0)  
//		{ 
//		continue; 
//		} 
//		 
//		System.out.print( i + " "); 
//		 
//		} 
		
		
		//while语句
		//实例1
//		int i = 1;
//
//		while (i <= 10)
//		{
//
//			System.out.println(i);
//
//			i++;
//		} 
		
		//实例2
//		while里面true将无限循环
		
		
		
		//数组对象
		
		
		
		
		
		
		//*************************************************************
		
		
		
		
		
		//使用已建好的新建类
//       类型  对象  创建一个Student对象
//		Student sx = new Student();//new Student():创建一个Student类型的对象
//		Student ymy = new Student();
//		sx.id = "20171001";        //s1.id对象的属性用点号.访问
//		sx.name = "小王";
//		sx.sex = true;
//		sx.cellphone = "18600010201";
//		
//		// 学生殷名洋的信息
//		ymy.id = "20170300990";        //ymy.id对象的属性用点号.访问
//		ymy.name = "殷名洋";
//		ymy.sex = true;
//		ymy.cellphone = "13012530230";
//		
//		// 第二个学生的信息 
//		Student s2 = new Student(); 
//		s2.id = "20171001"; 
//		s2.name = "王草"; 
//		s2.sex = true; 
//		s2.cellphone = "18610022345"; 
//		 
//		// 第三个学生的信息 
//		Student s3 = new Student(); 
//		s3.id = "20171002"; 
//		s3.name = "李花"; 
//		s3.sex = false; 
//		s3.cellphone = "13820490902"; 
//
//		System.out.println("学号: " + sx.id);
//		System.out.println("姓名: " + sx.name);
//		System.out.println("性别: " + sx.sex);
//		System.out.println("手机: " + sx.cellphone);
//		
//		System.out.println("学号: " + ymy.id);
//		System.out.println("姓名: " + ymy.name);
//		System.out.println("性别: " + ymy.sex);
//		System.out.println("手机: " + ymy.cellphone);
//		
//		System.out.println("学号: " + s2.id);
//		System.out.println("姓名: " + s2.name);
//		System.out.println("性别: " + s2.sex);
//		System.out.println("手机: " + s2.cellphone);
//		
//		System.out.println("学号: " + s3.id);
//		System.out.println("姓名: " + s3.name);
//		System.out.println("性别: " + s3.sex);
//		System.out.println("手机: " + s3.cellphone);
		
		//实例1
//		Book b = new Book();
//		b.title = "c/c++";
//		b.author = "绍发";
//		b.press = "清华大学出版社";
//		b.ISBN = "133213121135213";
//		b.price = 54.00;
		
		//实例2类的嵌套
//		Student ymy = new Student();
//		ymy.id = "20170300990";        //ymy.id对象的属性用点号.访问
//		ymy.name = "殷名洋";
//		ymy.sex = true;
//		ymy.cellphone = "13012530230";
//		ymy.cards.schoolcardnumber = "623566201246565652200";
//		ymy.cards.bankCardNumber = "623566024156669987099";
//		ymy.show(18,45);//使用类的方法
		
		//
//		WebSite web = new WebSite();
//		web.domainName = "afanihao.cn";
//		web.siteName = "阿发你好";
//		web.recordName = "23091023";
//		web.IP = "123.56.150.87";
//		
//		web.contact.name = "阿发";
//		web.contact.tel = "13800001111";
//		web.contact.address = "xxxxxxxxx";
		
		//类的方法的返回值
//		int[] a1 = {29,293,193};
//		int[] a2 = {90,89,289};
//		MyMathTools max = new MyMathTools();
//		//max.getMax(a1);
//		int[] a3 = {max.getMax2(a1),max.getMax2(a2)};
//		System.out.println(max.getMax2(a1)+","+max.getMax2(a2));
//		System.out.println("最大值："+max.getMax2(a3));
		
		//方法的返回值2实例1
//		int[] a1 = {28,23,62,16,8};
//		MyMathTools m = new MyMathTools();
//		System.out.println(m.check1(a1));
		
		//方法的返回值2实例2
//		MyMathTools m = new MyMathTools();
//		m.print(10);
		
		//方法的返回值3实例1
//		int[] arr = {  18,  28, 32, 36, 48 }; 
//		MyMathTools m = new MyMathTools(); 
//		int[] result = m.find8( arr ); 
//		System.out.println("完成"); 
//		//然后debug或者for遍历一下result就证实了结果
		
		//方法的返回值3实例2
//		int[] arr = {  18,  28, 32, 36, 48 }; 
//		MyMathTools m = new MyMathTools(); 
//		Student stu = m.createNew("2329", "shaofa"); 
//		System.out.println("完成"); 
		
//		Simple s = new Simple();
		//调用的时候编译器不仅会根据方法名字还会根据方法的参数类型对应
//		s.test(); 
		 
//		s.test(10, 12); 
		 
//		s.test(10, "shaofa"); 
		

//		Screen s1 = new Screen(); 
//		s1.width = 1366; 
//		s1.height = 768; 
//		int p1 = s1.pixel1(s1); //把自己传给自己（应避免）
//		System.out.println("像素: " + p1 ); 
		
//		Screen s2= new Screen();
//		s2.width=1920;
//		s2.height=1080;
//		int p2= s2.pixel2();	//优化做法
//		System.out.println("像素："+p2);
//		
//		Screen s3= new Screen();
//		s3.width=1366;
//		s3.height=768;
//		int p3= s3.pixel2();	//优化做法
//		System.out.println("像素："+p3);
		
		
		
		
		
		
		//构造方法
//		Structure st = new Structure("ymysmart",19,64.5);
		
//		Student s = new Student();
//		s.id = "20170300990";
//		s.name = "殷名洋";
//		
//		System.out.println("完成");
		
		
		//继承
//		X64System x64 = new X64System();
//		x64.runProgram32("3232.texe");//调用父类的方法
//		x64.runProgram64("6464.exe");//调用子类特有的方法
//		
//		x64.sys32();//调用重写父类的方法
		
		//static静态方法
//		System.out.println(Math.sqrt(3*3+4*4));
		
		//常用工具类-----String类+++++++++++++++++++++++++++++++++++
//		System.out.println("殷名洋ymy".substring(1, 4));//字串/字符串的切片
//		System.out.println("nihao123".equals("nihao123"));//判断字符串是否相等
//		System.out.println("nihao123".compareTo("nihao123456"));//比较字符串大小
//		//format格式化输出（可用变量格式化输出）
//		System.out.println(String.format("姓名：%s，学号：%s，身高：%.2f","殷名洋","20170300990",1.82));
//		System.out.println(Integer.valueOf("123456"));//字符串转int类型
//		System.out.println(Integer.valueOf(123456));//int转字符串类型
		

		
	}

}




































