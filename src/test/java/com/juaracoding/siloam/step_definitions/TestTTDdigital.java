package com.juaracoding.siloam.step_definitions;

import com.juaracoding.siloam.pages.LoginSiloam;

import com.juaracoding.siloam.pages.TTDDigital;
import com.juaracoding.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;

public class TestTTDdigital {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private TTDDigital ttdDigital = new TTDDigital();

    private LoginSiloam loginSiloam = new LoginSiloam();

    public TestTTDdigital() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // Test case masuk ke halaman new (return sales)

    @When("TCC.SILOAM.063 Browser menampilkan halaman home siloam")
    public void browser_menampilkan_halaman_home_siloam() {
        driver.get(Constants.URL);
        loginSiloam.login("D6200927", "1997-10-23");
        loginSiloam.setBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Browser menampilkan halaman home siloam");

    }

    @And("TCC.SILOAM.063 Klik menu input")
    public void klik_menu_input() {
        ttdDigital.klikMenuInput();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Klik menu input");
    }


    @Then("TCC.SILOAM.063 Menampilkan halaman input")
    public void get_txt_form_menu() {
        ttdDigital.getTxtRFormInput();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Menampilkan halaman input");
    }

    // input data
    @When("Menampilkan halaman input")
    public void menampilkan_inpt() {
         ttdDigital.getTxtRFormInput();
        extentTest.log(LogStatus.PASS, "Menampilkan halaman input");

    }

    @And("Input nama")
    public void klik_menu_input_nama() {
        ttdDigital.setInputNama("Seonji");
        extentTest.log(LogStatus.PASS, "Input nama");
    }


    @And("Input nomor bpjs")
    public void klik_menu_input_bpjs() {
        ttdDigital.setInputNomorBPJS("3124342353099");
        extentTest.log(LogStatus.PASS, "Input nomor bpjs");
    }

    @And("input nomor ktp")
    public void klik_menu_input_ktp() {
        ttdDigital.setInputNomotKTP("3314537978300787");
        extentTest.log(LogStatus.PASS, "input nomor ktp");
    }


    @And("input alamat")
    public void klik_menu_input_alamat() {
        ttdDigital.setInputAlamat("Jl Jati Asih");
        extentTest.log(LogStatus.PASS, "input nomor ktp");
    }

    @And("input kota ktp")
    public void klik_menu_input_kotaktp() {
        ttdDigital.setInputKotaKTP("KOTA BEKASI");
        extentTest.log(LogStatus.PASS, "input kota ktp");
    }

    @And("input faskes awal")
    public void klik_menu_input_faskesawal() {
        ttdDigital.setInputFaskesAwal("Bekasi barat");
        extentTest.log(LogStatus.PASS, "input faskes awal");
    }

    @And("input faskes tujuan")
    public void klik_menu_input_faskestujuan() {
        ttdDigital.setInputFaskesTujuan("Clinic Jatimakmur || Kota Bekasi");
        extentTest.log(LogStatus.PASS, "input faskes tujuan");
    }

    @And("klik button simpan data")
    public void btn_simpan_data() {
        ttdDigital.setBtnSimpanData();
        extentTest.log(LogStatus.PASS, "klik button simpan data");
    }

    @Then("masuk halaman upload data")
    public void halaman_upload_data() {
        ttdDigital.getUploadData();
        extentTest.log(LogStatus.PASS, "masuk halaman upload data");
    }

}
