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

@WebServlet(urlPatterns="/website/userop/*")
public class UserOpServlet extends HttpServlet{
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
			break;
		default:
			break;
		}
		return;
	}

}