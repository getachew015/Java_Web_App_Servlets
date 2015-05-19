package getac005;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class TransferMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		HttpSession banker = request.getSession();
		PrintWriter out = response.getWriter();
		String currentUser=(String)session.getAttribute("currUser");	
		response.setContentType("text/HTML");
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>" + "Transfer Money" + "</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<CENTER>");
		out.println("<H4>"+currentUser+" Provide Transfer Information </H4><BR>");
		out.println("<FORM METHOD='POST' ACTION='ShowUpdate'>");
		out.println("<TABLE><TH></TH>");
		out.println("<TR>");
		out.println("<TABLE BGCOLOR=E0E0E0><TH></TH>");
		out.println("<TR><TD><H5>Specify The Account and Amount To Transfer</H5> </TD></TR>");
		out.println("<TR><TD>Account Type <select name='senderAccountType'> "
				+ "<option value='Saving'>Saving Account</option>"
				+ "<option value='Checking'>ChecKing Account</option>"
				+ "<option value='Loan'>Loan Account</option>"
				+ "</select> </TD></TR>");
		out.println("<TR><TD>Account ID: <select name='senderAccountID'> "
				+ "<option value='01'>01</option> "
				+ "<option value='02'>02</option>"
				+ "<option value='03'>03</option>"
				+ "<option value='04'>04</option>"
				+ "<option value='05'>05</option>"
				+ "</select></TD></TR>");
		out.println("<TR><TD>Transfer Amount: <INPUT TYPE=Text Name='senderAmount'></TD></TR>");
		out.println("</TABLE><BR><BR>");
		out.println("</TR>");
		out.println("<TR></TR>");
		//Receiver Account
		out.println("<TR>");
		out.println("<TABLE BGCOLOR=E0E0E0><TH></TH>");
		out.println("<TR><TD><H5> Specify Receiver Information</H5> </TD></TR>");
		out.println("<TR><TD>Reciever Name: <INPUT TYPE=Text Name='receiverName'></TD></TR>");
		out.println("<TR><TD>Account Type <select name='receiverAccountType'> "
				+ "<option value='Saving'>Saving Account</option>"
				+ "<option value='Checking'>ChecKing Account</option>"
				+ "<option value='Loan'>Loan Account</option>"
				+ "</select> </TD></TR>");
		out.println("<TR><TD>Account ID: <select name='receiverAccountID'> "
				+ "<option value='01'>01</option> "
				+ "<option value='02'>02</option>"
				+ "<option value='03'>03</option>"
				+ "<option value='04'>04</option>"
				+ "<option value='05'>05</option>"
				+ "</select></TD></TR>");
		out.println("</TABLE>");
		out.println("</TR>");
		out.println("</TABLE>");
		out.println("<BR><INPUT TYPE='Submit' NAME='Transfer' VALUE='Submit'>");
		banker.setAttribute("banker", request.getParameter("banker"));	
		out.println("</FORM>");
		out.println("</CENTER>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.flush();

	
	}

}
