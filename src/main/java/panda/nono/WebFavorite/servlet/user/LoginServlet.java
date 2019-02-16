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

import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.service.UserService;
import panda.nono.WebFavorite.serviceImpl.UserServiceImpl;

@WebServlet(urlPatterns = "/user/login/*")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();
	HttpSession session = null;
	PrintWriter pw = null;
	String path = null;
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
		System.out.println(action);
		switch (action) {
		case "regedit":
			try {
				this.regeditAction(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		default:
			break;
		}
	}

	private void regeditAction(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		// TODO Auto-generated method stub
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		User user = new User(account, password);
		this.userService.regedit(user);
		resp.sendRedirect(path+"/login.jsp");
	}
}
