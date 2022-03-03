package th.co.nt.main;

import org.apache.axis.message.MessageElement;
import org.tempuri.GetStaffByHeaderIDResponseGetStaffByHeaderIDResult;
import org.tempuri.StaffServiceSoapProxy;

import com.google.gson.Gson;

/**
 * Created by Kritsana J. on 03/03/2565.
 */
public class MainCallData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		
		String endpoint = "http://intra.tot.co.th/StaffServices/StaffService.asmx";
		String headerID = "13601960";
		
		// Call Web Service Operation < GetStaffByHeaderIDResult >
		StaffServiceSoapProxy service = new StaffServiceSoapProxy();
		GetStaffByHeaderIDResponseGetStaffByHeaderIDResult result = service.getStaffByHeaderID(headerID);
		org.apache.axis.message.MessageElement [] arr = result.get_any(); 
		
		StringBuilder builStr = new StringBuilder(); 
		for(int i=0;i<arr.length;i++) {
			MessageElement msg = new MessageElement(arr[i]);						
			builStr.append(msg.getAsString());
		}
		
        // TODO initialize WS operation arguments here
		System.out.println(builStr.toString());
		
		System.out.println(" # ");

	}	
}
