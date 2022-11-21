package com.juaracoding.siloam.pages;

import com.juaracoding.siloam.drivers.DriverSingleton;
import com.juaracoding.siloam.utils.Constants;
import com.juaracoding.siloam.utils.Utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import static com.juaracoding.siloam.utils.Utils.*;

public class UploadDataPage {
    private WebDriver driver;
    private WebElement sendKeyStatus;

    public UploadDataPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    WebElement uploadDocumentTitle;

    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    WebElement ttdDigitalTitle;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")
    WebElement previewImgAwal;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/img[1]")
    WebElement previewImgTujuan;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[3]/tr[1]/td[1]/div[1]/img[1]")
    WebElement previewImgTTD;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    WebElement uploadImgAwal;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    WebElement uploadImgTujuan;

    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    WebElement uploadImgTTD;

    @FindBy(xpath = "//h4[@class='modal-title']")
     WebElement modalTitle;

    @FindBy(xpath = "//img[@id='previewing']")
    WebElement previewImgModal;

    @FindBy(xpath = "//div[@id='message']")
    WebElement msgErrorSave;

    @FindBy(xpath = "//p[@id='error']")
    WebElement msgErrorChooseFile;

    @FindBy(xpath = "//span[@id='error_message']")
    WebElement noteErrorChooseFile;

    @FindBy(xpath = "//input[@id='file']")
    WebElement file;

    @FindBy(xpath = "//button[@id='btnSave']")
    WebElement save;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancel;

    @FindBy(xpath = "/html/body/div[7]/div/div[3]/div/button")
    WebElement keluar;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
     WebElement ok;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
   WebElement selanjutnya;

    public void clickUploadDataFaskesAwal() {
        uploadImgAwal.click();
    }

    public void fileUpload(String path) {
        file.sendKeys(path);
    }

    public void clickSave() {
        save.click();
    }

    public String txtTitleUploadDocument() {
        return  uploadDocumentTitle.getAttribute("Upload Document");
    }

    public void clickKeluar() {
        keluar.click();
    }
}
