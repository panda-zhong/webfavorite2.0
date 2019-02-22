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

import com.alibaba.fastjson.JSONObject;

import panda.nono.WebFavorite.po.Message;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.service.user.UserService;
import panda.nono.WebFavorite.serviceImpl.user.UserServiceImpl;

@WebServlet(urlPatterns = "/user/message/*")
public class MessageServlet extends HttpServlet {
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
		resp.setCharacterEncoding("UTF-8");
		pw = resp.getWriter();
		System.out.println(uri);
		switch (action) {
		case "getByUser":
			try {
				this.getMessageByUser(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "getByLike":
			try {
				this.getByLike(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "getByAdmin":
			try {
				this.getByAdmin(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "setReadState":
			try {
				setReadState(req,resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
		return;
	}

	private void setReadState(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		// TODO Auto-generated method stub
		User user = (User) session.getAttribute("USERINSESSION");
		String account = user.getAccount();
		this.userService.readMessage(account);
		return;
	}

	private void getByAdmin(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		// TODO Auto-generated method stub
		User user = (User) session.getAttribute("USERINSESSION");
		String account = user.getAccount();
		List<Message> messageList = this.userService.getMessageByAdmin(account);
		String messageListStr = JSONObject.toJSONString(messageList);
		pw.print(messageListStr);
		return;
	}
	

	private void getByLike(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		// TODO Auto-generated method stub
		User user = (User) session.getAttribute("USERINSESSION");
		String account = user.getAccount();
		List<Message> messageList = this.userService.getMessageByLike(account);
		String messageListStr = JSONObject.toJSONString(messageList);
		pw.print(messageListStr);
		return;
	}

	private void getMessageByUser(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		// TODO Auto-generated method stub
		User user = (User) session.getAttribute("USERINSESSION");
		String account = user.getAccount();
		List<Message> messageList = this.userService.getMessageByUser(account);
		String messageListStr = JSONObject.toJSONString(messageList);
		pw.print(messageListStr);
		return;
	}

}
