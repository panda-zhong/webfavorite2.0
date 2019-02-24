package panda.nono.WebFavorite.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Website;
import panda.nono.WebFavorite.service.user.UserService;
import panda.nono.WebFavorite.serviceImpl.user.UserServiceImpl;

@WebServlet(urlPatterns = "/user/collect/*") 
public class CollectServlet  extends HttpServlet{
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
		switch (action) {
		case "getAll":
			try {
				this.getAllCollect(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "delete":
			try {
				this.deleteMyCollect(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		default:
			break;
		}
		return;
	}
	private void deleteMyCollect(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		this.userService.deleteMyWebsite(id);
		resp.sendRedirect(path+"/user/collect/getAll");
	}
	private void getAllCollect(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
		// TODO Auto-generated method stub
		User user = (User) session.getAttribute("USERINSESSION");
		String account = user.getAccount();
		List<Website> websiteList = this.userService.getMyWebSite(account);
		session.setAttribute("MYWEBSITEINSESSION", websiteList);
		resp.sendRedirect(path+"/userIndex.jsp");
	}

}
