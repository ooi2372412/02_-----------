package chapter17;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter17/cart-invalidate"})
public class CartInvalidate extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);

		HttpSession session=request.getSession();
		session.invalidate();

		out.println("カートを削除しました。");
		Page.footer(out);
	}
}
