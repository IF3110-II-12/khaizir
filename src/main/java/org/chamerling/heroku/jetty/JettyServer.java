package org.chamerling.heroku.jetty;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;

import java.io.IOException;

public class JettyServer extends HttpServlet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    if (req.getRequestURI().endsWith("/db")) {
      showDatabase(req,resp);
    } else {
      showHome(req,resp);
    }
  }

	private void showHome(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {

		// Energy is compatible with mass (E=mc2)
		/*RelativisticModel.select();

		String energy = System.getenv().get("ENERGY");

		Amount<Mass> m = Amount.valueOf(energy).to(KILOGRAM);
		resp.getWriter().print("E=mc^2: " + energy + " = " + m);*/
		resp.getWriter().print("tes simple blog");

	}

	private void showDatabase(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		resp.getWriter().print("Tes");
	}

  public static void main(String[] args) throws Exception{
    Server server = new Server(Integer.valueOf(System.getenv("PORT")));
    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/");
    server.setHandler(context);
    context.addServlet(new ServletHolder(new JettyServer()),"/*");
    server.start();
    server.join();
  }
}
