package panda.nono.WebFavorite.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import panda.nono.WebFavorite.po.User;

@WebServlet(urlPatterns = "/user/collect/*") 
public class CollectServlet  extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
			this.getAllCollect(req,resp);
			break;
		default:
			break;
		}
		return;
	}
	private void getAllCollect(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		User user = (User) session.getAttribute("USERINSESSION");
		System.out.println(user.getAccount());
		resp.sendRedirect(path+"/userIndex.jsp");
	}

}
