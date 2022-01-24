from nltk.stem import PorterStemmer
from nltk.tokenize import word_tokenize

ps = PorterStemmer()

text = "It is very important to be pythonly while you are pythoning with python. All pythoners."

words = word_tokenize(text)

for w in words:
    print(ps.stem(w))
