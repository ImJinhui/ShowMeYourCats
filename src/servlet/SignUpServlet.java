package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/signup")
public class SignUpServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String host = request.getContextPath();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"<title>Sign Up</title>\r\n" + 
				"<meta charset=\"utf-8\">\r\n" + 
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\r\n" + 
				"<!--  <link rel=\"stylesheet\" href=\"../css/sketchy_bootstrap.min.css\"> -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"./page_member/Signup.css\">\r\n" + 
				"<link href=\"https://fonts.googleapis.com/css?family=Lato\"\r\n" + 
				"	rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"<link href=\"https://fonts.googleapis.com/css?family=Montserrat\"\r\n" + 
				"	rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"<script src=\"./js/jquery.min.js\"></script>\r\n" + 
				"<script src=\"./js/bootstrap.min.js\"></script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!-- <script>\r\n" + 
				"\r\n" + 
				"$(function(){\r\n" + 
				"\r\n" + 
				"	var CheckEmail = RegExp(/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$/);\r\n" + 
				"\r\n" + 
				"	$(\".btn1\").click(function(){\r\n" + 
				"\r\n" + 
				"		if($(\"#emailid\").val() < 10){\r\n" + 
				"			alert(\"아이디 10자 이상 입력 바람\");\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"		if($(\"#emailid\").value.length < 10){\r\n" + 
				"			alert(\"아이디 10자 이상 입력 바람\");\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"		if(!CheckEmail.test($(\"#emailid\").val())){\r\n" + 
				"			alert(\"아이디 형식에 맞게 입력 바람\");\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"	});\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script> -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				"<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\"\r\n" + 
				"	data-offset=\"50\">\r\n" + 
				"\r\n" + 
				"	<!-- Navbar Start-->\r\n" + 
				"	<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n" + 
				"		<div class=\"container-fluid\">\r\n" + 
				"			<div class=\"navbar-header\">\r\n" + 
				"				<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n" + 
				"					data-target=\"#myNavbar\">\r\n" + 
				"					<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n" + 
				"						class=\"icon-bar\"></span>\r\n" + 
				"				</button>\r\n" + 
				"				<a class=\"navbar-brand\" href=\"../page_home/Home.html\">Show Me\r\n" + 
				"					Your Cats</a>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n" + 
				"				<ul class=\"nav navbar-nav navbar-right\">\r\n" + 
				"					<li><a href=\"../page_home/Home.html\">HOME</a></li>\r\n" + 
				"					<li><a href=\"../page_board/BoardList.html\">BOARD</a></li>\r\n" + 
				"					<li><a href=\"../page_shop/ShopList.html\">SHOP</a></li>\r\n" + 
				"					<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n" + 
				"						data-toggle=\"dropdown\" href=\"#\">MEMBER <span class=\"caret\"></span></a>\r\n" + 
				"						<ul class=\"dropdown-menu\">\r\n" + 
				"							<li><a href=\"../page_member/Login.html\">Log in</a></li>\r\n" + 
				"							<li><a href=\"#\">Sign Up</a></li>\r\n" + 
				"							<li><a href=\"../page_member/MyInfo.html\">My Info</a></li>\r\n" + 
				"						</ul></li>\r\n" + 
				"					<li><a href=\"#\"><span class=\"glyphicon glyphicon-search\"></span></a></li>\r\n" + 
				"				</ul>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</nav>\r\n" + 
				"	<!-- Navbar End -->\r\n" + 
				"\r\n" + 
				"	<!-- Main Start -->\r\n" + 
				"\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<div class=\"col-md-8\">\r\n" + 
				"				<section>\r\n" + 
				"					<h1 class=\"entry-title\">\r\n" + 
				"						<span>Sign Up</span>\r\n" + 
				"					</h1>\r\n" + 
				"					<hr>\r\n" + 
				"					<form class=\"form-horizontal\" method=\"POST\" name=\"signup\"\r\n" + 
				"						id=\"signup\" action=\""+host+"/SignUpStatusServlet\">\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<label class=\"control-label col-sm-3\">Email ID <span\r\n" + 
				"								class=\"text-danger\">*</span></label>\r\n" + 
				"							<div class=\"col-md-8 col-sm-9\">\r\n" + 
				"								<div class=\"input-group\">\r\n" + 
				"									<span class=\"input-group-addon\"><i\r\n" + 
				"										class=\"glyphicon glyphicon-envelope\"></i></span> <input type=\"email\"\r\n" + 
				"										class=\"form-control\" name=\"emailid\" id=\"emailid\"\r\n" + 
				"										placeholder=\"Enter your Email ID\" >\r\n" + 
				"								</div>\r\n" + 
				"								<small> Your Email Id is being used for ensuring the\r\n" + 
				"									security of your account, authorization and access recovery. </small>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<label class=\"control-label col-sm-3\">Set Password <span\r\n" + 
				"								class=\"text-danger\">*</span></label>\r\n" + 
				"							<div class=\"col-md-5 col-sm-8\">\r\n" + 
				"								<div class=\"input-group\">\r\n" + 
				"									<span class=\"input-group-addon\"><i\r\n" + 
				"										class=\"glyphicon glyphicon-lock\"></i></span> <input type=\"password\"\r\n" + 
				"										class=\"form-control\" name=\"password\" id=\"password\"\r\n" + 
				"										placeholder=\"Choose password (5-15 chars)\" value=\"\">\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<label class=\"control-label col-sm-3\">Confirm Password <span\r\n" + 
				"								class=\"text-danger\">*</span></label>\r\n" + 
				"							<div class=\"col-md-5 col-sm-8\">\r\n" + 
				"								<div class=\"input-group\">\r\n" + 
				"									<span class=\"input-group-addon\"><i\r\n" + 
				"										class=\"glyphicon glyphicon-lock\"></i></span> <input type=\"password\"\r\n" + 
				"										class=\"form-control\" name=\"cpassword\" id=\"cpassword\"\r\n" + 
				"										placeholder=\"Confirm your password\" value=\"\">\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<label class=\"control-label col-sm-3\">Full Name <span\r\n" + 
				"								class=\"text-danger\">*</span></label>\r\n" + 
				"							<div class=\"col-md-8 col-sm-9\">\r\n" + 
				"								<input type=\"text\" class=\"form-control\" name=\"name\"\r\n" + 
				"									id=\"name\" placeholder=\"Enter your Name here\" >\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<label class=\"control-label col-sm-3\">Contact No. <span\r\n" + 
				"								class=\"text-danger\">*</span></label>\r\n" + 
				"							<div class=\"col-md-5 col-sm-8\">\r\n" + 
				"								<div class=\"input-group\">\r\n" + 
				"									<span class=\"input-group-addon\"><i\r\n" + 
				"										class=\"glyphicon glyphicon-phone\"></i></span> <input type=\"text\"\r\n" + 
				"										class=\"form-control\" name=\"contactnum\" id=\"contactnum\"\r\n" + 
				"										placeholder=\"Enter your Primary contact no.\" value=\"\">\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<label class=\"control-label col-sm-3\">Residence</label>\r\n" + 
				"							<div class=\"col-md-5 col-sm-8\">\r\n" + 
				"								<div class=\"input-group\" id=\"residence\">\r\n" + 
				"									<label class=\"radio-inline\"> \r\n" + 
				"										<input type=\"radio\"	name=\"residence\" value=\"seoul\">Seoul</label> \r\n" + 
				"									<label class=\"radio-inline\">\r\n" + 
				"										<input type=\"radio\" name=\"residence\" value=\"incheon\">Incheon</label> \r\n" + 
				"									<label class=\"radio-inline\">\r\n" + 
				"										<input type=\"radio\"	name=\"residence\" value=\"jeju\">Jeju</label>\r\n" + 
				"\r\n" + 
				"								</div>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"						\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<label class=\"control-label col-sm-3\">Hobby</label>\r\n" + 
				"							<div class=\"col-md-8 col-sm-9\">\r\n" + 
				"								<select class=\"form-control\" name=\"hobby\">\r\n" + 
				"									<option value=\"music\">Music</option>\r\n" + 
				"									<option value=\"movie\">Movie</option>\r\n" + 
				"									<option value=\"sleep\">Sleep</option>\r\n" + 
				"									\r\n" + 
				"								</select>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						<div class=\"form-group\">\r\n" + 
				"							<div class=\"col-xs-offset-3 col-xs-10\">\r\n" + 
				"								<input name=\"Submit\" type=\"submit\" value=\"Sign Up\"\r\n" + 
				"									class=\"btn btn-default\">\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"					</form>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"	<!-- Main End -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"	<!-- Footer -->\r\n" + 
				"	<footer class=\"text-center\">\r\n" + 
				"		<a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\"\r\n" + 
				"			title=\"TO TOP\"> <span class=\"glyphicon glyphicon-chevron-up\"></span>\r\n" + 
				"		</a><br> <br>\r\n" + 
				"		<p>\r\n" + 
				"			Bootstrap Theme Made By <a href=\"https://www.w3schools.com\"\r\n" + 
				"				data-toggle=\"tooltip\" title=\"Visit w3schools\">www.w3schools.com</a>\r\n" + 
				"		</p>\r\n" + 
				"	</footer>\r\n" + 
				"\r\n" + 
				"	<!-- <script>\r\n" + 
				"$(document).ready(function(){\r\n" + 
				"  // Initialize Tooltip\r\n" + 
				"  $('[data-toggle=\"tooltip\"]').tooltip();\r\n" + 
				"\r\n" + 
				"  // Add smooth scrolling to all links in navbar + footer link\r\n" + 
				"  $(\".navbar a, footer a[href='#myPage']\").on('click', function(event) {\r\n" + 
				"\r\n" + 
				"    // Make sure this.hash has a value before overriding default behavior\r\n" + 
				"    if (this.hash !== \"\") {\r\n" + 
				"\r\n" + 
				"      // Prevent default anchor click behavior\r\n" + 
				"      event.preventDefault();\r\n" + 
				"\r\n" + 
				"      // Store hash\r\n" + 
				"      var hash = this.hash;\r\n" + 
				"\r\n" + 
				"      // Using jQuery's animate() method to add smooth page scroll\r\n" + 
				"      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area\r\n" + 
				"      $('html, body').animate({\r\n" + 
				"        scrollTop: $(hash).offset().top\r\n" + 
				"      }, 900, function(){\r\n" + 
				"\r\n" + 
				"        // Add hash (#) to URL when done scrolling (default click behavior)\r\n" + 
				"        window.location.hash = hash;\r\n" + 
				"      });\r\n" + 
				"    } // End if\r\n" + 
				"  });\r\n" + 
				"})\r\n" + 
				"</script> --> \r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}
	
}
