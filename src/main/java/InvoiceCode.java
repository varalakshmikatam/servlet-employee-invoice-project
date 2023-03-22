

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvoiceCode
 */
@WebServlet("/InvoiceCode")
public class InvoiceCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvoiceCode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		long mobilenumber=Long.parseLong(request.getParameter("mobileno"));
		String item=request.getParameter("item");
		double price=Double.parseDouble(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quan"));
		
		out.print("customer id="+id+"<br>");
		out.print("customer mobile number="+mobilenumber+"<br>");
		out.print("Item name is"+item+"<br>");
		out.print("price of the product is"+price+"<br>");
		out.print("enter no.of quanteties"+quantity+"<br>");
		
		double total=0.0;
		double discount=0.0;
		total=quantity*price;
		out.print(" amount"+total+"<br>");
		
		if(total<2000)
			{
			discount=total*15/100;
			out.print("discount amount "+discount+"<br>");
			double invoice=total-discount;
			out.print("total invoice amount to pay"+invoice+"<br>");
			}
		     if(total>2000 && total<5000)
		    {
			discount=total*25/100;
			out.print("discount amount "+discount+"<br>");
			double invoice=total-discount;
			out.print("total invoice amount to pay"+invoice+"<br>");
		    }
		     else
		    {
			   discount=total*15/100;
				out.print("discount amount "+discount+"<br>");
				double invoice=total-discount;
				out.print("total invoice amount to pay"+invoice+"<br>");
		     }	
	}

}
