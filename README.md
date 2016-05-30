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
	见jdbc_practice.sql
	
##MVC三层结构

&#160; &#160; &#160; &#160;从上到下，是View(视图层)－>Control(控制层)－>Model(模型层)－>DB(数据库)  
&#160; &#160; &#160; &#160;Model层：分两部分，第一是对与数据库的映射，第二个定义
数据库操作的方法，比如CRUD。用于数据处理，业务逻辑。  
&#160; &#160; &#160; &#160;Control层：控制数据的流通过程，就是控制CRUD方法的应用。最后将数据拼装起来，展示给视图层。协调控制作用。  
&#160; &#160; &#160; &#160;View层：将数据展示给用户用的。  
	




