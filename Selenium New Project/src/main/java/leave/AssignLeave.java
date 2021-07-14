package leave;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignLeave {
	
	@FindBy(name="assignleave[txtEmployee][empName]")
	WebElement txt_name;
	
	@FindBy(id="assingleave_txtLeaveType")
	WebElement txt_leaveType;
	
	@FindBy(id="assignleave_txtFromDate")
	WebElement text_fromDate;
	
	
	

}
