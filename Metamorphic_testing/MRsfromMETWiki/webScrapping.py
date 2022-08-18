# from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium import webdriver
from shutil import which


def InitWebDriver():

    from selenium.webdriver.chrome.options import Options

    CHROMEPATH = which('chromedriver')
    op = webdriver.ChromeOptions()
    op.add_argument('headless')
    driver = webdriver.Chrome(options=op)
    return driver

driver = InitWebDriver()


driver.get('http://www.metwiki.net/viewDomainProgram?domainName=Numerical%20program')
movies_names = driver.find_elements('xpath','//ul[@class="repo-list"]/li[@class="repo-list-item"]/h3[@class="repo-list-name"]')
# movies_names = driver.find_elements('xpath','//ul[@class="a-text-left mojo-field-type-title"]/a[@class="a-link-normal"]')

# print(movies_names)
movie_name_list = []
d = []

for movie in range(len(movies_names)):
    movie_name_list.append(movies_names[movie].text)
print(movie_name_list)

for movie_name_element in movie_name_list:
    d.append(driver.find_element(By.LINK_TEXT, movie_name_element).get_attribute('href'))

continue_link = driver.find_element(By.LINK_TEXT, movie_name_list[0]).get_attribute('href')
print(len(d), len(movie_name_list))


# products=[] #List to store name of the product
# prices=[] #List to store price of the product
# ratings=[] #List to store rating of the product
# driver.get('http://www.metwiki.net/')

# driver.execute_script() 

# EX:- driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")
# ## Above Code Will Scrool Till The Bottom of Web Page
# page_height = driver.execute_script("return document.body.scrollHeight")
# for value in range(0,page_height):
#  driver.execute_script(f"window.scrollTo(0, {value});")
## Above Code Will Smooth Scrolling Till The End

# URL = 'http://www.metwiki.net/'
# page = requests.get(URL)

# soup = BeautifulSoup(page.content, 'html.parser')
# print(page.text)

# htmlelement= driver.find_element_by_tag_name('html')
# htmlelement.send_keys(Keys.END)

# programes = ['Numerical program', 'Machine learning', 'Algorithm', 'Web application', 'Optimization algorithms', 'Bioinformatics', 'Graph and Image']
# driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")
# button = driver.find_element('name',programes[0]).click()

