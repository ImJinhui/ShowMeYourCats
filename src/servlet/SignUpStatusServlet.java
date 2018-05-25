package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/SignUpStatusServlet")
public class SignUpStatusServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String emailid = request.getParameter("emailid");
		
		out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
				"    <!-- Bootstrap Core CSS -->\r\n" + 
				"	<link type=\"text/css\" href=\"./resources/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n" + 
				"\r\n" + 
				"<title>Edit</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <div id=\"wrapper\">\r\n" + 
				"       <!-- /.row -->\r\n" + 
				"       <div class=\"row\">\r\n" + 
				"           <div class=\"col-lg-12\">\r\n" + 
				"               <div class=\"panel panel-default\">\r\n" + 
				"                   <div class=\"panel-heading\">\r\n" + 
				"                       Login Status\r\n" + 
				"                   </div>\r\n" + 
				"                   <div class=\"panel-body\">\r\n" + 
				"                   <!-- /.row (nested) -->\r\n" + 
				"                   <fieldset>\r\n" + 
				"                       <div class=\"form-group\">\r\n" + 
				"                           Email ID : "+emailid +" \r\n" + 
				"                       </div>\r\n" + 
				"                       <div class=\"form-group\">\r\n" + 
				"                           Password : "+request.getParameter("password")+"\r\n" + 
				"                       </div>\r\n" + 
				"                       <div class=\"form-group\">\r\n" + 
				"                           Password Confirm : "+request.getParameter("cpassword")+"\r\n" + 
				"                       </div>\r\n" + 
				"                       <div class=\"form-group\">\r\n" + 
				"                           Full Name : "+request.getParameter("name")+"\r\n" + 
				"                       </div>\r\n" + 
				"                       <div class=\"form-group\">\r\n" + 
				"                           Contact No : "+request.getParameter("contactnum")+" \r\n" + 
				"                       </div>\r\n" + 
				"                       <div class=\"form-group\">\r\n" + 
				"                           Residence : "+request.getParameter("residence")+"\r\n" + 
				"                       </div>\r\n" + 
				"                       <div class=\"form-group\">\r\n" + 
				"                           Hobby : "+request.getParameter("hobby")+"\r\n" + 
				"                       </div>\r\n" + 
				"                   </fieldset>\r\n" + 
				"                       <!-- /.row (nested) -->\r\n" + 
				"                   </div>\r\n" + 
				"                   <!-- /.panel-body -->\r\n" + 
				"               </div>\r\n" + 
				"               <!-- /.panel -->\r\n" + 
				"           </div>\r\n" + 
				"           <!-- /.col-lg-12 -->\r\n" + 
				"       </div>\r\n" + 
				"       <!-- /.row -->\r\n" + 
				"    </div>\r\n" + 
				"    <!-- /#wrapper -->\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}
	
	
}
