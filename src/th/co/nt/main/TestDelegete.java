package th.co.nt.main;

import java.net.URL;

import org.apache.axis.message.MessageElement;
import org.tempuri.GetStaffByHeaderIDResponseGetStaffByHeaderIDResult;
import org.tempuri.StaffServiceSoapStub;

public class TestDelegete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String endpoint = "http://intra.tot.co.th/StaffServices/StaffService.asmx";
		String headerID = "13601960";
		
		StaffServiceSoapStub stub = new StaffServiceSoapStub(new URL(endpoint), null);
		GetStaffByHeaderIDResponseGetStaffByHeaderIDResult result = stub.getStaffByHeaderID(headerID);
		
		// add solution.
		// get data in xml <GetStaffByHeaderIDResult> ... </GetStaffByHeaderIDResult> only.
	
		org.apache.axis.message.MessageElement [] arr = result.get_any();		
		StringBuilder builStr = new StringBuilder(); 
		for(int i=0;i<arr.length;i++) {
			MessageElement msg = new MessageElement(arr[i]);						
			builStr.append(msg.getAsString());
		}
		
        // TODO print MetaData
		System.out.println(builStr.toString());
		
	}
}
