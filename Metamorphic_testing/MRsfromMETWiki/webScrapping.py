from selenium.webdriver.common.by import By
from selenium import webdriver
from shutil import which
import json


def InitWebDriver():

    from selenium.webdriver.chrome.options import Options

    CHROMEPATH = which('chromedriver')
    op = webdriver.ChromeOptions()
    op.add_argument('headless')
    driver = webdriver.Chrome(options=op)
    return driver

def GetLinksbyLinkText(link_name):

    return driver.find_elements(By.LINK_TEXT, link_name).get_attribute('href')

def FindElementenbyXpath(xpath):

    return driver.find_element('xpath', xpath)

def FindElementsbyXpath(xpath):

    return driver.find_elements('xpath', xpath)

driver = InitWebDriver()

# driver.get('http://www.metwiki.net/')

# categories = ['number', 'machine', 'algorithm', 'geometry', 'opt', 'calculus', 'bio', 'graph']

# mainDic = dict()

# for cat in categories:

#     xpath_CategoryName = '//div[@class="part"]/div[@class="' + cat + '"]/div[@class="zi"]'
#     xpath_CategoryLink = '//div[@class="part"]/div[@class="' + cat + '"]/a'
    
#     categoryName_aux = FindElementensbyXpath(xpath_CategoryName)
#     categoryLink_aux = FindElementensbyXpath(xpath_CategoryLink)

#     categoryName = categoryName_aux.text
#     categoryLink = categoryLink_aux.get_attribute('href')

#     auxDic = { cat: {'name': categoryName, 'link_'+ cat: categoryLink}}
#     mainDic.update(auxDic)

# mainDic['number'].update({'program': {'program_name': 'asdf', 'key_words': [1,2,3,4,5], 'asdfa': 'dfadf'}})
# # mainDic.update(mainDic2)
# print(mainDic['number'].keys())
# print(mainDic)

# # with open("sample.json", "w") as outfile:
#     # json.dump(mainDic, outfile, indent = 4)

# json_object = json.dumps(mainDic, indent = 4) 
# print(json_object)

driver.get('http://www.metwiki.net/viewDomainProgram?domainName=Numerical%20program')

xpath = '//ul[@class="repo-list"]/li[@class="repo-list-item"]/h3'

a = FindElementsbyXpath(xpath)

for i in a:
    print(i.text)