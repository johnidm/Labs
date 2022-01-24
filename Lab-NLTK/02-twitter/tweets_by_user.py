# https://apigee.com/embed/console/twitter
# https://github.com/ckoepp/TwitterSearch


import sys
import re
import json

from TwitterSearch import *


def get_users(tweet_text):
    PATTERN = '@\w+'
    matched = re.findall(PATTERN, tweet_text)
    return matched

def get_hashtag(tweet_text):
    PATTERN = '#\w+'
    return re.findall(PATTERN, tweet_text)

def get_urls(tweet_text):
    PATTERN = '(?:(?:(?:ftp|http)[s]*:\/\/|www\.)[^\.]+\.[^ \n]+)'
    return re.findall(PATTERN, tweet_text)


try:
    user = sys.argv[1] 
    tuo = TwitterUserOrder(user)

    ts = TwitterSearch(
        consumer_key = 'uIp9sOygqLV2YodNGEdQ4KQzG',
        consumer_secret = 'UR88YXki9sbYG9sbYir3lxCulNrT7kFTLLRDL5dYt0NsMDqJlw',
        access_token = '1520322540-D9VmEzIpzySesdeiALSosWru326mgUEhgtYepSF',
        access_token_secret = '9ei6XjrYqGL4vkmrvfe10yqDtALAIXgWJICulPD8gOP8b'
    )

    users = []
    hashtags = []
    links = []
    
    for tweet in ts.search_tweets_iterable(tuo):
        users += get_users(tweet['text'])
        hashtags += get_hashtag(tweet['text'])
        links += get_urls(tweet['text'])
    
    data = {
        'frequency': {
            'mentioned_users': {c: users.count(c) for c in users},
            'hashtags': {c: hashtags.count(c) for c in hashtags},
        },
        'data': {
            'mentioned_users': users,
            'hashtags': hashtags,
            'referenced_links': links,
        }
    }

    with open('tweets.json', 'w') as f:
        f.write(json.dumps(data))        

except TwitterSearchException as e:
    print(e)
