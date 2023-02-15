package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/abc")
public class Sample extends GenericServlet{
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("servlet instance/object is created");
	}

@Override
public void destroy() {
	// TODO Auto-generated method stub
	super.destroy();
	System.out.println("destroy method ");
}

@Override
public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println("service method is called");
}
	
}
