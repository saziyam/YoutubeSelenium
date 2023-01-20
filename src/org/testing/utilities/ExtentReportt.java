package org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportt {
	public static ExtentReports reports;
	public static ExtentReports reports() {
		ExtentReports reports = new ExtentReports("/Users/saziya/eclipse-workspace/YTFramwork/reports/case1.html", false);
		return reports;
	}

}
