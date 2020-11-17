package edu.demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
/**
 * 在将类使用@Action注解标识时发现@Action注解必须使用JDK1.6以上才行
 * 
 * 以前用struts2框架开发项目时，每次编写好一个Action，就需要在struts.xml文件中配置Action，
 * 而convention-plugin这个插件的出现出现后，就不再需要在struts.xml文件中配置Action了，
 * convention-plugin提供了一种非常方便的注解方式来配置Action类。
 * 
 * convention-plugin采用"约定大于配置”的思想，只要我们遵守约定，完全可以少写配置甚至不写配置；
 * config-browser-plugin插件则用于方便的浏览项目中的所有action及其与 jsp view的映射。这二个插件结合起来学习，
 * 能很方便的搞定struts2中各种复杂的action-view映射需求，所以现在使用Struts2框架开发Web应用时，一般都会配合这两个插件一起使用。
 * @author hejianliang
 *
 */
@ParentPackage("basePackage")
@Action  // 使用Action注解标识该类是Action类
@Namespace("/") // 使用Namespace注解指明改Action类的命名空间
public class TestAction {
	
	public void test() {
		System.out.println("test method...");
	}
	
}
