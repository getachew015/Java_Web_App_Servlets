package getac005;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class CloseAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CloseAccount() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		HttpSession banker = request.getSession();
		PrintWriter out = response.getWriter();
		String currentUser=(String)session.getAttribute("currUser");	
		response.setContentType("text/HTML");
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>" + "Close Account" + "</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<CENTER>");
		out.println("<H4>"+currentUser+" Please Specify The Account You Want To Close <BR><BR></H4>");
		out.println("<FORM METHOD='POST' ACTION='ShowUpdate'>");
		out.println("<TABLE><TH></TH>");
		out.println("<TR><TD>Account Type <select name='AccountType'> "
				+ "<option value='Saving'>Saving Account</option>"
				+ "<option value='Checking'>ChecKing Account</option>"
				+ "<option value='Loan'>Loan Account</option>"
				+ "</select> </TD></TR>");
		out.println("<TR><TD>Account ID: <select name='AccountID'> "
				+ "<option value='01'>01</option> "
				+ "<option value='02'>02</option>"
				+ "<option value='03'>03</option>"
				+ "<option value='04'>04</option>"
				+ "<option value='05'>05</option>"
				+ "</select></TD></TR>");
		out.println("</TABLE>");
		out.println("<INPUT TYPE='Submit' NAME='WithDraw' VALUE='Submit'>");
		banker.setAttribute("banker", request.getParameter("banker"));	
		out.println("</FORM>");
		out.println("</CENTER>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.flush();

	}

}
