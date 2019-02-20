package panda.nono.WebFavorite.servlet.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/getCodeImage")
public class ImageCheckCodeServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 定义图片的宽度和高度
	public static final int WIDTH = 500;
	public static final int HEIGHT = 50;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ImageCheckCodeServlet");
		String checkCode="";
		
		// 创建图片 BufferedImage.TYPE_INT_RGB设置图片类型
		BufferedImage image = new BufferedImage(WIDTH, HEIGHT,
				BufferedImage.TYPE_INT_RGB);
		// 得到图片的画笔
		Graphics g = image.getGraphics();
		// 设置图片背景色
		setBackGround(g);
		// 设置图片的边框
		setBorder(g);
		// 勾画图片上的干扰线条
		drawRandomLine(g);
		// 在图片上写入随机数
		checkCode=writeRandomNum(g);

		// 告诉浏览器写入类型
		response.setContentType("image/jpeg");
		// 将图片写入到浏览器
		ImageIO.write(image, "jpg", response.getOutputStream());
		// 头控制 不要让浏览器缓存
		response.setDateHeader("expries", -1);
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		
		//记录图片验证码到session中，供注册模块检测
		HttpSession session=request.getSession();
		session.setAttribute("CODEINSESSION", checkCode);
		
	}

	private String writeRandomNum(Graphics graphics) {
		// Graphics2D里面的方法可以设置旋转弧度
		Graphics2D g = (Graphics2D) graphics;
		// 设置字体颜色
		g.setColor(Color.RED);
		// 设置字体样式
		g.setFont(new Font("宋体", Font.BOLD, 30));
		
		String checkCode="";
		// 写入4个汉子
		int x = 10;
		for (int i = 0; i < 4; i++) {
			// 设置字体的弧度
			int d = new Random().nextInt() % 9;
			//获取随机汉字
			String target = String.valueOf(Math.abs(d));
			checkCode+=target;
			// 设置字体弧度
			g.rotate(d * Math.PI / 180, x, 35);
			// 字体是写在矩形里面 需要考虑字体空间以及字体的坐标，y标是不变的的
			g.drawString(target, x, 35);
			// 将字体弧度回调，不然下一个字体会旋转出去
			g.rotate(-d * Math.PI / 180, x, 35);
			// 字体大小是 20，没间隔10 在写入一个
			x += 45;
		}
		
		return checkCode;

	}

	// 勾画图片上的干扰线条
	private void drawRandomLine(Graphics g) {
		g.setColor(Color.GREEN);// 设置干扰线条的颜色
		// 勾画10条干扰线条
		for (int i = 0; i < 10; i++) {

			// 勾画线条的初始坐标位置 ，其位置必须控制在图片的大小之内
			int x1 = new Random().nextInt(WIDTH);
			int y1 = new Random().nextInt(HEIGHT);
			// 结束坐标
			int x2 = new Random().nextInt(WIDTH);
			int y2 = new Random().nextInt(HEIGHT);
			g.drawLine(x1, y1, x2, y2);
		}

	}

	// 设置边框颜色
	private void setBorder(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawRect(1, 1, WIDTH - 2, HEIGHT - 2);
	}

	// 设置图片的背景颜色
	private void setBackGround(Graphics g) {
		g.setColor(Color.WHITE);// 白色
		g.fillRect(0, 0, WIDTH, HEIGHT);// 把图片颜色给填充

	}

	
	
}
