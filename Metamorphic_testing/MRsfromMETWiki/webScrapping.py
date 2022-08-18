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

    return driver.find_element(By.LINK_TEXT, link_name).get_attribute('href')

def FindElementenbyXpath(xpath):

    return driver.find_element('xpath', xpath)

def FindElementsbyXpath(xpath):

    return driver.find_elements('xpath', xpath)

def WebElementInfoToList(webElement):
    
    finalList = []
    for element in webElement:
        finalList.append(element.text)

    return finalList

def KeyWordsExtractor(keywordsList):
    keywordsFinalList = []
    keywordsAuxList = []
    for keyword in keywordsList:
        
        if(keyword.find('Keywords :') != -1):
            keyw = keyword.replace('Keywords :','N/A')
            keywAux = keyw.split(' ')
            keywordsAuxList.append(keywAux)
    
    for keywordAux in keywordsAuxList:
        if(keywordAux == 1):
            keywordsFinalList.append(keywordAux)
        else:
            keywordAux.pop(0)
            if('' in keywordAux):
                keywordAux.pop(keywordAux.index(''))
            keywordsFinalList.append(keywordAux)
    # print('----', keywordsFinalList, len(keywordsFinalList))
    return keywordsFinalList

def FunctionalityNumMRsExtractor(functionalityList):
    
    functionalityFinalList = []
    numMRsFinalList = []
    functionalityAuxList = []
    numMRsAuxList = []

    for i in range(len(functionalityList)):
        if i % 2 == 0:
            print(functionalityList[i])
            functionalityAuxList.append(functionalityList[i])
        else:
            numMRsAuxList.append(functionalityList[i])
    
    for description in functionalityAuxList:
        if(description.find('Functionality : ') != -1):
            desc = description.replace('Functionality : ','')
        if(desc.find('\n') != -1):
            desc = desc.replace('\n', ' ')
        if(desc.find('  ') != -1):
            desc = desc.replace('  ', '')
        if(desc.find('.') != -1):
            desc = desc.replace('.', '')
        desc = desc.rstrip()
        desc = desc.lstrip()
        functionalityFinalList.append(desc)

    print(functionalityFinalList)
    # print(functionalityAuxList)
    print(len(functionalityFinalList))


driver = InitWebDriver()

# driver.get('http://www.metwiki.net/')

# categories = ['number', 'machine', 'algorithm', 'geometry', 'opt', 'calculus', 'bio', 'graph']

# mainDic = dict()

# for cat in categories:

#     xpath_CategoryName = '//div[@class="part"]/div[@class="' + cat + '"]/div[@class="zi"]'
#     xpath_CategoryLink = '//div[@class="part"]/div[@class="' + cat + '"]/a'
    
#     categoryName_aux = FindElementenbyXpath(xpath_CategoryName)
#     categoryLink_aux = FindElementenbyXpath(xpath_CategoryLink)

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

pragramName_xpath = '//ul[@class="repo-list"]/li[@class="repo-list-item"]/h3'

programNames = FindElementsbyXpath(pragramName_xpath)
programNamesList = WebElementInfoToList(programNames)

# print(programNamesList)

programLinks = []

for i in programNamesList:
    link = GetLinksbyLinkText(i)
    programLinks.append(link)
# print(programLinks)

keywords_xpath = '//ul[@class="repo-list"]/li[@class="repo-list-item"]/div[@class="repo-list-all"]/div[@class="repo-list-left"]/div[@class="repo-list-tags"]'
keywordsElemets = FindElementsbyXpath(keywords_xpath)
keywordsList = WebElementInfoToList(keywordsElemets)

keywordsList = KeyWordsExtractor(keywordsList)
# print(keywordsList, len(keywordsList))

functionalityDesprition_xpath = '//ul[@class="repo-list"]/li[@class="repo-list-item"]/div[@class="repo-list-all"]/div[@class="repo-list-left"]/div[@class="repo-list-description"]'
functionalityElements = FindElementsbyXpath(functionalityDesprition_xpath)
functionalityList = WebElementInfoToList(functionalityElements)
FunctionalityNumMRsExtractor(functionalityList)
# print(functionalityList)
