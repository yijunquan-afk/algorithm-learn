class Node:
    def __init__(self):
        self.son = {}
        self.end = False

class Trie:

    def __init__(self):
        self.root = Node()

    def insert(self, word: str) -> None:
        cur = self.root
        for letter in word:
            if letter not in cur.son:
                cur.son[letter] = Node()
            cur = cur.son[letter]
        cur.end = True

    def find(self, word: str) -> bool:
        cur = self.root
        for letter in word:
            if letter not in cur.son:
                return 0
            cur = cur.son[letter]
        return 2 if cur.end else 1

    def search(self, word: str) -> bool:
        return self.find(word) == 2

    def startsWith(self, prefix: str) -> bool:
        return self.find(prefix) != 0


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)