'''
scrapy runspider grupom.py -o ofertas-grupom.json
'''
import scrapy


class GrupomSpider(scrapy.Spider):
    
    name = "grupom_spider"
    start_urls = ['https://www.groupon.com.br/']

    def parse(self, response):
        SET_SELECTOR = 'figure.deal-card'
        for promocoes in response.css(SET_SELECTOR):

            LINK_SELECTOR = '.deal-card a::attr("href")'
            TITLE_SELECTOR = '.deal-title::text'
            MERCHANT_SELECTOR = '.merchant-name::text'
            LOCATION_SELECTOR = '.deal-location::text'
            ORIGINAL_PRICE_SELECTOR = '.original-price::text'
            CURRENT_PRICE_SELECTOR = '.current-price::text'

            yield {
                'link': promocoes.css(LINK_SELECTOR).extract_first().strip(),
                'name': promocoes.css(TITLE_SELECTOR).extract_first().strip(),
                'merchant': promocoes.css(MERCHANT_SELECTOR).extract_first().strip(),
                'location': promocoes.css(LOCATION_SELECTOR).extract_first().strip(),
                'original-price': promocoes.css(ORIGINAL_PRICE_SELECTOR).extract_first(),
                'current-price': promocoes.css(CURRENT_PRICE_SELECTOR).extract_first(),
            }
