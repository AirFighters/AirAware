import scrapy

class DaqMedhelpSpider(scrapy.Spider):
    name = 'daqmedhelp'
    start_urls = ['http://www.medhelp.org/forums/Allergy/show/67']
    max_requests = 1

    def parse(self, response):
        for href in response.css('.subject_summary a::attr(href)'):
            tmp_url = response.urljoin(href.extract())
            yield scrapy.Request(tmp_url, callback=self.parse_subject)
            if max_requests <= 0:
                break

    def parse_subject(self, response):
        """
        rez = []
        comments = []
        for elem in response.css('.medhelp_forum .post_message_text ' +
                                 '.frm_post_msg ' +
                                 '.KonaBody::text').extract():
            comments.append(elem)
        for elem in response.css
        """
        yield {
            'comments': response.css('.medhelp_forum .post_message_text ' +
                                     '.frm_post_msg ' +
                                     '.KonaBody::text').extract(),
        }
