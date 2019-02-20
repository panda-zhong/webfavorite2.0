package panda.nono.WebFavorite.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import panda.nono.WebFavorite.common.Common;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.service.user.UserService;
import panda.nono.WebFavorite.serviceImpl.user.UserServiceImpl;

@WebServlet(urlPatterns = "/user/login/*") 
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HttpSession session = null;
	PrintWriter pw = null;
	String path = null;
	private UserService userService = new UserServiceImpl();
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String action = uri.substring(uri.lastIndexOf('/') + 1);
		session = req.getSession();
		path = req.getContextPath();
		pw = resp.getWriter();
		System.out.println(uri);
		switch (action) {
		case "check":
			try {
				this.checkUser(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "regedit":
			try {
				this.regeditUser(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "checkAccount":
			this.checkAccount(req,resp);
			break;
		default:
			break;
		}
		return;
	}
	
	private void checkAccount(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String account = req.getParameter("account");
		if(account=="1"){
			pw.print(false);
		}else{
			pw.print(true);
		}
	}
	private void regeditUser(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
		// TODO Auto-generated method stub
		String account = req.getParameter("account");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
//		User user = new User(account, password, "", email, name);
//		System.out.println(user);
		this.userService.regedit(account, password, name, email);
		resp.sendRedirect(path+"/login.jsp");
	}
	private void checkUser(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
		// TODO Auto-generated method stub
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		String userCode = req.getParameter("code");
		String code = (String) session.getAttribute("CODEINSESSION");
		System.out.println(code + account+password);
		if(!userCode.equals(code)){
			
		}else{
			User user = this.userService.check(account, password);
			if(user!=null){
				session.setAttribute("USERINSESSION", user);
				resp.sendRedirect(path+"/website/search/index");
				return;
			}
		}
		resp.sendRedirect(path+"/login.jsp");
		return;
	}

}
