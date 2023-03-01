import requests
from bs4 import BeautifulSoup
def webscraper():
    url=requests.get("https://news.ycombinator.com/")
    soup = BeautifulSoup(url.content , 'html.parser')
    file = open("sample.txt","w")
    file.write(soup.text)
    # lines = []
    # with open("sample.txt","r") as f:
    #     line=f.readline()
    #     lines.append(line)
    # print(lines)
    x=open("sample.txt")
    for line in x:
        if line.startswith(range(1,10)):
            print(line)

webscraper()
