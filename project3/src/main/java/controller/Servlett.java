package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.student1;
import studentdao.stddao;
@WebServlet("/xyz")
public class Servlett extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String s1 = req.getParameter("stdid");
		int no=Integer.parseInt(s1);
		String s2=req.getParameter("stdname");
		String s3=req.getParameter("bloodgrp");
		student1 s=new student1();
		s.setStdid(no);
		s.setStdname(s2);
		s.setBloodgrp(s3);
		stddao sd=new stddao();
		sd.insert(s);

		
	}

}
