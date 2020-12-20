#time:48ms;memory:14.8MB
class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        s=list(s)
        counts=Counter(s)
        stack=list()
        for char in s:
            if char in stack:
                counts[char]-=1            
            else:
                while stack and stack[-1]>char:
                    if counts[stack[-1]]==1:
                        break
                    else:
                        counts[stack.pop()]-=1
                stack.append(char)
        return ''.join(stack)