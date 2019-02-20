package panda.nono.WebFavorite.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import panda.nono.WebFavorite.util.EmailUtil;

@WebServlet(urlPatterns = "/user/email/*") 
public class EmailServlet extends HttpServlet{
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
		case "sendCode":
			try {
				this.sendCode(req,resp);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
		return;
	}
	private void sendCode(HttpServletRequest req, HttpServletResponse resp) throws MessagingException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		int code = (int) (Math.random()*899999+100000);//100000~999999
		EmailUtil.sendCodeEmail(email, code+"");
		session.setAttribute("HISEMAIL", email);
		pw.print(code);
	}

}
