# JDBCPractice
##  使用JDBC步骤
1.加载数据驱动  格式：Class.forName(driverName); （涉及反射技术）  
&#160; &#160; &#160; &#160;例如：  
&#160; &#160; &#160; &#160;加载MySql驱动：Class.forName("com.mysql.jdbc.Driver");  
&#160; &#160; &#160; &#160;加载MySql驱动：Class.forName("oracle.jdbc.driver.OracleDriver");  

2.获得数据库连接：  
&#160; &#160; &#160; &#160;DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_name","root","root");   
&#160; &#160; &#160; &#160;注意：db_name，root,root分别指数据库名字，数据库用户名，数据库密码


3.创建Statement对象
&#160; &#160; &#160; &#160;conn.createStatement();



##sql脚本
		create table stu_info(
		)engine = innodb default



