package myeasytest;

import org.easetech.easytest.annotation.*;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = { "c://MyTemp/testdata/testExcelData.xls" })
@Format(date= "dd/MM/yyyy")
@Report
@Parallel(threads=5)
public class TestExcelDataLoader {

    @Test
    public void getExcelTestData(@Param(name="url") String url,
                                 @Param(name="httpverb") String httpverb,
                                 @Param(name="jsonResponse") String jsonResponse) {
        System.out.print("Executing getExcelTestData :");
        System.out.println("url is :" + url + " and httpverb is :" + httpverb);
        System.out.println("jsonResponse is " + jsonResponse);
    }
}
