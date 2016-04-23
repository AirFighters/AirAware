import scrapy

class DaqSpider(scrapy.Spider):
    name = 'daq'
    allowed_domains = ["http://www.medhelp.org"]
    start_urls = ["http://www.medhelp.org/search?utf8=%E2%9C%93&query=astma&camp=top_nav_search"]

    def parse(self, response):
        print("*******" + response.url)
