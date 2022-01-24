from nltk.corpus import wordnet

syns = wordnet.synsets("house")

print(syns[0].name())
print(syns[0].lemmas()[0].name())
print(syns[0].definition())
print(syns[0].examples())


synonyms = []
antonyms = []

for syn in wordnet.synsets("poor"):
    for l in syn.lemmas():
        synonyms.append(l.name())
        if l.antonyms():
            antonyms.append(l.antonyms()[0].name())

print(synonyms)
print(antonyms)
