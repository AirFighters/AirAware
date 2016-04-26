# -*- coding: utf-8 -*-

# Define here the models for your scraped items
#
# See documentation in:
# http://doc.scrapy.org/en/latest/topics/items.html

import scrapy


class DaqMedhelpItem(scrapy.Item):
    """
    title = scrapy.Field()
    subItems = []
    """
    pass

class DaqMedhelpSubItem(scrapy.Item):
    """
    text = scrapy.Field()
    date = scrapy.Field()
    location = scrapy.Field()
    """
    pass
