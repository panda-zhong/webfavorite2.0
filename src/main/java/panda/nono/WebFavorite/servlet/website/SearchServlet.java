package panda.nono.WebFavorite.servlet.website;

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

import panda.nono.WebFavorite.po.Website;
import panda.nono.WebFavorite.service.website.WebsiteService;
import panda.nono.WebFavorite.serviceImpl.website.WebsiteServiceImpl;


@WebServlet(urlPatterns="/website/search/*")
public class SearchServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private WebsiteService websiteService = new WebsiteServiceImpl();
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
		case "index":
			this.sortByCollect(req,resp);
			break;
		case "getwebSiteByTime":
			this.getwebSiteByTime(req,resp);
			break;
		case "searchWeb":
			try {
				this.searchWeb(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "searchUser":
			this.searchUser(req,resp);
			break;
		default:
			break;
		}
		return;
	}
	private void searchUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		String key = req.getParameter("key");
//		list = 
		resp.sendRedirect(path+"/searchUser.jsp");
		return;
	}
	private void searchWeb(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
		// TODO Auto-generated method stub
		String key = req.getParameter("key");
		String page = req.getParameter("page");
		List<Website> webList = this.websiteService.searchWeb(key, page);
		session.setAttribute("WEBLISTINSESSION", webList);
		session.setAttribute("KEYINSESSION", key);
		resp.sendRedirect(path+"/searchWeb.jsp");
		return;
	}
	private void getwebSiteByTime(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		String page = req.getParameter("page");
		if(page==null){
			page = "1";
		}
//		req.getRequestDispatcher("/index.jsp").forward(req,resp);
		resp.sendRedirect(path+"/recentWeb.jsp");
		return;
	}
	private void sortByCollect(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = req.getParameter("page");
		if(page==null){
			page = "1";
		}
//		req.getRequestDispatcher("/index.jsp").forward(req,resp);
		resp.sendRedirect(path+"/index.jsp");
		return;
	}

}