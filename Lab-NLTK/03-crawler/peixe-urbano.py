'''
scrapy runspider peixe-urbano.py -o promocoes-peixe-urbano.json
'''
import scrapy


class PeixeUrbanoSpider(scrapy.Spider):

    name = "peixe_urbano_spider"
    start_urls = ['https://www.peixeurbano.com.br/']
        
    def parse(self, response):
        
        SET_SELECTOR = '.box-section'
        for item in response.css(SET_SELECTOR):
            for promocoes in item.css('.other_deals'):
                LINK_SELECTOR = 'a.deal-link::attr("href")'
                
                TITLE_SELECTOR = '.deal-text h3.title_old span::text'
                MERCHANT_SELECTOR = '.info-partner .partner-name::text'
                LOCATION_SELECTOR = '.info-partner .deal-local-neighborhood::text'
                ORIGINAL_PRICE_SELECTOR = '.price_box .price_from::text'
                CURRENT_PRICE_SELECTOR = '.sale_price::text'

                yield {
                    'link': promocoes.css(LINK_SELECTOR).extract_first(),
                    'name': promocoes.css(TITLE_SELECTOR).extract_first(),
                    'merchant': promocoes.css(MERCHANT_SELECTOR).extract_first(),
                    'location': promocoes.css(LOCATION_SELECTOR).extract_first(),
                    'original-price': promocoes.css(ORIGINAL_PRICE_SELECTOR).extract_first(),
                    'current-price': promocoes.css(CURRENT_PRICE_SELECTOR).extract_first(),
                }
