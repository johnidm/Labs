from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize

example_sentence = '''
Controlled vocabularies provide a way to organize knowledge for subsequent retrieval. They are used in subject indexing schemes, subject headings, thesauri, taxonomies and other forms of knowledge organization systems. Controlled vocabulary schemes mandate the use of predefined, authorised terms that have been preselected by the designers of the schemes, in contrast to natural language vocabularies, which have no such restriction.'''

stop_words = stopwords.words('english')

words = word_tokenize(example_sentence)

filtered_sentence = [ w for w in words if not w in stop_words]

print(filtered_sentence)