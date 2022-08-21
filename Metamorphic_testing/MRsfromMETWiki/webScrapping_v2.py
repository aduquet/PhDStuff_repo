from selenium.webdriver.common.by import By
from selenium import webdriver
from shutil import which
import shortuuid
import json


def InitWebDriver():

    from selenium.webdriver.chrome.options import Options

    CHROMEPATH = which('chromedriver')
    op = webdriver.ChromeOptions()
    op.add_argument('headless')
    # driver = webdriver.Chrome(options=op)
    driver = webdriver.Chrome(CHROMEPATH)

    return driver


driver = InitWebDriver()

driver.get('file:///Users/alduck/Documents/PhDStuff_repo/Metamorphic_testing/MRsfromMETWiki/html/ViewDetail.html')

print(driver.find_element('xpath','//div[@class="all"]/div[@class="hero-unit"]/div[@id="editor"]/h3[@class="attr1"]').text)

# driver.find_element(By.XPATH, '//div=[@class="part"]/div=[@class="number"]/a=[@href="http://www.metwiki.net/viewDomainProgram?domainName=Numerical%20program"]').click()
# driver.find_element(By.LINK_TEXT, 'GetMid').click()

# driver.find_element(By.LINK_TEXT, 'Login').click()

# driver.find_element(By.LINK_TEXT, 'Sign In').click()



