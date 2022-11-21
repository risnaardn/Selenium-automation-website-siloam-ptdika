package com.juaracoding.siloam.step_definitions;


import com.juaracoding.siloam.pages.LoginSiloam;
import com.juaracoding.siloam.pages.UploadDataPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertTrue;

public class TestUploadData_Valid {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private UploadDataPage uploadDataPage = new UploadDataPage();

    private LoginSiloam loginSiloam = new LoginSiloam();

    public TestUploadData_Valid() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //UPLOAD DATA FASKES AWAL VALID
    @When("Klik button Foto Faskes Awal untuk upload foto dokumen")
    public void klik_uploadfaskesawal() {
        uploadDataPage.clickUploadDataFaskesAwal();
        extentTest.log(LogStatus.PASS, "Klik button Foto Faskes Awal untuk upload foto dokumen");
    }
    @And("Klik button choose File")
    public void choose_file() {
        String path = System.getProperty("user.dir") + "\\src\\main\\DataUpload\\FaskesAwal.png";
        uploadDataPage.fileUpload(path);
        extentTest.log(LogStatus.PASS, "Klik button choose File");
    }
    @And("Mengambil data foto")
    public void data_foto() {
        uploadDataPage.clickSave();
        extentTest.log(LogStatus.PASS, "Mengambil data foto");
    }
    @And("Klik simpan untuk menyimpan foto")
    public void btn_simpan_data() {
        uploadDataPage.clickSave();
        extentTest.log(LogStatus.PASS, "Klik simpan untuk menyimpan foto");
    }

    @And("Keluar dari pop up upload foto faskes awal")
    public void keluar_daripopup() {
        uploadDataPage.clickKeluar();
        extentTest.log(LogStatus.PASS, "Keluar dari pop up upload foto faskes awal");
    }

    //UPLOAD DATA FASKES TUJUAN

    @When("Klik button Foto Faskes Awal untuk upload foto dokumen")
    public void klik_uploadfaskesawal() {
        uploadDataPage.clickUploadDataFaskesAwal();
        extentTest.log(LogStatus.PASS, "Klik button Foto Faskes Awal untuk upload foto dokumen");
    }
    @And("Klik button choose File")
    public void choose_file() {
        String path = System.getProperty("user.dir") + "\\src\\main\\DataUpload\\FaskesAwal.png";
        uploadDataPage.fileUpload(path);
        extentTest.log(LogStatus.PASS, "Klik button choose File");
    }
    @And("Mengambil data foto")
    public void data_foto() {
        uploadDataPage.clickSave();
        extentTest.log(LogStatus.PASS, "Mengambil data foto");
    }
    @And("Klik simpan untuk menyimpan foto")
    public void btn_simpan_data() {
        uploadDataPage.clickSave();
        extentTest.log(LogStatus.PASS, "Klik simpan untuk menyimpan foto");
    }

    @And("Keluar dari pop up upload foto faskes awal")
    public void keluar_daripopup() {
        uploadDataPage.clickKeluar();
        extentTest.log(LogStatus.PASS, "Keluar dari pop up upload foto faskes awal");
    }





}
