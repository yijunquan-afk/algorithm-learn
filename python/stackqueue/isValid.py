class Solution:
    def isValid(self, s: str) -> bool:
        str_stack = []
        for c in s:
            if c in ['(', '{', '[']:
                str_stack.append(c)
            elif c == ')':
                if len(str_stack) == 0:
                    return False
                temp =str_stack.pop()
                if temp != '(':
                    return False
            elif c == '}':
                if len(str_stack) == 0:
                    return False
                temp =str_stack.pop()
                if temp != '{':
                    return False
            elif c == ']':
                if len(str_stack) == 0:
                    return False
                temp =str_stack.pop()
                if temp != '[':
                    return False    
        if len(str_stack) > 0:
            return False
        return True      
        