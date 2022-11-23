package demoqa

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


import java.text.SimpleDateFormat
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class soal1 {
	@Given("User navigate to user demoqa website")
	def goto_url() {
		WebUI.openBrowser('https://demoqa.com/select-menu')
		WebUI.maximizeWindow()
		WebUI.delay(2)
	}

	@When("User in select menu page")
	def user_selectmenu_page() {
		WebUI.click(findTestObject('soal1/option/div_Select Option'))
		WebUI.scrollToElement(findTestObject('soal1/option/Page_ToolsQA/div_A root option'), 0)
	}

	@And("User choose select value Another root option")
	def select_valuemenu() {
		WebUI.click(findTestObject('soal1/option/Page_ToolsQA/div_Another root option'))
	}

	@And("User choose select one Other")
	def select_other() {
		WebUI.click(findTestObject('soal1/title/div_Select Title'))
		WebUI.scrollToElement(findTestObject('soal1/title/div_Prof'), 0)
		WebUI.click(findTestObject('soal1/title/div_Other'))
	}

	@And("User choose old style select menu Aqua")
	def select_aqua() {
		WebUI.selectOptionByValue(findTestObject('soal1/menu/btn_color'), '10', false)
	}

	@And("User choose multi select drop down all color")
	def select_allcolor() {
		WebUI.scrollToElement(findTestObject('soal1/multiselect/verif_multiselect'), 0)
		WebUI.click(findTestObject('soal1/multiselect/div_Select'))
		WebUI.click(findTestObject('soal1/multiselect/Page_ToolsQA/div_Black'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('soal1/multiselect/Page_ToolsQA/div_Blue'))
		WebUI.click(findTestObject('soal1/multiselect/Page_ToolsQA/div_Red'))
	}

	@Then ("User success input all select menu")
	def success_selectmenu() {
		WebUI.closeBrowser()
	}
}