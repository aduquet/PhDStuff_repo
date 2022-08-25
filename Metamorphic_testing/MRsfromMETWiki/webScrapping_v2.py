from ast import main
from selenium.webdriver.common.by import By
from selenium import webdriver
from shutil import which
import glob as gl
import shortuuid
import pathlib
import json
import os

def InitWebDriver():

    from selenium.webdriver.chrome.options import Options

    CHROMEPATH = which('chromedriver')
    op = webdriver.ChromeOptions()
    op.add_argument('headless')
    driver = webdriver.Chrome(options=op)
    # driver = webdriver.Chrome(CHROMEPATH)

    return driver

# driver.find_element(By.LINK_TEXT, 'Sign In').click()
# driver.find_element(By.LINK_TEXT, 'GetMid').click()
# driver.find_element(By.LINK_TEXT, 'Login').click()

# htmlPath = str(pathlib.Path().absolute()) + '/html'
# htmlCategoryDir = htmlPath + '/*'
# htmlCategoryDir = gl.glob(htmlCategoryDir)

# for categoryDir in htmlCategoryDir:
#     programCateg = categoryDir + '/*'
#     programCategPath = gl.glob(programCateg)
#     print(programCategPath)
# print(htmlPath)
# print(htmlProgDir)

mainDic = dict()

driver = InitWebDriver()
# driver.get('file:///Users/alduck/Documents/PhDStuff_repo/Metamorphic_testing/MRsfromMETWiki/html/Numerical_program/GetMid/ViewDetail.html')
driver.get('file:///Users/alduck/Documents/PhDStuff_repo/Metamorphic_testing/MRsfromMETWiki/html/Numerical_program/DeterminantComputations/ViewDetail.html')
# aux = driver.find_elements('xpath','//div[@class="all"]/div[@class="hero-unit"]/div[@id="editor"]/h3[@class="attr1"]')
# aux = driver.find_elements('xpath','//div[@class="all"]/div[@class="hero-unit"]/div[@id="editor"]/code[@class="attr2"]')
infoEditor = driver.find_elements('xpath','//div[@class="all"]/div[@class="hero-unit"]/div[@id="editor"]')
infoEditorList = []
for i in infoEditor:
    infoEditorList.append(i.text)

infoEditorList = infoEditorList[0].split('\n')
print(infoEditorList)

mainDic = {'ref': 'NaN', 'MRs': 'NaN'}

# for i in range(0, len(infoEditorList)):

# get Positions
indexMRpositions = []

for i in infoEditorList:
    if(i.find('Name: ') != -1 ):
        indexName = infoEditorList.index(i)
    if(i.find('Domain: ') != -1 ):
        indexDomain = infoEditorList.index(i)
    if(i.find('Functionality: ') !=-1 ):
        indexFunctionality = infoEditorList.index(i)
    if(i.find('Input: ') != -1 ):
        indexInput = infoEditorList.index(i)
    if(i.find('Output: ') != -1 ):
        indexOutput = infoEditorList.index(i)
    if(i.find('Reference') != -1 ):
        indexReference = infoEditorList.index(i)
    if(i.find('MR') != -1 ):
        indexMRpositions.append(infoEditorList.index(i))


print(indexName, indexDomain, indexFunctionality, indexInput, indexOutput, indexReference, indexMRpositions)

# ------ #
for i in infoEditorList:
    if(i.find('Name: ') !=-1 ):
        name = i.replace('Name: ', '')

        auxDic = {'name': name}
        mainDic.update(auxDic)
    
    if(i.find('Domain: ') !=-1):

        domain = i.replace('Domain: ', '')

        auxDic = {'domain': domain}
        mainDic['name'][name].update(auxDic)

    if(i.find('Functionality: ') !=-1):

        functionality = i.replace('Functionality: ', '')

        auxDic = {'functionality': functionality}
        mainDic['name'][name].update(auxDic)

    if(i.find('Domain: ') !=-1):

        domain = i.replace('Domain: ', '')

        auxDic = {'domain': domain}
        mainDic['name'][name].update(auxDic)

    if(i.find('Domain: ') !=-1):

        domain = i.replace('Domain: ', '')

        auxDic = {'domain': domain}
        mainDic['name'][name].update(auxDic)


print(mainDic)


# auxList = WebElementInfoToList(aux)

# print(auxList) 

