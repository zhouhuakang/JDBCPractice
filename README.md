# JDBCPractice
##  使用JDBC步骤
1.加载数据驱动  格式：Class.forName(driverName);  
&#160; &#160; &#160; &#160;例如：  
&#160; &#160; &#160; &#160;加载MySql驱动：Class.forName("com.mysql.jdbc.driver");  
&#160; &#160; &#160; &#160;加载MySql驱动：Class.forName("com.mysql.jdbc.driver");  

2.获得数据库连接：  
&#160; &#160; &#160; &#160;DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project_name","root","root");  

3.创建Statement对象
&#160; &#160; &#160; &#160;conn.createStatement();


